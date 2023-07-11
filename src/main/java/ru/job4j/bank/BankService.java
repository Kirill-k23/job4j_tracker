package ru.job4j.bank;

import ru.job4j.bank.Account;
import ru.job4j.bank.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Класс описывает модель работы банковской системы.
 * @author KIRILL KLEYN
 *  * @version 1.0
 */

public class BankService {
    /**
     * Хранение данных о пользователях системы производится в коллекции типа HashMap
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод добавляет нового пользователя в систему.
     * Если такой уже есть добавление не происходит
     * @param user пользователь.
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    /**
     * Метод удаляет пользователя из коллекции
     * @param passport паспорт пользователя
     * @return возврощает true, если удаление произошло, false если нет
     */

    public boolean deleteUser(String passport) {
        return users.remove(new User(passport, "")) != null;
    }

    /**
     * Метод добавляет новый аккаунт, если если пользователь уже есть и ещё нет счёта в системе.
     * @param passport паспорт пользователя
     * @param account новый аккаут
     */

    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> list = users.get(user);
            if (!list.contains(account)) {
                list.add(account);
            }
        }
    }

    /**
     * Метод ищет пользователя по номеру паспорта
     * @param passport паспорт пользователя
     * @return возвращает пользователя User, если его нет возвращает null.
     */

    public User findByPassport(String passport) {
        for (User user : users.keySet()) {
            if (passport.equals(user.getPassport())) {
                return user;
            }
        }
        return null;
    }

    /**
     * Метод ищет пользователя по номеру паспорта и реквизиту аккаута
     * @param passport паспорт пользоввателя
     * @param requisite реквизиты аккаута
     * @return возвращает аккаунт account если он есть или null если его нет
     */

    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> list = users.get(user);
            for (Account account : list) {
                if (requisite.equals(account.getRequisite())) {
                    return account;
                }
            }
        }
        return null;
    }

    /**
     * Метод переводит деньги с аккаута пользователя на аккаут другого пользователя.
     * @param srcPassport паспорт пользователя отправителя.
     * @param srcRequisite реквизиты аккаута пользователя отправителя.
     * @param destPassport паспорт пользователя получателя.
     * @param destRequisite реквизиты аккаута пользователя получателя.
     * @param amount сумма перевода
     * @return возвращает true если перевод произошёл, false если нет.
     */

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        Account destAccount = findByRequisite(destPassport, destRequisite);
        if (srcAccount != null && destAccount != null && srcAccount.getBalance() >= amount) {
            srcAccount.setBalance(srcAccount.getBalance() - amount);
            destAccount.setBalance(destAccount.getBalance() + amount);
            return true;
        }
        return false;
    }

    /**
     * Метод принимает пользователя user и возвращает список аккаутов.
     * @param user пользователь
     * @return список аккаутов этого пользователя
     */

    public List<Account> getAccounts(User user) {
        return users.get(user);
    }
}
