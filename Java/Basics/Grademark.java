package labexperiments;

import java.util.Scanner;

public class Grademark {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the student's percentage: ");
        double per=sc.nextDouble();

        if (per>=90) {
            System.out.println("Grade: A");
            System.out.println("Excellent work!");
        } else if (per>=80) {
            System.out.println("Grade: B");
            System.out.println("Good job!");
        } else if (per>=70) {
            System.out.println("Grade: C");
            System.out.println("You can do better");
        } else if (per>=60) {
            System.out.println("Grade: D");
            System.out.println("Work harder");
        } else {
            System.out.println("Grade: F");
            System.out.println("Failed. Try again");
        }

        
        sc.close();
    }
}

