package entity;

import java.util.Map;

public class MQuestion {
    private int id;
    private String name;
    private Map<String, MUser> answers;

    public MQuestion() {
    }

    public MQuestion(String name, Map<String, MUser> answers) {
        super();
        this.name = name;
        this.answers = answers;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, MUser> getAnswers() {
        return answers;
    }

    public void setAnswers(Map<String, MUser> answers) {
        this.answers = answers;
    }

}