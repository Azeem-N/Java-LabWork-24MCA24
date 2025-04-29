package lab3cycle;

class Fibonacci extends Thread{
 private int count;

 public Fibonacci(int count){
     this.count=count;
 }

 @Override
 public void run(){
     int a=0,b=1;
     System.out.println("Fibonacci Series up to " + count + " terms:");
     for (int i=0;i<count;i++){
         System.out.print(a + " ");
         int next=a+b;
         a=b;
         b=next;
         try {
             Thread.sleep(100); 
         } catch (InterruptedException e) {
             System.out.println("Fibonacci thread interrupted");
         }
     }
     System.out.println(); 
 }
}

class EvenNumber extends Thread{
 private int start, end;

 public EvenNumber(int start, int end) {
     this.start = start;
     this.end = end;
 }

 @Override
 public void run(){
     System.out.println("Even Numbers between " + start + " and " + end + ":");
     for (int i=start;i<=end;i++){
         if(i%2==0){
             System.out.print(i+ " ");
             try{
                 Thread.sleep(100); 
             }catch(InterruptedException e){
                 System.out.println("Even number thread interrupted");
             }
         }
     }
     System.out.println(); 
 }
}

public class ThreadExp{
 public static void main(String[] args){
     Fibonacci fibthread=new Fibonacci(10);
     EvenNumber eventhread=new EvenNumber(1,20);

     fibthread.start();
     eventhread.start();
 }
}

