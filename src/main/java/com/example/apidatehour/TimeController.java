package com.example.apidatehour;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/America/Guayaquil")
public class TimeController {
    LocalDateTime time;
    LocalDateTime temp;
    @GetMapping()
    public LocalDateTime getTime(){
        time = LocalDateTime.now();
        return time;
    }
    @GetMapping("time")
    public String getTimeString(){
        time = LocalDateTime.now();
        int hora = time.getHour();
        LocalDateTime time2 = time.minus(5,ChronoUnit.HOURS);
        System.out.println("la hora que obtuve es"+time2);
        time.minusHours(5);
        return  "dateTime:"+time2.toString() + "endTime";
    }
}
