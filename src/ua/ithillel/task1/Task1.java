package ua.ithillel.task1;

import java.io.*;

public class Task1 {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        File file = new File("C:\\PROJECT_HILEL_2ND\\practical-work-serialize\\src\\ua\\ithillel\\task1\\emp.ser");
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
            out.writeObject(employee1);
            System.out.println("Объект записан");
            Employee employee1Copy = (Employee) in.readObject();
            System.out.println(employee1Copy);
            out.close();
            in.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
