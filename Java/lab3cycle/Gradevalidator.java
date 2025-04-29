package lab3cycle;
import java.util.Scanner;

class InvalidgradeException extends Exception{
 public InvalidgradeException(String message){
     super(message);
 }
}

public class Gradevalidator{
 public static void validategrade(char grade) throws InvalidgradeException{
     if (grade<'A' || grade>'F'){
         throw new InvalidgradeException("Invalid grade: " + grade + ". Grade must be between A and F");
     } else{
         System.out.println("Valid grade: " +grade);
     }
 }

 public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter a grade (A-F): ");
     char grade = sc.next().toUpperCase().charAt(0);

     try {
         validategrade(grade);
     } catch (InvalidgradeException e){
         System.out.println(e.getMessage());
     } finally {
         sc.close();
     }
 }
}

