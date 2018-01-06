package com.jyjz.playground.action;

import com.jyjz.playground.model.Question;
import com.opensymphony.xwork2.ActionSupport;

import java.util.ArrayList;
import java.util.List;

public class ExamAction extends ActionSupport {
    private List<Question> questions = new ArrayList<>();
    private String answer;
    private static int position = 0;
    private static int currentScore = 0;
    private static final int fullScore = 4;

    {
        Question question = new Question("面积最大的国家",
                "中国", "俄罗斯", "美国", "印度",
                "俄罗斯");
        questions.add(question);

        question = new Question("人口最多的国家",
                "中国", "印度", "美国", "孟加拉国",
                "中国");
        questions.add(question);

        question = new Question("最大的淡水湖",
                "太湖", "苏必利尔湖", "里海", "死海",
                "苏必利尔湖");
        questions.add(question);

        question = new Question("亚洲最大的岛屿",
                "格陵兰岛", "本州岛", "加里曼丹岛", "新几内亚岛",
                "新几内亚岛");
        questions.add(question);
    }


    @Override
    public String execute() {
        System.out.println("\n\n\n\n\n\n\n\n");
        System.out.println("\n\n\n\n\n\n\n\n");
        Question currentQuestion = getCurrentQuestion();
        if (currentQuestion.getCorrectAnswer().equals(answer)) {
            currentScore++;
        }
        System.out.println("answer is: " + answer);
        System.out.println("\n\n\n\n\n\n\n\n");
        System.out.println("\n\n\n\n\n\n\n\n");
        answer = null;
        position++;
        System.out.println("position is: " + position);
        if (position >= questions.size()) {
            return SUCCESS;
        } else {
            return INPUT;
        }
    }

    @Override
    public String input() {
        return INPUT;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public int getPosition() {
        return position;
    }

    public Question getCurrentQuestion() {
        if (position < questions.size()) {
            return questions.get(position);
        } else {
            return new Question("有问题",
                    "A", "b", "C", "DD",
                    "?");
        }
    }

    public int getCurrentScore() {
        return currentScore;
    }

    public int getFullScore() {
        return fullScore;
    }
}
