public class Student extends Person {

    private int admitYear;
    private double gpa;

    public Student() {
        super();
        admitYear = -1;
        gpa = 0.0;
    }

    // standard constructor
    public Student(String n, String id, int yr, double g) {
        super(n, id);
        admitYear = yr;
        gpa = g;

    }

    public Student(Student s) {
        super(s);
        admitYear = s.admitYear;
        gpa = s.gpa;

    }

    public int getAdmitYear() {
        return admitYear;
    }

    public double getGpa() {
        return gpa;
    }

    public void setAdmitYear(int yr) {
        admitYear = yr;

    }

    public void setGpa(double g) {
        gpa = g;
    }

    public String toString() {
        return super.toString() + " Year: " + admitYear + " GPA: " + gpa;
    }

    public boolean equals(Student s) {
        return super.equals(s) &&
                admitYear == s.admitYear &&
                gpa == s.gpa;
    }

}
