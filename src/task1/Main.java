package task1;

import task1.database.Database;
import task1.models.Phone;
import task1.service.PhoneService;
import task1.service.servicelmpl.PhoneServicelmpl;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Phone phone = new Phone("Iphone", "Apple", "12345", Database.contacts);

        PhoneService phoneService = new PhoneServicelmpl();
        System.out.println("on/off");
        System.out.println(phoneService.turnOn(new Scanner(System.in).nextLine(), phone));

        System.out.println("write name");
        System.out.println(phoneService.call(new Scanner(System.in).nextLine()) + "calling");

        System.out.println("write the number");
        System.out.println(phoneService.call(new Scanner(System.in).nextLong()) + "calling you");


        System.out.println("please write the old and new Name");
        System.out.println(phoneService.updateContact(new Scanner(System.in).nextLine(), new Scanner(System.in).nextLine()));

        System.out.println(Arrays.toString(phoneService.getAllContacts()));
    }
}
