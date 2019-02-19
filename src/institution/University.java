package institution;

import person.Student;

import java.util.ArrayList;
import java.util.List;

public class University {

    public University(String name) {
        this.institutionName = name;
    }

    private String institutionName;

    protected List<Student> studentsList = new ArrayList<Student>();

    public void addStudents(Student... students) {
        List<Student> studentsList = new ArrayList<Student>();
        for (int i = 0; i < students.length; i++)
            studentsList.add(students[i]);
        this.studentsList.addAll(studentsList);
    }

    public void showAllStudentsInfo() {
        this.studentsList
                .forEach(student -> System.out.println(student.getStudentName() + " - "
                        + student.getStudentKnowledgeLevel()));
    }

    //getters
    public List<Student> getStudents() {
        return this.studentsList;
    }

    public String getName() {
        return this.institutionName;
    }

}
