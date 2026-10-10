**** THE INFORMATION OF STUDENT IN TASK1****
  
  class Student {
  String studentName;
  int rollno;
  String branch;
  double cgpa;

}

public class Week3 {
  public static void main(String[] args) {
    Student student1 = new Student();
    student1.studentName = " Vinodkumar";
    student1.rollno = 45;
    student1.branch = "AI&DS";
    student1.cgpa = 7.6;

    Student student2 = new Student();
    student2.studentName = "Kumar";
    student2.rollno = 34;
    student2.branch = "Cse";
    student2.cgpa = 6.7;

    Student student3 = new Student();
    student3.studentName = "Reddy";
    student3.branch = "cse";
    student3.cgpa = 9.8;
    student3.rollno = 45;

    System.out.println("*** First Student information****");
    System.out.println("Studentname=" + student1.studentName);
    System.out.println("Rollno=" + student1.rollno);
    System.out.println("Branch=" + student1.branch);
    System.out.println("CGPA=" + student1.cgpa);

    System.out.println("*** Second Student information****");
    System.out.println("Studentname=" + student2.studentName);
    System.out.println("Rollno=" + student2.rollno);
    System.out.println("Branch=" + student2.branch);
    System.out.println("CGPA=" + student2.cgpa);

    System.out.println("***  Third Student information****");
    System.out.println("Studentname=" + student3.studentName);
    System.out.println("Rollno=" + student3.rollno);
    System.out.println("Branch=" + student3.branch);
    System.out.println("CGPA=" + student3.cgpa);

  }

}

****THE DETAILS OF EMPLOYEE IN COMPANY  BUT FIRST IS NOT AASIGNED****
  
class Employee {
    String EmployeeName;
    int EmployeeId;
    String Department;
    double Salary;

    Employee() {
        EmployeeName = "notassigned";
        EmployeeId = 0;
        Department = "notassigned";
        Salary = 0.0;
    }

    Employee(String EmployeeName, int EmployeeId, String EmployeeDepartment, double EmployeeSalary) {
        this.EmployeeName = EmployeeName;
        this.EmployeeId = EmployeeId;
        this.Department = Department;
        this.Salary = Salary;
    }

    void display() {

        System.out.println("***** Employee Details *****");
        System.out.println("Employee Name = " + EmployeeName);
        System.out.println("Employee Id       = " + EmployeeId);
        System.out.println("Employee Department      = " + Department);
        System.out.println("Employee Salary      = " + Salary);

    }

}

public class week3 {
    public static void main(String[] args) {

        Employee employee1 = new Employee(null, 0, null, 0.0);

        Employee employee2 = new Employee("Vinod", 12746, "CSe", 50959.98);
        Employee employee3 = new Employee("Tom", 8374, "CsE", 86758.09);
        System.out.println("Employee1    - default consrtuctor");
        employee1.display();
        System.out.println();
        System.out.println("Employee2 - Paramterized constructor");
        employee2.display();
        System.out.println();
        System.out.println("Employee3 - parameterized constructor");
        employee3.display();
    }

}
*** THE BANK ACCOUNT DETAILS USING THIS AND STATIC***
  
class BankAccount {

    String accountHolderName;
    long accountNumber;
    double accountBalance;

    static int totalAccounts = 0;

    BankAccount(String accountHolderName, long accountNumber, double accountBalance) {

        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        totalAccounts++;
    }

    void displayAccountDetails() {

        System.out.println("***** Account holder Details *****");
        System.out.println("Account Holder Name = " + accountHolderName);
        System.out.println("Account Number       = " + accountNumber);
        System.out.println("Account Balance      = " + accountBalance);
        System.out.println();
    }
}

public class week3 {

