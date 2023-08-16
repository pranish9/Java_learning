package ConsoleApp;

import java.util.ArrayList;
import java.util.List;

public class StudentServiceImpl implements  StudentService {

    List<Student> slist = new ArrayList<>();
    @Override
    public void addStudent(Student s) {
        slist.add(s);
        System.out.println("=================Added Successfully==================");
    }

    @Override
    public void deleteStudent(int index) {
    slist.remove(index);
        System.out.println("=================Removed Successfully==================");
    }

    @Override
    public List<Student> getAllStudent() {
        return null;
    }
}
