package model;

import java.util.ArrayList;

public class ContactBook {

    private ArrayList<Contact> Contacts = new ArrayList<>();

    public ContactBook() {
    }

    public ArrayList<Contact> getContacts() {
        return Contacts;
    }

    public boolean add(String name, String email, String phone) {
        return true;
    }

    public Contact search(String email){
        return null;
    }

    public Contact remove(String email){
        return null;
    }
}
