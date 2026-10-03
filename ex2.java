// File: Converter.java
package temperature;
public class Converter {
public static double celsiusToFahrenheit(
double c) {
return (c * 9 / 5) + 32;
}
public static double fahrenheitToCelsius(
double f) {
return (f - 32) * 5 / 9;
}
public static double celsiusToKelvin(double
c) {
return c + 273.15;
}
public static double kelvinToCelsius(double
k) {
return k - 273.15;
}
public static double fahrenheitToKelvin(
double f) {
return (f - 32) * 5 / 9 + 273.15;
}
public static double kelvinToFahrenheit(
double k) {
return (k - 273.15) * 9 / 5 + 32;
}
}
// File: TemperatureMain.java
import temperature.Converter;
class TemperatureMain {
public static void main(String[] args) {
double c = 25;
System.out.println("Celsius to
Fahrenheit: "
+ Converter.celsiusToFahrenheit(c));
System.out.println("Celsius to Kelvin: "
+ Converter.celsiusToKelvin(c));
System.out.println("Fahrenheit to
Celsius: "
+ Converter.fahrenheitToCelsius(
77));
System.out.println("Kelvin to Celsius: "
+ Converter.kelvinToCelsius(298.
15));
}
}
OUTPUT
Celsius to Fahrenheit: 77.0
Celsius to Kelvin: 298.15
Fahrenheit to Celsius: 25.0
Kelvin to Celsius: 25.0