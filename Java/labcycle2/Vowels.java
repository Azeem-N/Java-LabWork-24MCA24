package lab2cycle;

import java.util.Scanner;

public class Vowels{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a line of text: ");
        String text=sc.nextLine();
        int vowelcount=0;
        int consonantcount=0;

        for(int i=0;i<text.length();i++) {
            char ch=text.charAt(i);
            if(Character.isLetter(ch)) {
                ch = Character.toLowerCase(ch);
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                    vowelcount++;
                }else {
                    consonantcount++;
                }
            }
        }

        System.out.println("Number of vowels: " + vowelcount);
        System.out.println("Number of consonants: " + consonantcount);

        sc.close();
    }
}

