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
        String timeString;
        time = LocalDateTime.now();
        int hora = time.getHour();
        hora= hora-5;
        temp= LocalDateTime.of(time.getYear(),time.getMonth(),time.getDayOfMonth(),hora,time.getMinute());
        //timeString= time.toString();
        timeString= temp.toString();
        return "dateTime:"+timeString + "endTime";
    }
}
