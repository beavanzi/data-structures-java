import java.util.Arrays;

public class Vector {
    private Student[] students = new Student[100];
    private int totalOfStudents = 0;

    private void allocMoreSpace() {
        if (totalOfStudents == students.length){
            Student[] newVector = new Student[students.length*2];

            for (int i = 0; i < students.length; i++) {
                newVector[i] = students[i];
            }

            this.students = newVector;
        }
    }

    public void add(Student student){
    // O(n) to search on all position
    //        for(int i = 0; i < students.length; i++){
    //            if(students[i] == null){
    //                students[i] = student;
    //                break;
    //            }
    //        }
        allocMoreSpace();

        students[totalOfStudents] = student;
        totalOfStudents++;
    }

    public void add(int positionToAdd, Student student) {
        allocMoreSpace();

        if(!positionValid(positionToAdd)){
            throw new IllegalArgumentException("Invalid position!");
        }

        students = pushEveryoneForward(students, positionToAdd);
        students[positionToAdd] = student;
        totalOfStudents++;
    }

    public boolean occupied (int position) {
        return position >= 0 && position < totalOfStudents;
    }

    public Student getByPosition(int position){
        if (!occupied(position)) {
            throw new IllegalArgumentException("Invalid position!");
        }
        return students[position];
    }

    // we replace the "removed" with it next neighbour
    public void remove(int position){
        students = pushEveryoneBack(students, position);

        students[totalOfStudents] = null;
        totalOfStudents--;
    }

    public boolean contain(Student student){
        for(int i = 0; i < totalOfStudents; i++){
            if(student.equals(students[i])){
                return true;
            }
        }
        return false;
    }

    public int length(){
        return students.length;
    }

    public String toString() {
        return Arrays.toString(students);
    }

    private Student[] pushEveryoneBack(Student[] students, int position) {
        //push back everyone
        for (int i= position; i < totalOfStudents - 1; i++){
            students[i] = students[i+1];
        }
        return students;
    }

    private boolean positionValid(int position){
        return position >= 0 && position <= totalOfStudents;
    }

    private Student[] pushEveryoneForward(Student[] students, int position) {
        //push up everyone ahead
        for (int i = totalOfStudents - 1; i >= position; i--){
            students[i+1] = students[i];
        }
        return students;
    }
}
