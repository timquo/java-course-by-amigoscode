package com.amigoscode.exercise13;


public class Main {
    public static void main(String[] args) {
        CreateCSV.createFile();

        Person client1 = new Person("Bobby", "Bay", "M", "bb@gmail.com");
        Person client2 = new Person("Ann", "Mann", "F", "annmann@gmail.com");

        System.out.println(client1);
        System.out.println(client2);

    }
}
