import java.util.Scanner;

class Member{
    String name;
    int age;
    long phoneNo;
    String address;
    double salary;

    void printSalary(){
        System.out.println("Salary : "+salary);
    }
}

class Employee extends Member{
    String specialiazation;
}

class Manager extends Member{
    String department;
}

public class Staff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();
        Manager manager = new Manager();

        System.out.println("Enter Details of Employee :-");

        System.out.println("Name : ");
        employee.name = sc.nextLine();

        System.out.println("Age : ");
        employee.age = sc.nextInt();

        System.out.println("Phone Number : ");
        employee.phoneNo = sc.nextLong();

        System.out.println("Address : ");
        employee.address = sc.next();

        System.out.println("salary : ");
        employee.salary = sc.nextDouble();

        System.out.println("Specialization : ");
        employee.specialiazation = sc.next();

        System.out.println("\n\nDetails about Employee is :- ");
        System.out.println("Name : "+employee.name+"\n Age : "+employee.age+"\n Phone No.: "+employee.phoneNo+
        "\n Address : "+employee.address);
        employee.printSalary();
        System.out.println("Specialization : "+employee.specialiazation);

       
        System.out.println("Enter Details of Manager ;-");
        System.out.println("Name : ");
        employee.name = sc.nextLine();

        System.out.println("Age : ");
        employee.age = sc.nextInt();

        System.out.println("Phone Number : ");
        employee.phoneNo = sc.nextLong();

        System.out.println("Address : ");
        employee.address = sc.next();

        System.out.println("salary : ");
        employee.salary = sc.nextDouble();


        System.out.println("Details about Manager is :- ");
        System.out.println("Name : "+manager.name+"\n Age : "+manager.age+"\n Phone No.: "+manager.phoneNo+
        "\n Address : "+manager.address);
        manager.printSalary();
        System.out.println("Department : "+manager.department+"\n");
    }
}