package lab3cycle;

import java.util.Scanner;
import java.util.regex.*;

class Invalidpassword extends Exception{
    public Invalidpassword(String message){
        super(message);
    }
}

public class PasswordValidator{
    public static void validatePassword(String password) throws Invalidpassword{
        if(password.length()<8){
            throw new Invalidpassword("Password must be at least 8 characters long");
        }
        if(!password.matches(".*\\d.*")){
            throw new Invalidpassword("Password must contain at least one number");
        }
        if(!password.matches(".*[\\$#@\\)&].*")){
            throw new Invalidpassword("Password must contain at least one special character");
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your password: ");
        String password=sc.nextLine();

        try{
            validatePassword(password);
            System.out.println("Password is valid.");
        } catch (Invalidpassword e){
            System.out.println("Error: " +e.getMessage());
        }

        sc.close();
    }
}
