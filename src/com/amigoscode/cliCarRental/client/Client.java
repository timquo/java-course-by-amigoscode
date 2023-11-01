package com.amigoscode.cliCarRental.client;

import com.amigoscode.cliCarRental.utils.IdGenerator;

public class Client {
    private final String id;
    private final String name;
    private final String surname;
    private String phone;
    public final boolean hasValidDriverLicense;

    public Client(String name, String surname, String phone, boolean hasValidDriverLicense) {
        this.id = IdGenerator.getInstance().generateUniqueString();
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.hasValidDriverLicense = hasValidDriverLicense;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setPhone(String newPhone) {
        this.phone = newPhone;
    }


    @Override
    public String toString() {
        return "Client ID: " + id + "\nName: " + name + "\nSurname: " + surname + "\nPhone: " + phone
                + "\nDriver's License Valid: " + (hasValidDriverLicense ? "Yes" : "No");
    }
}