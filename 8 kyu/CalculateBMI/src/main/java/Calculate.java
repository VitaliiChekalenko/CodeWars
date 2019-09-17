/*Write function bmi that calculates body mass index (bmi = weight / height ^ 2).

if bmi <= 18.5 return "Underweight"

if bmi <= 25.0 return "Normal"

if bmi <= 30.0 return "Overweight"

if bmi > 30 return "Obese"*/

public class Calculate {
  public static String bmi(double weight, double height) {
    double res= weight/(height*height);
    return  res<=18.5? "Underweight": res<=25.0? "Normal": res<=30.0? "Overweight":"Obese" ;
  }
}