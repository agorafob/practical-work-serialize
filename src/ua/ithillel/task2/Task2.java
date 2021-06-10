package ua.ithillel.task2;

import java.io.*;

public class Task2 {
    public static void main(String[] args) {
        User[] users = {new User("Alex", "Petrov", 20),
                new User("Ivan", "Ivanov", 25),
                new User("Anna", "Petrova", 30)};
        File file = new File("C:\\PROJECT_HILEL_2ND\\practical-work-serialize\\src\\ua\\ithillel\\task2\\users.ser");
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
            out.writeObject(users);
            User[] usersCopy = (User[]) in.readObject();
            for (User u : usersCopy) {
                System.out.println(u);
            }
            out.close();
            in.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
