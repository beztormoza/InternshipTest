package person;

import person.consciousness.Knowledge;

public class Student extends Knowledge {

    private String studentName;

    public Student(String name, int startKnowledgeLevel) {
        super(startKnowledgeLevel);
        this.studentName = name;
    }

    //getters
    public String getStudentName() {
        return studentName;
    }

}
