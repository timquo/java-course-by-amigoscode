package com.amigoscode;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class Exercise11 {

    static String data = """
        id,first_name,last_name,email,gender
        1,Fanchette,Williamson,fwilliamson0@github.com,F
        2,Aleksandr,Matts,amatts1@webs.com,M
        3,Maurie,Cordero,mcordero2@google.co.jp,M
        4,Donnajean,Crowson,dcrowson3@google.com.hk,F
        5,Ricardo,Gofton,rgofton4@nytimes.com,M
        6,Gabie,Tregenna,gtregenna5@guardian.co.uk,F
        7,Marjorie,Blumsom,mblumsom6@joomla.org,F
        8,Lester,Huyghe,lhuyghe7@jugem.jp,M
        9,Merrily,Stangoe,mstangoe8@tiny.cc,F
        10,Reider,Karel,rkarel9@github.io,M
        11,Dory,Jolliff,djolliffa@wufoo.com,F
        12,Homerus,Averay,haverayb@skyrock.com,M
        13,Alyda,Muglestone,amuglestonec@is.gd,F
        14,Pinchas,Louca,ploucad@google.es,M
        15,Cherin,Eltringham,celtringhame@parallels.com,F
        16,Mufi,Rothert,mrothertf@dropbox.com,F
        17,Jordana,Everex,jeverexg@ucla.edu,F
        18,Belle,Rother,brotherh@auda.org.au,F
        19,Clevie,Sifflett,csiffletti@furl.net,M
        20,Gretchen,Abell,gabellj@1688.com,F
    """;

    // Provide the file path where the data.csv file should be created
    static String filePath = "src/data.csv";


    public static void task01() {
        try {
            // Create a new BufferedWriter with FileWriter to write to the file
            BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));

            // Write the data string to the file
            writer.write(data);

            // Close the writer to release resources
            writer.close();

            System.out.println("Data written to the file successfully.");
        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }

    public static void task02() {
        try {
            // Create a new BufferedReader to read the file
            BufferedReader reader = new BufferedReader(new FileReader(filePath));

            // Read the file line by line and store it in a StringBuilder
            StringBuilder fileContents = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                fileContents.append(line).append("\n");
            }

            // Close the reader to release resources
            reader.close();

            // Display the contents of the file
            System.out.println("Contents of the file 'data.csv':");
            System.out.println(fileContents.toString());
        } catch (IOException e) {
            System.err.println("An error occurred while reading the file: " + e.getMessage());
        }
    }

    public static void task03() {
        try {
            // Create a new BufferedReader to read the file
            BufferedReader reader = new BufferedReader(new FileReader(filePath));

            // Read the file line by line and print each line
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            // Close the reader to release resources
            reader.close();
        } catch (IOException e) {
            System.err.println("An error occurred while reading the file: " + e.getMessage());
        }
    }

    public static void task04() {
        System.out.println("");
        try {
            // Create a new BufferedReader to read the file
            BufferedReader reader = new BufferedReader(new FileReader(filePath));

            // Skip the header line (read and discard it)
            String header = reader.readLine();

            // Read and print each line after the header
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            // Close the reader to release resources
            reader.close();
        } catch (IOException e) {
            System.err.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}