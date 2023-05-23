import java.util.*;

/**
 * Department
 */
public class Department {
    private String name;
    private String DepartmentID;
    private ArrayList<Course> courses;
    private ArrayList<Student> students;

    public Department() {
        this.name = null;
        this.DepartmentID = null;
    }

    public Department(String name, String DepartmentID) {
        this.courses = new ArrayList<>();
        this.students = new ArrayList<>();
        this.name = name;
        this.DepartmentID = DepartmentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartmentID() {
        return DepartmentID;
    }

    public void setDepartmentID(String DepartmentID) {
        this.DepartmentID = DepartmentID;
    }

    public String toString() {
        return "Department: " + this.name;
    }

    // Course part
    public void addCourse(Course course) {
        this.courses.add(course);
    }

    public void removeCourse(Course course) {
        if (courses.isEmpty()) {
            System.out.println("Course is empty!");
        } else {
            this.courses.remove(course);
            System.out.println("Course removed!");
        }
    }

    public void listAllCourses() {
        System.out.print("[");
        for (Course course : courses) {
            System.out.print(course.getSubject() + ",");
        }
        System.out.print("]");
    }

    public void searchCourse(String courseName) {
        boolean foundCourse = false;
        for (Course course : courses) {
            if (course.getSubject().equals(name)) {
                System.out.println(course);
                foundCourse = true;
            }
        }
        if (!foundCourse) {
            System.out.println("Not found ");
        }
    }

    // Student part
    public void enrollStudent(Student student) {
        this.students.add(student);
        System.out.println("Student added successfully");
    }

    public void listAllStudents() {
        System.out.println("[");
        for (Student student : students) {
            System.out.print(student + " ");
        }
        System.out.println("]");
    }

    public void searchStudent(String studentName) {
        boolean foundStudent = false;
        if (students.isEmpty()) {
            System.out.println("There are no students in this department");
        } else {
            for (Student student : students) {
                if (student.getName().equals(studentName)) {
                    System.out.println(student);
                    foundStudent = true;
                }
            }
            if (!foundStudent) {
                System.out.println("Student Not found");
            }
        }
    }
}
