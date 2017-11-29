package com.valiton.spring.router;

public class Router {

    private float minTemp;

    public String checkTemperature(String rawTemp)
    {
        try {
            float parsed = Float.parseFloat(rawTemp);
            if (parsed < minTemp) {
                return "error";
            }
        } catch (NumberFormatException e) {
            return "error";
        }
        return "temperature-c";
    }

    public void setMinTemp(float minTemp) {
        this.minTemp = minTemp;
    }
}
