package com.valiton.spring.service;

public class Convert implements ConvertInterface {

    public float celsiusToFahrenheit(float degreesCelcius) {
        return degreesCelcius * 1.8f + 32;
    }

    public float fahrenheitToCelsius(float degreesFahrenheit) {
        return (degreesFahrenheit  - 32)/1.8f;
    }

}
