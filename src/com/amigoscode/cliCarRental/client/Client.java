package com.amigoscode.cliCarRental.client;

import com.amigoscode.cliCarRental.utils.IdGenerator;

public class Client {
    private final String id;
    private final String name;
    private final String surname;
    private String phone;
    private final boolean hasValidDriverLicense;

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

    public void setPhone(String newPhone) {
        this.phone = newPhone;
    }


    @Override
    public String toString() {
        return "Client ID: " + id + "\nName: " + name + "\nSurname: " + surname + "\nPhone: " + phone
                + "\nDriver's License Valid: " + (hasValidDriverLicense ? "Yes" : "No");
    }

    public static void main(String[] args) {
        // Create 5 test clients
        Client client1 = new Client("John", "Doe", "123-456-7890", true);
        Client client2 = new Client("Alice", "Johnson", "987-654-3210", false);
        Client client3 = new Client("Bob", "Smith", "555-123-4567", true);
        Client client4 = new Client("Jane", "Brown", "111-222-3333", true);
        Client client5 = new Client("Tom", "Wilson", "777-888-9999", false);

        // Print the information of each client
        System.out.println("Client 1:\n" + client1 + "\n");
        System.out.println("Client 2:\n" + client2 + "\n");
        System.out.println("Client 3:\n" + client3 + "\n");
        System.out.println("Client 4:\n" + client4 + "\n");
        System.out.println("Client 5:\n" + client5 + "\n");
    }
}