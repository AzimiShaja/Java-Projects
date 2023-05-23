/**
 * Course
 */
public class Course {
    private String subject;
    private String courseID;
    private String tutor;

    public Course() {
    }

    public Course(String subject, String courseID, String tutor) {
        this.subject = subject;
        this.courseID = courseID;
        this.tutor = tutor;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public String getTutor() {
        return tutor;
    }

    public void setTutor(String tutor) {
        this.tutor = tutor;
    }

    public String toString() {
        return "Course Id: " + courseID + "\nCourse: " + subject + "\nTutor: " + this.tutor;
    }

    public boolean equals(Object o) {
        if (o == null) {
            return false;
        } else if (getClass() != o.getClass()) {
            return false;
        }
        Course otherStudent = (Course) o;
        return (subject.equals(otherStudent.subject)
                && courseID.equals(otherStudent.courseID)
                && tutor.equals(otherStudent.tutor));
    }
}
