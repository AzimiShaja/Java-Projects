import java.util.ArrayList;
import java.util.Scanner;

/**
 * University application that manages departments and courses.
 */
public class University {
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Department> departments = new ArrayList<>();
    private static Department department;
    private static Course course;

    /**
     * The main method of the University application.
     *
     * @param args Command-line arguments
     */
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
                    String departmentId = scanner.nextLine();
                    department = new Department(name, departmentId);
                    addDepartment(department);
                    System.out.println("Department added");
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
                    departmentId = scanner.nextLine();
                    enterDepartment(name, departmentId);
                    break;
                case "4":
                    showAllDepartments();
                    break;
                case "5":
                    roll = false;
                    System.out.println("Exiting......");
                    break;
                default:
                    break;
            }
        }
    }

    /**
     * Adds a department to the list of departments.
     *
     * @param department The department to be added
     */
    public static void addDepartment(Department department) {
        departments.add(department);
    }

    /**
     * Displays all the departments in the university.
     */
    public static void showAllDepartments() {
        if (departments.isEmpty()) {
            System.out.println("No departments in the university");
        } else {
            for (Department department : departments) {
                System.out.println(department);
            }
        }
    }

    /**
     * Removes a department from the list of departments by name.
     *
     * @param name The name of the department to be removed
     */
    public static void removeDepartment(String name) {
        boolean removed = false;
        if (departments.isEmpty()) {
            System.out.println("No departments in the university to remove");
        } else {
            for (Department department : departments) {
                if (department.getName().equals(name)) {
                    departments.remove(department);
                    removed = true;
                    break;
                }
            }
            if (removed) {
                System.out.println("Department removed");
            } else {
                System.out.println("Department could not be removed");
                System.out.println(name + " was not found");
            }
        }
    }

    /**
     * Enters a department by name and department ID to manage its courses.
     *
     * @param name          The name of the department
     * @param departmentId  The ID of the department
     */
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
                    System.out.println("4 Search for a course");
                    System.out.println("5 Exit");
                    System.out.println();
                    System.out.print("Enter your choice -> ");
                    String choice = scanner.nextLine();
                    switch (choice) {
                        case "1":
                            System.out.println("Enter the course name: ");
                            String subject = scanner.nextLine();
                            System.out.println("Enter the course ID: ");
                            String courseId = scanner.nextLine();
                            System.out.println("Enter the tutor: ");
                            String tutor = scanner.nextLine();
                            course = new Course(subject, courseId, tutor);
                            departments.get(i).addCourse(course);
                            System.out.println("Course added successfully");
                            break;
                        case "2":
                            departments.get(i).removeCourse(course);
                            break;
                        case "3":
                            departments.get(i).listAllCourses();
                            break;
                        case "4":
                            System.out.println("Enter the course name: ");
                            String courseName = scanner.nextLine();
                            departments.get(i).searchCourse(courseName);
                            break;
                        case "5":
                            roll = false;
                            System.out.println("Exiting department.......");
                            break;
                        default:
                            System.out.println("Wrong input! Please try again");
                            break;
                    }
                }
            }
        }
    }
}
