package com.quizapp;

public class Question {
    String questionText;
    String[] options;
    int correctOptionIndex;

    public Question(String questionText, String[] options, int correctOptionIndex) {
        this.questionText = questionText;
        this.options = options;
        this.correctOptionIndex = correctOptionIndex;
    }

    public boolean isCorrect(int userAnswerIndex) {
        return userAnswerIndex == correctOptionIndex;
    }
}