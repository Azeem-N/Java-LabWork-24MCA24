package lab2cycle;
import java.util.Scanner;

public class Stringreplace{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text=sc.nextLine();

        System.out.print("Enter word to replace: ");
        String oldword=sc.next(); 

        System.out.print("Enter new word: ");
        String newword=sc.next();  

        String updatedtext=text.replace(oldword, newword);
        System.out.println("Updated string: " + updatedtext);

        sc.close();
    }
}
