import java.util.ArrayList;
import java.util.Scanner;

/**
 * Application
 */
public class University {
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Department> departments = new ArrayList<>();
    private static Department department;
    private static Course course;

    public static void main(String[] args) {
        System.out.println("\n\tWelcome to the University");
        boolean roll = true;
        while (roll) {
            System.out.println("\n");
            System.out.println("\t1 Add department");
            System.out.println("\t2 Remove department");
            System.out.println("\t3 Enter the department");
            System.out.println("\t4 Show all the departments");
            System.out.println("\t5 Exit");
            System.out.println();
            System.out.print("\tEnter your choice -> ");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    System.out.print("Enter the name of the department -> ");
                    String name = scanner.nextLine();
                    System.out.print("Enter the id of the department -> ");
                    String dempartmentId = scanner.nextLine();
                    department = new Department(name, dempartmentId);
                    addDepartment(department);
                    System.out.println("Department add");
                    break;
                case "2":
                    System.out.println("Enter the name of the department -> ");
                    name = scanner.nextLine();
                    removeDepartment(name);
                    break;
                case "3":
                    System.out.print("Enter the name of the department -> ");
                    name = scanner.nextLine();
                    System.out.print("Enter the id of the department -> ");
                    dempartmentId = scanner.nextLine();
                    enterDepartment(name, dempartmentId);
                    break;
                case "4":
                    showAllDepartments();
                    break;
                case "5":
                    roll = false;
                    System.out.println("Exitting......");
                    break;
                default:
                    break;
            }
        }
    }

    public static void addDepartment(Department department) {
        departments.add(department);
    }

    public static void showAllDepartments() {
        if (departments.isEmpty()) {
            System.out.println("No departments in university");
        } else {
            for (Department department : departments) {
                System.out.println(department);
            }
        }
    }

    public static void removeDepartment(String name) {
        boolean removed = false;
        if (departments.isEmpty()) {
            System.out.println("No departments in university to remove");
        } else {
            for (Department department : departments) {
                if (department.getName().equals(name)) {
                    departments.remove(department);
                    removed = true;
                }
            }
            if (removed) {
                System.out.println("Department Removed");
            } else {
                System.out.println("Department could Not be removed");
                System.out.println(name + " was not found ");
            }
        }
    }

    public static void enterDepartment(String name, String departmentId) {

        for (int i = 0; i < departments.size(); i++) {
            if (name.equals(departments.get(i).getName())
                    && departmentId.equalsIgnoreCase(departments.get(i).getDepartmentID())) {
                System.out.println("\n\n");
                System.out.println("---- " + departments.get(i).getName() + "---");
                boolean roll = true;
                while (roll) {
                    System.out.println("1 Add Course ");
                    System.out.println("2 Remove Course ");
                    System.out.println("3 List all courses");
                    System.out.println("4 search for a course");
                    System.out.println("5 Exit");
                    System.out.println();
                    System.out.print("Enter your choice -> ");
                    String choice = scanner.nextLine();
                    switch (choice) {
                        case "1":
                            System.out.println("Enter the course name: ");
                            String subject = scanner.nextLine();
                            System.out.println("Enter the course id: ");
                            String courseId = scanner.nextLine();
                            System.out.println("Enter the tutor");
                            String tutor = scanner.nextLine();
                            course = new Course(subject, courseId, tutor);
                            department.addCourse(course);
                            System.out.println("Course added successfully");
                            break;
                        case "2":
                            department.removeCourse(course);
                            break;
                        case "3":
                            department.listAllCourses();
                            break;
                        case "4":
                            System.out.println("Enter the course name ");
                            String courseName = scanner.nextLine();
                            department.searchCourse(courseName);
                            break;
                        case "5":
                        default:
                            System.out.println("Wrong input!, Pleease try again");
                            break;
                    }
                }
            }
        }
    }
}