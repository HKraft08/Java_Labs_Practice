public class TemperatureConverter {
    double temperature = 26.7;

    void convertTemp() {
        double fahrenheit = (temperature * 9/5) + 32;
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);

        double celsius = (fahrenheit - 32) * 5/9;
        System.out.println("Temperature in Celsius: " + celsius);
    }
}
