package com.example.springboot.Points;

import com.example.springboot.Points.Points;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class PointsService {

    private static List<Points> points = new ArrayList<>(Arrays.asList(
            new Points(0, 2 ),
            new Points(1, 5),
            new Points(2,5)

    ));

    public static List<Points> getAllPoints(){
        return points;
    }

    public static Points getPoints(int id){
        return points.get(id);
    }

    public static void addPoints(Points point) {
        points.add(point);
    }


}


