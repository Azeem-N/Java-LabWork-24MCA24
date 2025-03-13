package labexperiments;

import java.util.Scanner;

public class Studenteligibility {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter marks for Math: ");
        double maths=sc.nextDouble();
        System.out.print("Enter marks for Physics: ");
        double physics=sc.nextDouble();
        System.out.print("Enter marks for Chemistry: ");
        double chemistry=sc.nextDouble();
        double totalMarks=maths+physics+chemistry;
        double totalMathPhysics=maths+physics;
        
        if(totalMarks>=150) {
            System.out.println("The student is eligible");
        }
        else if(totalMathPhysics>=120) {
            System.out.println("The student is eligible");
        } else {
            System.out.println("The student is not eligible.");
        }
        sc.close();
    }
}

