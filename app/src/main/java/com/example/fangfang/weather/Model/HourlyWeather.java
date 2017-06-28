package com.example.fangfang.weather.Model;

/**
 *
 */

public class HourlyWeather {
    private String time;  //时间
    private String temp;  //温度
    private String pop;  //降水概率
    private String wind;   //风力

    public HourlyWeather(String time, String temp, String pop, String wind){
        this.temp = temp;
        this.time = time;
        this.pop = pop;
         this.wind = wind;
    }


    public String getTime() {
        return time;
    }

    public String getTemp() {
        return temp;
    }

    public String getPop() {
        return pop;
    }

    public String getWind() {
        return wind;
    }
}
