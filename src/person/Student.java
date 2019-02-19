package person;

import person.consciousness.Knowledge;

public class Student extends Knowledge {

    public Student(String name) {
        super(0);
        this.studentName = name;
    }

    public Student(String name, int startKnowledgeLevel) {
        super(0);
        this.studentName = name;
        if (startKnowledgeLevel >= 0 && startKnowledgeLevel <= 100)
            this.knowledgeLevel = startKnowledgeLevel;
        else
            System.out.println("Can't set " + startKnowledgeLevel + " knowledge level to " + name
                                + " (max level 100, min - 0, autoset is 0)");
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