    public static void main(String[] args) {

        BankAccount account1 = new BankAccount("Vinod", 123456, 634379.98);

        BankAccount account2 = new BankAccount("Ram", 123457, 10000.00);

        BankAccount account3 = new BankAccount("Surya", 123458, 5000.00);

        account1.displayAccountDetails();
        account2.displayAccountDetails();
        account3.displayAccountDetails();

        System.out.println("Total number of Accounts created: " + BankAccount.totalAccounts);
    }
}
***** EMPLOYEE DETAILS USING INHERITANCE WITH SUBCLASS DEVELOPER AND MANAGER***

  class Employee {
    String Name;
    int EmployeeId;
    double salary;

    public Employee(String Name, int EmployeeId, double salary) {
        this.Name = Name;
        this.EmployeeId = EmployeeId;
        this.salary = salary;
    }

    void displayEmployeeDetails() {
        System.out.println("***** Employee Details *****");
        System.out.println("Employee Name = " + Name);
        System.out.println("Employee Id = " + EmployeeId);
        System.out.println("Employee Salary = " + salary);
    }
}

class Developer extends Employee {
    String programmingLanguage;

    Developer(String Name, int EmployeeId, double salary, String programmingLanguage) {
        super(Name, EmployeeId, salary);
        this.programmingLanguage = programmingLanguage;
    }

    void writesCode() {
        System.out.println("Programming Language = " + programmingLanguage);
        System.out.println("Developer writes code");
    }
}

class Manager extends Employee {
    int teamsize;

    Manager(String Name, int EmployeeId, double Salary, int teamsize) {
        super(Name, EmployeeId, Salary);
        this.teamsize = teamsize;
    }

    void managingTeam() {
        System.out.println("Team size=" + teamsize);
        System.out.println("Managing the team");
    }
}

public class week3 {
    public static void main(String[] args) {
        Developer mydeveloper = new Developer("Vinod", 234, 384673.980, "Java");
        Manager mymanager = new Manager("Hype", 345, 8796, 5);

        System.out.println("****DEVELOPER DETAILS***");
        mydeveloper.displayEmployeeDetails();
        mydeveloper.writesCode();

        System.out.println("****MANAGER DETAILS***");
        mymanager.displayEmployeeDetails();
        mymanager.managingTeam();
    }
}

***USING THE POLYMORISM  WITH CAR AND BIKE***

class Calculator {
    int calculator(int a, int b) {
        return a + b;
    }

    double calculator(double a, double b) {
        return a + b;
    }

    int calculator(int a, int b, int c) {
        return a + b + c;
    }
}

class vehicle {
    void start() {
        System.out.println("Vehicle is starting");
    }
}

class car extends vehicle {
    void start() {
        System.out.println("Car is starts with keys");
    }
}

class bike extends vehicle {
    void start() {
        System.out.println("Bike starts  with self");
    }
}

public class Task3 {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        System.out.println(" Two integers numbers=" + calculator.calculator(5, 10));
        System.out.println("Double two numbers=" + calculator.calculator(19.9, 10.5));
        System.out.println("Three integers=" + calculator.calculator(3, 6, 8));

        vehicle vehicle1 = new car();
        vehicle vehicle2 = new bike();
        vehicle1.start();
        vehicle2.start();

    }

}
***USING ENCAPSULATION AND ABSTRACTION WITH ACCCOUNT DETAILS***
  
class BankAccount {
 private int accountNumber;
    private String accountHolderName;
    private double balance;
 public int getAccountNumber() {
        return accountNumber;
    }
      public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
     public String getAccountHolderName() {
        return accountHolderName;
    }
     public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }
        public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
}
abstract class Account {
    abstract void displayAccountType();

    void welcomeMessage() {
        System.out.println("Welcome to the Banking System");
    }
}

class SavingsAccount extends Account {

    void displayAccountType() {
        System.out.println("Account Type: Savings Account");
    }
}

public class Week3 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.setAccountNumber(1001);
        account.setAccountHolderName("Vinod");
        account.setBalance(2500.00);

        SavingsAccount savings = new SavingsAccount();
        savings.welcomeMessage();
        savings.displayAccountType();

        System.out.println("\n--- Account Details ---");
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Account Holder: " + account.getAccountHolderName());
        System.out.println("Balance: Rs." + account.getBalance());
    }
}

  
