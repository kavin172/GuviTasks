package Task4.Q1_StudentManagementSystem;

public class Student {
    private final int rollNo;
    private final String name;
    private final int age;
    private final String course;

    public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("Age should be between 15 and 21.");
        }
        if (!isValidName(name)) {
            throw new NameNotValidException("Name should not contain numbers or special symbols.");
        }

        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    private boolean isValidName(String name) {
        return name.matches("[a-zA-Z\\s]+");
    }

    public String toString() {
        return "Student\t{" +"rollNo=" + rollNo +", name='" + name + '\'' +", age=" + age +", course='" + course + '\'' +'}';
    }
}
