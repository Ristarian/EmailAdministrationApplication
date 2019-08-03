package emailApp;

import java.util.Scanner;

public class Email {

    private String firstName;
    private String lastName;
    private String password;
    private int defaultPasswordLength = 8;
    private String department;
    private int mailboxCapacity;
    private String alternativeEmail;

    // Constructor to receive the first name and last name
    public Email (String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);

        //Call a method asking for the department = return the department
        this.department = setDepartment();
        System.out.println("Department: " + this.department);

        //Call a method that returns a random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is: " + this.password);
    }

    // Ask for the department
    private String setDepartment(){
        System.out.print("DEPARTMENT CODES" +
                "\n1 for Sales" +
                "\n2 for Development" +
                "\n3 for Accounting " +
                "\n0 for none" +
                "\n Enter department code: ");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();

        if (depChoice == 1){ return "sales"; }
        else if (depChoice == 2){return "dev";}
        else if (depChoice == 3){return "acc";}
        else {return "";}
    }

    // Generate a random password
    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPRSTUWYZ1234567890";
        char[]password = new char[length];

        for (int i=0; i<length; i++){
            int rand = (int)(Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String (password);
    }

    // Set the mailbox capacity


    // Set the alternative email


    // Change the password



}
