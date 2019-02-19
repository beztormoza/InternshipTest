package institution.interlink;

import institution.University;
import person.Student;

import java.util.List;
import java.util.stream.Collectors;

public class Internship extends University {

    public Internship(String name) {
        super(name);
        this.averageKnowledgeLevel = 0;
    }

    private int averageKnowledgeLevel;

    public void addStudents(List<Student> students) {
        this.studentsList = filterStudents(students);
    }

    //adding single student to party
    public void addStudents(Student student) {
        if (student.getStudentKnowledgeLevel() >= this.averageKnowledgeLevel)
            this.studentsList.add(student);
        else
            System.out.println(student.getStudentName() + "'s knowledge level ("
                               + student.getStudentKnowledgeLevel() +") isn't enought ("
                               + this.averageKnowledgeLevel + ")");
    }

    private List<Student> filterStudents(List<Student> students) {
        this.averageKnowledgeLevel = students.stream()
                .map(item -> item.getStudentKnowledgeLevel() )
                .reduce(0, (total, elem) -> total + elem) / students.size();
        return students.stream()
                .filter(student -> student.getStudentKnowledgeLevel() > averageKnowledgeLevel).collect(Collectors.toList());
    }

    @Override
    public void showAllStudentsInfo() {
        super.showAllStudentsInfo();
        System.out.println("Necessary level (average in the university): " + this.averageKnowledgeLevel);
    }

}
