/**
 * Student class representing a student in the university.
 */
public class Student {
    private String name;
    private String id;
    private String department;

    /**
     * Constructs a new Student object with the given name, ID, and department.
     *
     * @param name       The name of the student
     * @param id         The ID of the student
     * @param department The department of the student
     */
    public Student(String name, String id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }

    /**
     * Returns the name of the student.
     *
     * @return The name of the student
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the student.
     *
     * @param name The new name of the student
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the ID of the student.
     *
     * @return The ID of the student
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the ID of the student.
     *
     * @param id The new ID of the student
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Returns a string representation of the student object.
     *
     * @return A string representation of the student object
     */
    @Override
    public String toString() {
        return "Student Name: " + name
                + "\nStudent ID: " + id
                + "\nDepartment: " + department;
    }

    /**
     * Compares the student object with another object for equality.
     *
     * @param o The object to compare with
     * @return True if the objects are equal, false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        } else if (getClass() != o.getClass()) {
            return false;
        }
        Student otherStudent = (Student) o;
        return (name.equals(otherStudent.name)
                && id.equals(otherStudent.id)
                && department.equals(otherStudent.department));
    }
}
