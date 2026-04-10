import java.util.*;

class Student {
    int id;
    String name;
    float marks;
    Student(int id, String name,float marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
}
public class StudentCRUD {
    static ArrayList<Student> students = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    public static void addStudent() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter marks: ");
        float marks= sc.nextFloat();

        students.add(new Student(id, name, marks));
        System.out.println("Student Added Successfully!");
    }
    public static void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No Records Found!");
            return;
        }
    
        for (Student s : students) {
            System.out.println("id: " + s.id  );
             System.out.println("name: " + s.name );
               System.out.println("marks: " + s.marks ); 
        }
        }
    public static void updateStudent() {
        System.out.print("Enter id to Update: ");
        int id = sc.nextInt();
        sc.nextLine();

        for (Student s : students) {
            if (s.id == id) {
                System.out.print("Enter New Name: ");
                s.name = sc.nextLine();

                System.out.print("Enter marks: ");
                s.marks = sc.nextFloat();

                System.out.println("Student Updated Successfully!");
                return;
            }
        }

        System.out.println("Student Not Found!");
        }
    
    public static void deleteStudent() {
        System.out.print("Enter ID to Delete: ");
        int id = sc.nextInt();
Iterator<Student> it = students.iterator();

        while (it.hasNext()) {
            Student s = it.next();
            if (s.id == id) {
                it.remove();
                System.out.println("Student Deleted Successfully!");
                return;
            }
        }

        System.out.println("Student Not Found!");
    
        }
    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n--- Student CRUD Menu ---");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
         

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    viewStudents();
                    break;
                case 3:
                    updateStudent();
                    break;
                case 4:
                    deleteStudent();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 5);
    }
}