package lab2cycle;

import java.util.Scanner;

public class Rowsum{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int r=sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int c=sc.nextInt();

        int[][] matrix=new int[r][c];
        System.out.println("Enter the elements of the matrix:");

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        System.out.println("\nSum of rows:");
        for(int i=0;i<r;i++){
            int rowSum=0;
            for (int j=0;j<c;j++) {
                rowSum+=matrix[i][j];
            }
            System.out.println("Sum of row " + (i + 1) + ": " + rowSum);
        }

        System.out.println("\nSum of columns:");
        for(int j=0; j<c;j++){
            int columnSum=0;
            for(int i=0;i<r;i++){
                columnSum+=matrix[i][j];
            }
            System.out.println("Sum of column " + (j + 1) + ": " + columnSum);
        }

        sc.close();
    }
}

