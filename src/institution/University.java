package institution;

import person.Student;

import java.util.ArrayList;
import java.util.List;

public class University {

    private String institutionName;
    protected List<Student> studentsList = new ArrayList<Student>();

    public University(String name) {
        this.institutionName = name;
    }

    public void addStudent(Student student) {
        studentsList.add(student);
    }

    public void showAllStudentsInfo() {
        studentsList
                .forEach(student -> System.out.println(student.getStudentName() + " - "
                        + student.getStudentKnowledgeLevel()));
    }

    //getters
    public List<Student> getStudents() {
        return studentsList;
    }

    public String getName() {
        return institutionName;
    }

}
