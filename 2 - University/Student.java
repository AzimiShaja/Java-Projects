public class Student {

    private String name;
    private String id;
    private String department;

    public Student(String name, String id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student Name:" + name
                + "\nStudent Id: " + id
                + "\nDepartment: " + department;
    }

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
