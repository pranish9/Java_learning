package CollectionFramework.ArrayList;
import java.util.ArrayList;

public class StudentUseCaseImpl {
    public void displayStudentInfo(){
        ArrayList<Student> arrayList = new ArrayList<>();
    Student student = new Student();
        Student student1 = new Student();
    student.setId(111);
    student.setName("Pranish");
    arrayList.add(student);
    arrayList.add(student1);
        System.out.println(arrayList);


    }
}
