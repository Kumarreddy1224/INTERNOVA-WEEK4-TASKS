*****Exception handling - safe calcultor*****
  
  import java.util.Scanner;
import java.util.InputMismatchException;

public class Week4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  First number");
        Double n1 = sc.nextDouble();
        System.out.println("Enter second number");
        Double n2 = sc.nextDouble();
        try {
            double add = n1 + n2;
            double sub = n1 - n2;
            double multi = n1 * n2;
            if (n2 == 0) {
                System.out.println("Can not divide by zero");
            }
            double divi = n1 / n2;
            double mod = n1 % n2;
            System.out.println("Adding (+) =" + add);
            System.out.println("Subtract (-) =" + sub);
            System.out.println("Multiplication (*) =" + multi);
            System.out.println("Division (/) =" + divi);
            System.out.println("Modulus (%) =" + mod);
        } catch (ArithmeticException e) {
            System.out.println("Error:" + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Please enter the valid numbers");
        } finally {
            System.out.println("Calculate the program completed");
            sc.close();
        }
    }
}

*****  Array list all students and remove one student*******

import java.util.ArrayList;

public class Week41 {
    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();
        System.out.println("**ALL STUDENTS***");
        students.add("Kumar");
        students.add("Ravi");
        students.add("Ramesh");
        students.add("Rumor");
        students.add("Tom");
        System.out.println(students);
        System.out.println("**Removing one student");
        students.remove("Rumor");
        System.out.println("remove Romor from the list");
        System.out.println(students);

        String searchName = "Ravi";
        if (students.contains(searchName)) {
            System.out.println(searchName + " is found in the list");
        } else {
            System.out.println(searchName + "Not found in list");
        }
        for (String Student : students) {
            System.out.println(Student);
        }

    }

}

***** Hash set of courses*****
  
  import java.util.HashSet;

public class Week42 {
    public static void main(String[] args) {

        HashSet<String> courses = new HashSet<>();

        courses.add("Java");
        courses.add("Python");
        courses.add("Stack");
        courses.add("C++");
        courses.add("Meryl");
        courses.add("cc");

        courses.add("Java");
        courses.add("Stack");
        System.out.println("UNIQUE COURSES");

        for (String course : courses) {
            System.out.println(course);
        }
        System.out.println("Total unique courses  =" + courses.size());

        String searchCourse = "Python";

        if (courses.contains(searchCourse)) {
            System.out.println(searchCourse + "course is available ");
        } else {
            System.out.println(searchCourse + " course is not available");
        }

    }

}
****** Hasp Map  of collection*******
  import java.io.PrintStream;
import java.util.HashMap;

public class Week4 {
 

   public static void main(String[] var0) {
      HashMap var1 = new HashMap();
      var1.put(345, "Binod");
      var1.put(346, "Tom");
      var1.put(347, "Jam");
      var1.put(348, "Enjoy");
      System.out.println("**STUDENT INFORMATION****");

      for(Integer var3 : var1.keySet()) {
         System.out.println("ID:" + var3 + "| Name:" + (String)var1.get(var3));
         short var4 = 347;
         if (var1.containsKey(Integer.valueOf(var4))) {
            PrintStream var10000 = System.out;
            Object var10001 = var1.get(Integer.valueOf(var4));
            var10000.println("Student found" + (String)var10001);
         } else {
            System.out.println(" student Not found ");
         }

         var1.remove(392);

         for(Integer var6 : var1.keySet()) {
            System.out.println("ID" + var3 + "|Name:" + (String)var1.get(var3));
         }
      }

   }
}
******  String builder of text*******
  public class Week44 {
    public static void main(String[] args) {
        StringBuilder text = new StringBuilder("Hello java");
        System.out.println("Orginal:" + text);

        text.append("Programming");
        System.out.println("After append:" + text);
        text.insert(6, "Adanced");
        System.out.println("After Insert:" + text);
        text.replace(0, 5, "Welcome");
        System.out.println("After Replaced:" + text);
        text.reverse();
        System.out.println("After reverse:" + text);
    }

}
****Mini java project of students that contain all id, name, course*****
  
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.InputMismatchException;

class Student {
    int studentId;
    String studentName;
    String course;
    int age;

