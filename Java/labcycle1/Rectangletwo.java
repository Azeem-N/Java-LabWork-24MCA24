package lab1cycle;
public class Rectangletwo{
    double length;
    double width;

    public Rectangletwo(){
        this.length=1.0;
        this.width=1.0;
    }

    public Rectangletwo(double length, double width){
        this.length=length;
        this.width=width;
    }

    public double Area(){
        return length*width;
    }

    public double Perimeter(){
        return 2*(length+width);
    }

    public void displayrectangle(){
        System.out.println("Length: " +length);
        System.out.println("Width: " +width);
        System.out.println("Area: " +Area());
        System.out.println("Perimeter: " +Perimeter());
    }

    public class RectangleTest {
        public static void main(String[] args) {
            
            Rectangletwo ogRectangle= new Rectangletwo(); 
            Rectangletwo rectangle1 = new Rectangletwo(5.0, 3.0); 
            Rectangletwo rectangle2 = new Rectangletwo(7.0, 2.5); 
            Rectangletwo rectangle3 = new Rectangletwo(10.0, 6.0); 
            
            System.out.println("Rectangle 1:");
            ogRectangle.displayrectangle();

            System.out.println("\nRectangle 2:");
            rectangle1.displayrectangle();

            System.out.println("\nRectangle 3:");
            rectangle2.displayrectangle();

            System.out.println("\nRectangle 4:");
            rectangle3.displayrectangle();
        }
    }

}

