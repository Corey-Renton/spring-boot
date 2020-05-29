package com.example.springboot.Questions;

import com.example.springboot.Questions.Question;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class QuestionService {


        private static List<Question> questions = new ArrayList<>(Arrays.asList(
            new Question(0, "What is yellow?", "Bannana" ),
                new Question(1, "What is blue?", "Sky" ),
                 new Question(2, "What is Green?", "Frog" )
        ));


        public static List<Question> getAllQuestions(){
            return questions;
        }

        public static Question getQuestion(int id){
            return questions.get(id);
        }

    public void addQuestion(Question question) {
            questions.add(question);
    }

}