    Student(int studentId, String studentName,
            String course, int age) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.course = course;
        this.age = age;
    }

    public String toString() {
        StringBuilder dc = new StringBuilder();

        dc.append("ID: ").append(studentId)
                .append(" | Name: ").append(studentName)
                .append(" | Course: ").append(course)
                .append(" | Age: ").append(age);

        return dc.toString();
    }
}

public class Week45 {

    static HashMap<Integer, Student> students = new HashMap<>();

    static Scanner sc = new Scanner(System.in);

    static void addStudent() {
        try {
            System.out.print("Enter Student ID: ");
            int id = sc.nextInt();

            if (id <= 0) {
                System.out.println("Invalid Student ID. Enter a positive ID.");
                return;
            }

            if (students.containsKey(id)) {
                System.out.println("Student ID already exists!");
                return;
            }

            sc.nextLine();

            System.out.print("Enter Student Name: ");
            String name = sc.nextLine().trim();

            if (name.isEmpty()) {
                System.out.println("Name cannot be empty.");
                return;
            }

            System.out.print("Enter Course: ");
            String course = sc.nextLine().trim();

            if (course.isEmpty()) {
                System.out.println("Course cannot be empty.");
                return;
            }

            System.out.print("Enter Age: ");
            int age = sc.nextInt();

            if (age <= 0 || age > 100) {
                System.out.println("Enter a valid age.");
                return;
            }

            Student student = new Student(id, name, course, age);

            students.put(id, student);

            System.out.println(
                    "Student added successfully!");

        } catch (InputMismatchException e) {
            System.out.println(
                    "Invalid input! Enter numbers for ID and age.");
        } finally {
            if (sc.hasNextLine()) {
                sc.nextLine();
            }
        }
    }

    static void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No student records found.");
            return;
        }

        System.out.println(" STUDENT RECORDS ");

        for (Student student : students.values()) {
            System.out.println(student);
        }
    }

    static void searchStudent() {
        try {
            System.out.print("Enter Student ID to search: ");
            int id = sc.nextInt();

            if (id <= 0) {
                System.out.println("Invalid Student ID.");
            } else if (students.containsKey(id)) {
                System.out.println("Student found:");
                System.out.println(students.get(id));
            } else {
                System.out.println(
                        "Student with ID " + id + " not found.");
            }

        } catch (InputMismatchException e) {
            System.out.println(
                    "Invalid input! Student ID must be numeric.");
        } finally {
            if (sc.hasNextLine()) {
                sc.nextLine();
            }
        }
    }

    static void removeStudent() {
        try {
            System.out.print("Enter Student ID to remove: ");
            int id = sc.nextInt();

            if (id <= 0) {
                System.out.println("Invalid Student ID.");
            } else if (students.remove(id) != null) {
                System.out.println(
                        "Student removed successfully!");
            } else {
                System.out.println(
                        "Student with ID " + id + " not found.");
            }

        } catch (InputMismatchException e) {
            System.out.println(
                    "Invalid input! Student ID must be numeric.");
        } finally {
            if (sc.hasNextLine()) {
                sc.nextLine();
            }
        }
    }

    static void displayUniqueCourses() {
        HashSet<String> courses = new HashSet<>();

        for (Student student : students.values()) {
            courses.add(student.course);
        }

        if (courses.isEmpty()) {
            System.out.println("No courses available.");
            return;
        }

        System.out.println(" UNIQUE COURSES ");

        for (String course : courses) {
            System.out.println(course);
        }

        System.out.println("Total courses: " + courses.size());
    }

    public static void main(String[] args) {
        int choice = 0;

        do {
            System.out.println(
                    " STUDENT RECORD MANAGER ");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Remove Student");
            System.out.println("5. Display Unique Courses");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            try {
                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        addStudent();
                        break;

                    case 2:
                        viewStudents();
                        break;

                    case 3:
                        searchStudent();
                        break;

                    case 4:
                        removeStudent();
                        break;

                    case 5:
                        displayUniqueCourses();
                        break;

                    case 6:
                        System.out.println(
                                "Thank you for using Student Record Manager!");
                        break;

                    default:
                        System.out.println(
                                "Invalid menu choice! Select 1 to 6.");
                }

            } catch (InputMismatchException e) {
                System.out.println(
                        "Invalid input! Please enter a number from 1 to 6.");
                sc.nextLine();
            }

        } while (choice != 6);

        sc.close();
    }
}



  
