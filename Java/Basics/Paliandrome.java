package labexperiments;

import java.util.Scanner;

public class Paliandrome{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num=sc.nextInt();

        int onum= num;  
        int rev=0;       

        while (num != 0) {
            int ld=num%10;
            rev=rev*10+ld; 
            num=num/10; 
        }

        if (onum== rev) {
            System.out.println(onum+ " is a palindrome");
        } else {
            System.out.println(onum+ " is not a palindrome");
        }

        sc.close();
    }
}
