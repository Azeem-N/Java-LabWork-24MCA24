package labexperiments;

import java.util.Scanner;

public class Armstrong{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();

        int onum= num; 
        int numberofdigits=0;
        
        while(num!=0){
            num/=10;
            numberofdigits++;
        }

        num=onum; 
        int sum=0;

        while(num!=0) {
            int digit = num%10;  
            sum+=Math.pow(digit,numberofdigits); 
            num/=10; 
        }

        if(sum == onum) {
            System.out.println(onum+ "is an Armstrong number");
        } else{
            System.out.println(onum+ "is not an Armstrong number");
        }

        sc.close();
    }
}

