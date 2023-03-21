/**
 * 
 * This is the main class of the program, it creates instances of different
 * classes
 * 
 * and prints information about them.
 */
public class Main {

    /**
     * 
     * The main method of the program, it creates instances of different classes
     * 
     * and prints information about them.
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("-----------------------------------------");
        // create a new Person object with name "Jimmy" and id "111-22-333"
        Person mrBeast = new Person("Jimmy", "111-22-333");
        System.out.println("Mr beast's info: " + mrBeast);
        System.out.println("------------------------------------------");

        System.out.println("------------------------------------------");
        // create a new Student object with name "Carol", id "643-12-3451", expected
        // graduation year "2023", and gpa "2.8"
        Student Carol = new Student("Carol", "643-12-3451", 2023, 2.8);
        System.out.println("Carol's name is " + Carol.getName());
        // set the name of the Student object to "Carol2"
        Carol.setName("Carol2");
        System.out.println("carol2's new Info: " + Carol);
        System.out.println("------------------------------------------");

        System.out.println("------------------------------------------");
        // assign the Student object "Carol" to the Student object "bob"
        Student bob = Carol;
        // set the gpa and name of the Student object "bob" to new values
        bob.setGpa(3.0);
        bob.setName("John Cena");
        bob.setIdNum("123-435-215");
        System.out.println("Yusuf's info: " + bob);
        System.out.println("------------------------------------------");

        // create a new Faculty object with name "Randy ortan", id "923-43-1213", and
        // hire year "2023"
        Faculty randy = new Faculty("Randy ortan", "923-43-1213", 2023);
        System.out.println("Emre Id: " + randy.getIdNum());
        // set the id of the Faculty object to "23-124-4322"
        randy.setIdNum("23-124-4322");
        System.out.println("Emre's info: " + randy);
        System.out.println("_------------------------------------------");

        System.out.println("------------------------------------------");
        // create a new Faculty object with the same properties as the Faculty object
        // "randy"
        Faculty michel = new Faculty(randy);
        // set the name, hire year, and id of the Faculty object "michel" to new values
        michel.setName("michel");
        michel.setHireYear(2022);
        michel.setIdNum("322-34-2434");
        System.out.println("michel's info: " + michel);
        System.out.println("------------------------------------------");
    }
}