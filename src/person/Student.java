package person;

import person.consciousness.Knowledge;

public class Student extends Knowledge {

    public Student(String name) {
        super(0);
        this.studentName = name;
    }

    public Student(String name, int startKnowledgeLevel) {
        super(startKnowledgeLevel);
        this.studentName = name;
    }

    private String studentName;

    //getters
    public String getStudentName() {
        return this.studentName;
    }

    //setters
    public void setKnowledgeLevel(int level) {
        if (level > 100 || level < 0)
            System.out.println("Warning (" + this.getStudentName() + "): max level 100, min - 0");
        else
            this.knowledgeLevel = level;
    }

}