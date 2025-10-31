package com.quizapp;

import java.util.*;

public class QuizApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Question> questions = new ArrayList<>();
        questions.add(new Question("What is the capital of India?",
                new String[]{"Mumbai", "Delhi", "Kolkata", "Chennai"}, 1));
        questions.add(new Question("Which language runs in a web browser?",
                new String[]{"Java", "C", "Python", "JavaScript"}, 3));
        questions.add(new Question("What is 5 + 3?",
                new String[]{"5", "8", "10", "15"}, 1));

        int score = 0;

        for (int i = 0; i < questions.size(); i++) {
            Question q = questions.get(i);
            System.out.println("\nQ" + (i + 1) + ": " + q.questionText);
            for (int j = 0; j < q.options.length; j++) {
                System.out.println((j + 1) + ". " + q.options[j]);
            }

            System.out.print("Your answer (1-4): ");
            int userAnswer = scanner.nextInt() - 1;

            if (q.isCorrect(userAnswer)) {
                System.out.println("✅ Correct!");
                score++;
            } else {
                System.out.println("❌ Wrong! Correct answer: " + q.options[q.correctOptionIndex]);
            }
        }

        System.out.println("\n🎯 Quiz Over!");
        System.out.println("Total Questions: " + questions.size());
        System.out.println("Correct Answers: " + score);
        System.out.println("Your Score: " + (score * 100 / questions.size()) + "%");

        scanner.close();
    }
}