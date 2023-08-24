package javabean;

public class StudentOutput {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.setId(111);
        stu.setName("pranish");
        System.out.println("Student name is"+stu.getName());
        System.out.println("Student Id is "+stu.getId());
    }
}
