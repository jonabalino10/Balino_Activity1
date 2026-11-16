public class Student {
    // Private Attributes (REQUIRED)
    private String name;
    private String studentId;
    private double grade;

    // Constructor
    public Student(String name, String studentId, double grade) {
        this.name = name;
        this.studentId = studentId;
        this.grade = grade;
    }

    // Getters
    public String getName() {
        return name;
    }
    public String getStudentId() {
        return studentId;
    }
    public double getGrade() {
        return grade;
    }

    // Setter for grade
    public void setGrade(double grade) {
        this.grade = grade;
    }

    // displayInfo
    public void displayInfo() {
        System.out.println("Name: " + name + " | ID: " + studentId + " | Grade: " + grade);
    }

    // Main
    public static void main(String[] args) {
        Student student1 = new Student("Juan Dela Cruz", "2026‑001", 90.0);
        Student student2 = new Student("Maria Santos", "2026‑002", 88.5);

        student1.setGrade(92.0);
        student1.displayInfo();
        student2.displayInfo();
    }
}