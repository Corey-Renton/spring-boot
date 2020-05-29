package com.example.springboot.Points;


import com.example.springboot.Points.Points;
import com.example.springboot.Points.PointsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PointsController {

    @Autowired
    private PointsService pointsService;

    @RequestMapping(method=RequestMethod.GET, value = "/quiz/score")
    public List<Points> getAllPoints(){
        return PointsService.getAllPoints();
    }


    @RequestMapping(method=RequestMethod.GET, value = "/quiz/score/{player}")
    public Points getPoints(@PathVariable int player){

        return PointsService.getPoints(player);
    }



}
