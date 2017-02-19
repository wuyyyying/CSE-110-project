package edu.ucsd.cs110.temperature;

/**
 * Created by yingwu on 17/02/2017.
 */
public class Celsius extends Temperature
{
    public Celsius(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        return new Celsius(this.getValue());
    }

    @Override
    public Temperature toFahrenheit() {
        return new Fahrenheit((float) (this.getValue()*1.8+32));
    }

    public String toString()
    {
        return (""+ this.getValue() + " C");
    }
}