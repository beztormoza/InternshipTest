package person.consciousness;

public abstract class Knowledge {

    public Knowledge(int level) {
        this.knowledgeLevel = level;
    }

    protected int knowledgeLevel;

    //getters
    public int getStudentKnowledgeLevel() {
        return this.knowledgeLevel;
    }

}
