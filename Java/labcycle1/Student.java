package lab1cycle;

public class Student{
	int Studentid;
	String Name;
	double marks;
	
	public Student(int Studentid,String Name,double marks){
		this.Studentid=Studentid;
		this.Name=Name;
		this.marks=marks;
	}
	public void isPassed() {
		if(marks>=40) {
			System.out.println("Passed");
		}
		else {
			System.out.println("Failed");
		}
	}
	public void displayDetails() {
		System.out.println("Studentid=" +Studentid);
		System.out.println("Name=" +Name);
		System.out.println("Marks=" +marks);
	}

	public static void main(String[] args) {
		Student stud1=new Student(112,"Azeem",39);
		Student stud2=new Student(113,"Adarsh",80);
		Student stud3=new Student(112,"Aromal",85);
		System.out.println("Student 1:");
		stud1.displayDetails();
		stud1.isPassed();
		System.out.println(); 
		
		System.out.println("Student 2:");
		stud2.displayDetails();
		stud2.isPassed();
		System.out.println(); 
		
		System.out.println("Student 3:");
		stud3.displayDetails();
		stud3.isPassed();
		System.out.println(); 
	}

}
