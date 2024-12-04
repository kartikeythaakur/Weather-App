package com.example.WeatherApp.Controller;

import com.example.WeatherApp.Service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@CrossOrigin(origins = "*") //Frontend access
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @GetMapping("/weather")
    public Map<String, Object> Weather(@RequestParam String location){
        return weatherService.getWeather(location);
    }
}
