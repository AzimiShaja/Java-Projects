/**
 * This class represents a Person with a name and an identification number.
 */
public class Person {

    private String name;
    private String idNum;

    /**
     * Default constructor. Creates a new Person with name "No-Name" and ID number
     * "000-00-0000".
     */
    public Person() {
        name = "No-Name";
        idNum = "000-00-0000";
    }

    /**
     * Standard constructor. Creates a new Person with the specified name and ID
     * number.
     * 
     * @param n  the name of the Person
     * @param id the ID number of the Person
     */
    public Person(String n, String id) {
        name = n;
        idNum = id;
    }

    /**
     * Copy constructor. Creates a new Person with the same name and ID number as
     * the given Person.
     * 
     * @param p the Person to copy
     */
    public Person(Person p) {
        name = p.name;
        idNum = p.idNum;
    }

    /**
     * Returns the name of this Person.
     * 
     * @return the name of this Person
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the ID number of this Person.
     * 
     * @return the ID number of this Person
     */
    public String getIdNum() {
        return idNum;
    }

    /**
     * Sets the name of this Person to the specified value.
     * 
     * @param n the new name for this Person
     */
    public void setName(String n) {
        name = n;
    }

    /**
     * Sets the ID number of this Person to the specified value.
     * 
     * @param id the new ID number for this Person
     */
    public void setIdNum(String id) {
        idNum = id;
    }

    /**
     * Returns a String representation of this Person in the format "[name] ID:
     * idNum ".
     * 
     * @return a String representation of this Person
     */
    public String toString() {
        return "[" + name + "] " + " ID: " + idNum + " ";
    }

    /**
     * Compares this Person to the specified Person for equality.
     * 
     * @param p the Person to compare to
     * @return true if the specified Person has the same name and ID number as this
     *         Person, false otherwise
     */
    public boolean equals(Person p) {
        return name.equals(p.name) && idNum.equals(p.idNum);
    }

}