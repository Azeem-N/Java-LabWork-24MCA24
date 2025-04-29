package lab2cycle;
abstract class Employees{
    protected String name;
    protected int id;

    public Employees(String name,int id) {
        this.name=name;
        this.id=id;
    }
    public abstract double calculatesalary();
}

class FulltimeEmployee extends Employees{
    private double monthlysalary;

    public FulltimeEmployee(String name,int id,double monthlysalary) {
        super(name,id);
        this.monthlysalary=monthlysalary;
    }

    public double calculatesalary() {
        return monthlysalary;
    }
}

class PartTimeEmployee extends Employees{
    private double hourlyrate;
    private double hoursworked;

    
    public PartTimeEmployee(String name,int id,double hourlyrate,double hoursworked) {
        super(name,id);
        this.hourlyrate=hourlyrate;
        this.hoursworked=hoursworked;
    }

    public double calculatesalary(){
        return hourlyrate*hoursworked;
    }
}


public class Employee{
    public static void main(String[] args){
       
        FulltimeEmployee ftEmployee = new FulltimeEmployee("Azeem N", 1, 50000.00);
        PartTimeEmployee ptEmployee = new PartTimeEmployee("Adarsh", 2, 20.00, 80);

        
        System.out.println(ftEmployee.name + ": Rs " + ftEmployee.calculatesalary());
        System.out.println(ptEmployee.name + ": Rs " + ptEmployee.calculatesalary());
    }
}
