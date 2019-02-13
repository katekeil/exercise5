package com.kate;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by 016006 on 2/12/2019.
 */
public class Main {
    public static void main(String[] args) {
        String personName;
        String personEmail;
        String nameGet;
        int selection = 4;

        Scanner name = new Scanner(System.in);
        Scanner email = new Scanner(System.in);
        Scanner choice = new Scanner(System.in);
        Scanner input = new Scanner(System.in);

        HashMap<String, String> info = new HashMap<String, String>();

        while (selection != 0){

            System.out.println("What would you like to do?");
            System.out.println("(1) Add a person");
            System.out.println("(2) Search email by name");
            System.out.println("(3) Display all");
            System.out.println("(0) Exit");

            selection = choice.nextInt();

            //Add a person
            if (selection == 1){
                System.out.println("What is the person's name?");
                personName = name.nextLine();

                System.out.println("What is the person's email?");
                personEmail = email.nextLine();

                Contact person = new Contact(personName, personEmail);

                info.put(personName, personEmail);
            }

            //Search email by name
            if (selection == 2){
                System.out.println("Enter a person's name to get their email.");
                nameGet = input.nextLine();
                String val = info.get(nameGet);
                System.out.println(nameGet + "'s email is " + val + ".");
            }

            //Display all
            if (selection == 3){
                System.out.println(info.toString());

            }
        }
    }
}
