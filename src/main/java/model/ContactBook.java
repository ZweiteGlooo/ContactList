package model;

import java.util.ArrayList;

public class ContactBook {

    private ArrayList<Contact> Contacts = new ArrayList<>();

    public ContactBook() {
    }

    public void setContacts(ArrayList<Contact> contacts) {
        Contacts = contacts;
    }

    public ArrayList<Contact> getContacts() {
        return Contacts;
    }

    public boolean add(String name, String email, String phone) throws NullPointerException {
        Contact contact = new Contact(name, email, phone);
        return getContacts().add(contact);
    }

    public Contact search(String email)  throws NullPointerException {
        for (Contact contact : getContacts()) {
            if (contact.getEmail().equals(email)) {
                return contact;
            }
        }
        return null;
    }

    public Contact remove(String email)  throws NullPointerException {
        for (Contact contact : getContacts()) {
            if (contact.getEmail().equals(email)) {
                getContacts().remove(contact);
                return contact;
            }
        }
        return null;
    }
}
