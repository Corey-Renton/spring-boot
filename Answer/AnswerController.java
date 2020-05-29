package com.example.springboot.Answer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AnswerController {

    @Autowired
    private AnswerService answerService;


    @RequestMapping(method=RequestMethod.GET, value = "/answers")
    public List<Answer> getAllAnswers(){
        return AnswerService.getAllAnswers();
    }

    @RequestMapping(method=RequestMethod.POST, value = "/quiz/answer/{answer}")
    public void addAnswer(@RequestBody Answer answer){
        AnswerService.addAnswer(answer);
    }

}
