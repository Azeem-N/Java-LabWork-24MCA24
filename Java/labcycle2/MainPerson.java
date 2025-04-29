package lab2cycle;

import java.util.Scanner;
class person{
String name,gender, address;
int age;

	person(String name,String gender,String address,int age){
		this.name=name;
		this.gender=gender;
		this.address=address;
		this.age=age;
}
}
class Employe extends person{
	String empid, company_name, qualification; double salary;
	Employe(String name,String gender,String address,int age,String
			empid,String company_name,String qualification, double salary){

		super(name,gender,address,age);
		this.empid=empid;
		this.company_name=company_name;
		this.qualification=qualification;
		this.salary=salary;
}
}
class Teacher extends Employe{
				String subject,department,teacherid;
				Teacher(String name,String gender,String address,int age,String
						empid,String company_name,String qualification, double salary,String
						subject,String department,String teacherid){
					super(name,gender,address,age,empid,company_name,qualification,salary);
					this.subject=subject;
					this.department=department;
					this.teacherid=teacherid;
}
void display(){
	System.out.println("\n--- Teacher ID: " + teacherid + " ---");
	System.out.println("Name: " + name);
	System.out.println("Gender: " + gender);
	System.out.println("Address: " + address);
	System.out.println("Age: " + age);
	System.out.println("Employee ID: " + empid);
	System.out.println("Company Name: " + company_name);
	System.out.println("Qualification: " + qualification);
	System.out.println("Salary: " + salary);
	System.out.println("Subject: " + subject);
	System.out.println("Department: " + department);
}
}
public class MainPerson {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.print("enter the number of teachers:");
			int n=sc.nextInt();
			sc.nextLine();
			Teacher[] teachers=new Teacher[n];
			for(int i=0;i<n;i++) {
				System.out.print("Name: ");
				String name = sc.nextLine();
				System.out.print("Gender: ");
				String gender = sc.nextLine();
				System.out.print("Address: ");
				String address = sc.nextLine();
				System.out.print("Age: ");
				int age = sc.nextInt();
				sc.nextLine();
				System.out.print("Employee ID: ");
				String empid = sc.nextLine();
				System.out.print("Company Name: ");
				String companyName = sc.nextLine();
				System.out.print("Qualification: ");
				String qualification = sc.nextLine();
				System.out.print("Salary: ");
				double salary = sc.nextDouble();
				sc.nextLine();
				System.out.print("Subject: ");
				String subject = sc.nextLine();
				System.out.print("Department: ");
				String department = sc.nextLine();
				System.out.print("Teacher ID: ");
				String teacherid = sc.nextLine();
				teachers[i]=new Teacher(name, gender, address, age, empid,
						companyName,
						qualification, salary, subject, department, teacherid);
}
			for(int i=0; i<teachers.length;i++){
				Teacher t = teachers[i];
				t.display();
}
sc.close();
}



}