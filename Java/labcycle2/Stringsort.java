package lab2cycle;

import java.util.Scanner;

public class Stringsort{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of strings: ");
        int n=sc.nextInt();
        sc.nextLine(); 
        String arr[]=new String[n];
        System.out.println("Enter the strings:");
        for (int i=0;i<n;i++) {
            arr[i]=sc.nextLine();
        }
        
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j].compareTo(arr[j+1])>0){
                    String temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("\nSorted array of strings:");
        for(String str:arr) {
            System.out.println(str);
        }

        sc.close();
    }
}


	

