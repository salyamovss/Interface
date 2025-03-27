package task1.service.servicelmpl;

import task1.database.Database;
import task1.models.Contact;
import task1.models.Phone;
import task1.service.PhoneService;

import javax.xml.crypto.Data;
import java.awt.dnd.DropTarget;
import java.util.Scanner;

public class PhoneServicelmpl implements PhoneService {
    @Override
    public String turnOn(String command, Phone phone) {
        if (command.equals("On")){
            System.out.println("please write password");
            if (phone.getPassword().equals(new Scanner(System.in).nextLine())){
                return "phone is on!";
            }
        }
        return "incorrect password";
    }

    @Override
    public Contact call(String name) {
        for (Contact contact : Database.contacts){
            if (contact.getFullName().equals(name)){
                return contact;
            }
        }
        return null;
    }

    @Override
    public Contact call(long phoneNumber) {
        for (Contact contact : Database.contacts){
            if (contact.getPhoneNumber() == phoneNumber){
                return contact;
            }
        }
        return null;
    }

    @Override
    public Contact updateContact(String oldName, String newName) {
        for (Contact contact : Database.contacts){
            if (contact.getFullName().equals(oldName)){
                contact.setFullName(newName);
                return contact;
            }
        }
        return null;
    }

    @Override
    public Contact[] getAllContacts() {
        return Database.contacts;
    }
}
