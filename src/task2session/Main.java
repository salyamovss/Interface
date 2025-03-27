package task2session;

import task2session.Case.Lowercase;
import task2session.Case.Uppercase;
import task2session.Service.MessageFormatter;

public class Main {
    public static void main(String[] args) {
        MessageFormatter lowercase = new Lowercase();
        System.out.println(lowercase.getText("Sysbat"));
        MessageFormatter uppercase = new Uppercase();
        System.out.println(uppercase.getText("souuu"));
    }
}
