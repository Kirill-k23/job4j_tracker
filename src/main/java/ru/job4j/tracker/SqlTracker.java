package ru.job4j.tracker;

import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class SqlTracker implements Store {

    private Connection cn;

    public SqlTracker() {
        init();
    }

    public SqlTracker(Connection cn) {
        this.cn = cn;
    }

    private void init() {
        try (InputStream in = SqlTracker.class.getClassLoader()
                .getResourceAsStream("app.properties")) {
            Properties config = new Properties();
            config.load(in);
            Class.forName(config.getProperty("driver-class-name"));
            cn = DriverManager.getConnection(
                    config.getProperty("url"),
                    config.getProperty("username"),
                    config.getProperty("password")
            );
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    @Override
    public Item add(Item item) {
        try (PreparedStatement pr = cn.prepareStatement("insert into items(name, created) values(?, ?)",
                Statement.RETURN_GENERATED_KEYS)) {
            pr.setString(1, item.getName());
            pr.setTimestamp(2, Timestamp.valueOf(item.getCreated()));
            pr.execute();
            try (ResultSet rs = pr.getGeneratedKeys()) {
                while (rs.next()) {
                    item.setId(rs.getInt(1));
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return item;
    }

    @Override
    public boolean replace(int id, Item item) {
        boolean rsl = false;
        try (PreparedStatement statement = cn.prepareStatement(
                "update items set name = ?, created = ? where id = ?"
        )) {
            statement.setString(1, item.getName());
            statement.setTimestamp(2, Timestamp.valueOf(item.getCreated()));
            statement.setInt(3, id);
            rsl = statement.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rsl;
    }

    @Override
    public void delete(int id) {
        try (PreparedStatement pr = cn.prepareStatement(
                "delete from items where id = ?"
        )) {
            pr.setInt(1, id);
            pr.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Item> findAll() {
        List<Item> list = new ArrayList<>();
        try (PreparedStatement pr = cn.prepareStatement("select * from items")) {
            try (ResultSet rs = pr.executeQuery()) {
                while (rs.next()) {
                    list.add(new Item(
                            rs.getInt("id"),
                            rs.getString("name"),
                            rs.getTimestamp("created").toLocalDateTime()
                    ));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public List<Item> findByName(String key) {
        List<Item> list = new ArrayList<>();
        try (PreparedStatement pr = cn.prepareStatement("select * from items where name = ?")) {
            pr.setString(1, key);
            try (ResultSet rs = pr.executeQuery()) {
                while (rs.next()) {
                    list.add(new Item(
                            rs.getInt("id"),
                            rs.getString("name"),
                            rs.getTimestamp("created").toLocalDateTime()
                    ));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public Item findById(int id) {
        Item item = new Item();
        try (PreparedStatement ps = cn.prepareStatement("select * from items where id = ?")) {
            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    item.setId(id);
                    item.setName(rs.getString("name"));
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return item;
    }

    @Override
    public void close() throws Exception {
        if (cn != null) {
            cn.close();
        }
    }
}
