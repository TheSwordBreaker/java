package enc;

/**
 * encDemo
 */
class Student{

    private int rollNo;
    private String name;

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setName(String name) {
        this.name = name;
    }



}
public class encDemo {

    public static void main(String[] args) {
        Student s = new Student();
        s.setRollNo(9);
        System.out.println(s.getRollNo());
    }
}