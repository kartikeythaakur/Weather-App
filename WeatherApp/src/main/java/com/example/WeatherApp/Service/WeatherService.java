package com.example.WeatherApp.Service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {

    String api_key = "50c8b641affca7281584aaca9d0052b6";
    String API = "http://api.weatherstack.com/current?access_key=API_KEY&query=city";

    @Autowired
    private RestTemplate restTemplate;

    public Map getWeather(String location){

        String finalApi = API.replace("API_KEY",api_key).replace("city",location);
        return restTemplate.getForObject(finalApi, Map.class);
        
    }

}
