package institution.interlink;

import institution.University;
import person.Student;

import java.util.List;
import java.util.stream.Collectors;

public class Internship extends University {

    public Internship(String name) {
        super(name);
        this.averageKnowedgeLevel = 0;
    }

    private int averageKnowedgeLevel;

    public void inviteNewStudents(List<Student> students) {
        this.studentsList = filterStudents(students);
    }

    private List<Student> filterStudents(List<Student> students) {
        this.averageKnowedgeLevel = students.stream()
                .map(item -> item.getStudentKnowledgeLevel() )
                .reduce(0, (total, elem) -> total + elem) / students.size();
        return students.stream()
                .filter(student -> student.getStudentKnowledgeLevel() > averageKnowedgeLevel).collect(Collectors.toList());
    }

    @Override
    public void showAllStudentsInfo() {
        super.showAllStudentsInfo();
        System.out.println("Necessary level (average in the university): " + this.averageKnowedgeLevel);
    }

    @Override
    public void addStudents(Student... students) {
        System.out.println("Warning! You can only invite students to the internship");
    }

}
