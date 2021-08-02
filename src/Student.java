import java.util.Objects;

public class Student {
    private String name;

    public Student(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        Student anotherStudent = (Student) o;
        return anotherStudent.getName().equals(this.name);
    }

    @Override
    public String toString() {
        return name;
    }
}
