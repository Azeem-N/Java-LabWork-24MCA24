package labexperiments;

import java.util.Scanner;

public class Fibanocci {

    public static void main(String[] args) {
        int n,i,a=0,j=1,res=0;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the limit:");
        n = obj.nextInt();
        System.out.println(a);
        System.out.println(j);

        for(i=2;res<=n;i++){
            res=a+j;
            if(res<=n){
                System.out.println(res);
            }
            a=j;
            j=res;
        }

        obj.close();
    }
}

