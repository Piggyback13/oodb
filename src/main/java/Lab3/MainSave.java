/*package Lab3;

import java.util.ArrayList;
import java.util.List;

public class MainSave {

    public static void main(String[] args) {

        // Создаем объект МТС
        MTS mts = new MTS();

        // Создаем объекты - клиенты банка
        User user1 = new User("Иван","Иванов","","");
        User user2 = new User("Петр","Петров","","");

        // Добавляем объекту client1 расчетный счет
        MTSAccount account = new MTSAccount(1299876);
        List<MTSAccount> accounts = new ArrayList<>();
        accounts.add(account);
        user1.setAccounts(accounts);

        List<User> clients = new ArrayList<>();
        clients.add(user1);
        clients.add(user2);

        // Прикрепляем клиентов к банку
        mts.setUsers(users);

        // сохраняем объект в в XML документ
        XMLService.saveMTSData(mts);
    }
}
*/
