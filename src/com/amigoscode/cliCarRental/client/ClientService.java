package com.amigoscode.cliCarRental.client;

import java.util.List;

public class ClientService {

    public static boolean hasLicense(Client client) {
        return client.hasValidDriverLicense;
    }

    public static void changePhoneNumber(Client client, String newPhoneNumber) {
        client.setPhone(newPhoneNumber);
    }

    public static void printClientList() {
        List<Client> clients = ClientDAO.getAllClients();

        for (Client client : clients) {
            System.out.println("ID: " + client.getId() + ", Name: "
                    + client.getName() + ", Surname: " + client.getSurname());
        }
    }

    public static boolean clientIdExist(String clientId) {
        List<Client> clients = ClientDAO.getAllClients();
        for (Client client : clients) {
            if (clientId.equals(client.getId())) {
                return true;
            }
        }
        return false;
    }
}
