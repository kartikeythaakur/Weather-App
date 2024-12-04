package com.example.WeatherApp.Entity;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class WeatherResponse {
    private Request request;
    private Location location;
    private Current current;

    public static class Request {
        private String type;
        private String query;
        private String language;
        private String unit;

        // Getters and Setters
        public String getType() { return type; }
        public void setType(String type) { this.type = type; }
        public String getQuery() { return query; }
        public void setQuery(String query) { this.query = query; }
        public String getLanguage() { return language; }
        public void setLanguage(String language) { this.language = language; }
        public String getUnit() { return unit; }
        public void setUnit(String unit) { this.unit = unit; }
    }

    public static class Location {
        private String name;
        private String country;
        private String region;
        private String lat;
        private String lon;
        private String timezoneId;
        private String localtime;

        // Getters and Setters
        // (Add standard getters and setters for all fields.)
    }

    public static class Current {
        @JsonProperty("temperature")
        private int temperature;
        @JsonProperty("weather_icons")
        private List<String> weatherIcons;
        @JsonProperty("weather_descriptions")
        private List<String> weatherDescriptions;
        private int wind_speed;
        private int humidity;

        // Getters and Setters
        // (Add standard getters and setters for all fields.)
    }

    // Getters and Setters for WeatherResponse fields
    public Request getRequest() { return request; }
    public void setRequest(Request request) { this.request = request; }
    public Location getLocation() { return location; }
    public void setLocation(Location location) { this.location = location; }
    public Current getCurrent() { return current; }
    public void setCurrent(Current current) { this.current = current; }
}
