package Day8.interfaces.marketinterfaces;
public class Student {
    int id;
    String course;

    // ✅ Correct constructor definition
    public Student(int id, String course) {
        this.id = id;
        this.course = course;
    }

    // ✅ Simple method to check registration
    public void checkRegistration() {
        if (course.equalsIgnoreCase("Java"))
            System.out.println("Student is registered for the course");
        else
            System.out.println("Student is not registered for the course");
    }
}