package edu.ucsd.cs110.temperature;

/**
 * Created by yingwu on 17/02/2017.
 */
public class Fahrenheit extends Temperature
{
    public Fahrenheit(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
       return new Celsius((float) ((this.getValue()-32)/(1.8)));
    }

    @Override
    public Temperature toFahrenheit() {
        return new Fahrenheit(this.getValue());
    }

    public String toString()
    {
        // TODO: Complete this method
        return ("" + this.getValue() + " F");
    }
}
