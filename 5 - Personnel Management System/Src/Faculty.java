public class Faculty extends Person {

    private int hireYear;

    public Faculty() {
        super();
        hireYear = -1;
    }

    public Faculty(String n, String id, int yr) {
        super(n, id);
        hireYear = yr;

    }

    public Faculty(Faculty f) {
        this(f.getName(), f.getIdNum(), f.hireYear);
    }

    int getHireYear() {
        return hireYear;
    }

    void setHireYear(int yr) {
        hireYear = yr;
    }

    public String toString() {
        return super.toString() + " " + hireYear;
    }

    public boolean equals(Faculty f) {
        return super.equals(f) && hireYear == f.hireYear;
    }
}
