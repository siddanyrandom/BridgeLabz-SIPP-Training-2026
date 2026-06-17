public class BMICalculator {
    static double calculateBMI(double weight,double heightCm){
        double h=heightCm/100.0;
        return weight/(h*h);
    }
    static String getStatus(double bmi){
        if(bmi<18.5) return "Underweight";
        if(bmi<25) return "Normal";
        if(bmi<30) return "Overweight";
        return "Obese";
    }
}
