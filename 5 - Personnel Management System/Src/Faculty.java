/**
 * Faculty class represents a faculty member, which is a type of Person.
 */
public class Faculty extends Person {

    private int hireYear;

    /**
     * Default constructor for a Faculty object.
     * Initializes the object with default values for the name and ID number and -1 for the hire year.
     */
    public Faculty() {
        super();
        hireYear = -1;
    }

    /**
     * Parameterized constructor for a Faculty object.
     * Initializes the object with the given name, ID number, and hire year.
     *
     * @param n  The name of the faculty member.
     * @param id The ID number of the faculty member.
     * @param yr The year in which the faculty member was hired.
     */
    public Faculty(String n, String id, int yr) {
        super(n, id);
        hireYear = yr;
    }

    /**
     * Copy constructor for a Faculty object.
     * Initializes the object with the same values as another Faculty object.
     *
     * @param f The Faculty object to copy.
     */
    public Faculty(Faculty f) {
        this(f.getName(), f.getIdNum(), f.hireYear);
    }

    /**
     * Returns the hire year of the faculty member.
     *
     * @return The year in which the faculty member was hired.
     */
    int getHireYear() {
        return hireYear;
    }

    /**
     * Sets the hire year of the faculty member.
     *
     * @param yr The year in which the faculty member was hired.
     */
    void setHireYear(int yr) {
        hireYear = yr;
    }

    /**
     * Returns a string representation of the Faculty object.
     *
     * @return A string containing the superclass's toString method and the faculty member's hire year.
     */
    public String toString() {
        return super.toString() + " " + hireYear;
    }

    /**
     * Determines whether this Faculty object is equal to another object.
     *
     * @param f The object to compare to this Faculty object.
     * @return true if the objects are equal, false otherwise.
     */
    public boolean equals(Faculty f) {
        return super.equals(f) && hireYear == f.hireYear;
    }
}
