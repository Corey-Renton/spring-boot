package com.example.springboot.Questions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class QuestionController {

    @Autowired
    private QuestionService questionService;


        @RequestMapping(method=RequestMethod.GET, value = "/questions")
        public List<Question> getAllQuestions(){
         return QuestionService.getAllQuestions();
        }

        @RequestMapping(method=RequestMethod.GET, value = "/questions/{id}")
        public Question getQuestion(@PathVariable int id){

            return QuestionService.getQuestion(id);
        }

        @RequestMapping(method=RequestMethod.POST, value = "/Question")
        public void addQuestion(@RequestBody Question question){
            questionService.addQuestion(question);
        }


}
