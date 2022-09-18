package com.example.apidatehour;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/America/Guayaquil")
public class TimeController {
    LocalDateTime time;

    @GetMapping()
    public LocalDateTime getTime(){
        time = LocalDateTime.now();
        return time;
    }
    @GetMapping("time")
    public String getTimeString(){
        String timeString;
        time = LocalDateTime.now();
        timeString= time.toString();

        return "dateTime:"+timeString + "endTime";
    }
}
