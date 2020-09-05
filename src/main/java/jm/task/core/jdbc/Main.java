package jm.task.core.jdbc;
import jm.task.core.jdbc.service.UserServiceImpl;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        UserServiceImpl us = new UserServiceImpl();
//        us.dropUsersTable();
//        us.dropUsersTable();
//        us.dropUsersTable();
//        us.createUsersTable();
//        us.dropUsersTable();
//        us.createUsersTable();
//        us.saveUser("Ivan", "Ivanov", (byte) 9);
//        us.getAllUsers().get(0);
//        us.dropUsersTable();
//        us.createUsersTable();
//        us.saveUser("Ivan", "Ivanov", (byte) 9);
//        us.removeUserById(1L);
        us.dropUsersTable();
//        us.createUsersTable();
//        us.saveUser("Ivan", "Ivanov", (byte) 9);
//        List<User> userList = us.getAllUsers();
        us.createUsersTable();
//        us.createUsersTable();
//        us.saveUser("Ivan", "Ivanov", (byte) 9);
//        us.cleanUsersTable();





////        us.createUsersTable();
////        us.createUsersTable();
////        us.cleanUsersTable();
//        us.createUsersTable();
//        byte agebyte = 3;
//        us.saveUser("ivan", "ivanov", agebyte);
////        User user = us.getAllUsers().get(0);
        us.removeUserById(2);
    }
}
