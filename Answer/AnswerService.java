package com.example.springboot.Answer;

import com.example.springboot.Answer.Answer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class AnswerService {

    private static List<Answer> answers = new ArrayList<>(Arrays.asList(
            new Answer(0, "Bannana" ),
            new Answer(1, "Sky" ),
            new Answer(2, "Frog" )
    ));



    public static List<Answer> getAllAnswers(){
        return answers;
    }

    public static Answer getAnswer(int id){
        return answers.get(id);
    }

    public static void addAnswer(Answer answer) {
        answers.add(answer);
    }


}
