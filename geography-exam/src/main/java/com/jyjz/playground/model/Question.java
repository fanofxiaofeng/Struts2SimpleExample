package com.jyjz.playground.model;

import com.google.gson.Gson;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Question {
    private String description;
    private List<String> options = new LinkedList<>();
    private String correctAnswer;

    public Question(String description,
                    String option1,
                    String option2,
                    String option3,
                    String option4,
                    String correctAnswer) {
        this.description = description;
        this.options.add(option1);
        this.options.add(option2);
        this.options.add(option3);
        this.options.add(option4);
        this.correctAnswer = correctAnswer;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getOptions() {
        // 需要把选项打乱
        Collections.shuffle(options);
        return options;
    }

    public void setOptions(List<String> options) {
        this.options = options;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
