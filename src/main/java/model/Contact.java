package model;

public class Contact {
    private String name = "";
    private String email = "";
    private String phone = "";

    public Contact(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return "Contacto: \n" +
                "name: " + name + "\n" +
                "email: " + email + "\n" +
                "phone: " + phone;
    }
}
