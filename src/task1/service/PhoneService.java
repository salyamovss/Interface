package task1.service;

import task1.models.Contact;
import task1.models.Phone;

public interface PhoneService {

    String turnOn(String command, Phone phone);

    Contact call(String name);

    Contact call(long phoneNumber);

    Contact updateContact(String oldName, String newName);

    Contact[] getAllContacts();




}
