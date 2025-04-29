package lab3cycle;

import java.util.Scanner;

public class Phonenumbervalidator{
    public static class Invalidphnumexception extends Exception{
        public Invalidphnumexception(String message){
            super(message);
        }
    }

    public static void validatePhonenumber(String phoneNumber) throws Invalidphnumexception{
        if (phoneNumber==null || phoneNumber.length()!=10 || !phoneNumber.matches("[0-9]+")){
            throw new Invalidphnumexception("Invalid phone number");
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a phone number: ");
        String phoneNumber=sc.nextLine();  
        try {
            validatePhonenumber(phoneNumber);  
            System.out.println("Phone number is valid");
        } catch (Invalidphnumexception e){
            System.out.println(e.getMessage());  
        } finally {
     
            sc.close();
        }
    }
}

