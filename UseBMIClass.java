package bmi.pkgclass;
 class BMI {
    private String name;
    private int age;
    private double weight;
    private double height;
    
    public BMI(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }
    
    public BMI(String name, double weight, double height) {
        this(name, 20, weight, height);
    }
    
    public double getBMI() {
        double bmi = weight * 0.45359237 / ((height * 0.0254) * (height * 0.0254));
        return Math.round(bmi * 100) / 100.0;
    }
    
    public String getStatus() {
        double bmi = getBMI();
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Normal";
        } else if (bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public double getWeight() {
        return weight;
    }
    
    public double getHeight() {
        return height;
    }
}
public class UseBMIClass {
    public static void main(String[] args) {
        BMI bmi1 = new BMI("John", 25, 170, 70);
        BMI bmi2 = new BMI("Sarah", 130, 65);
        
        System.out.println(bmi1.getName() + " BMI: " + bmi1.getBMI());
        System.out.println(bmi1.getName() + " Status: " + bmi1.getStatus());
        System.out.println(bmi2.getName() + " BMI: " + bmi2.getBMI());
        System.out.println(bmi2.getName() + " Status: " + bmi2.getStatus());
    }
}