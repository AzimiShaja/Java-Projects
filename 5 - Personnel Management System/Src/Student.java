/**
 * Represents a student, which is a type of Person with additional properties
 * including
 * 
 * their admission year and GPA.
 */
public class Student extends Person {

    private int admitYear;
    private double gpa;

    /**
     * Constructs a default Student with no name, no ID number, unknown admission
     * year and 0.0 GPA.
     */
    public Student() {
        super();
        admitYear = -1;
        gpa = 0.0;
    }

    /**
     * Constructs a Student with the specified name, ID number, admission year, and
     * GPA.
     * 
     * @param n  the name of the student
     * @param id the ID number of the student
     * @param yr the year the student was admitted
     * @param g  the GPA of the student
     */
    public Student(String n, String id, int yr, double g) {
        super(n, id);
        admitYear = yr;
        gpa = g;
    }

    /**
     * Constructs a Student that is a copy of another given Student.
     * 
     * @param s the Student to copy
     */
    public Student(Student s) {
        super(s);
        admitYear = s.admitYear;
        gpa = s.gpa;
    }

    /**
     * Returns the year the student was admitted.
     * 
     * @return the year the student was admitted
     */
    public int getAdmitYear() {
        return admitYear;
    }

    /**
     * Returns the GPA of the student.
     * 
     * @return the GPA of the student
     */
    public double getGpa() {
        return gpa;
    }

    /**
     * Sets the admission year of the student.
     * 
     * @param yr the year the student was admitted
     */
    public void setAdmitYear(int yr) {
        admitYear = yr;
    }

    /**
     * Sets the GPA of the student.
     * 
     * @param g the GPA of the student
     */
    public void setGpa(double g) {
        gpa = g;
    }

    /**
     * Returns a string representation of the Student object.
     *
     * @return A string containing the superclass's toString method and the year of
     *         admission and GPA of the student.
     */
    public String toString() {
        return super.toString() + " Year: " + admitYear + " GPA: " + gpa;
    }

    /**
     * Determines whether this Student object is equal to another object.
     *
     * @param s The object to compare to this Student object.
     * @return true if the objects are equal, false otherwise.
     */

    public boolean equals(Student s) {
        return super.equals(s) &&
                admitYear == s.admitYear &&
                gpa == s.gpa;
    }

}
