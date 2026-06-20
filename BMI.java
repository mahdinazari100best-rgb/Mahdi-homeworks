package the.bmi.class2;
public class BMI {
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

    public BMI(String name, int age, double weight, double feet, double inches) {
        this(name, age, weight, (feet * 12 + inches) * 0.0254);
    }

    public double getBMI() {
        return weight / (height * height);
    }

    public String getStatus() {
        double bmi = getBMI();
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 25) return "Normal";
        else if (bmi < 30) return "Overweight";
        else return "Obese";
    }

   
    public static void main(String[] args) {
        BMI person1 = new BMI("Ali", 25, 70, 1.75);
        BMI person2 = new BMI("Sara", 22, 60, 5, 6);

        System.out.println("Name: " + person1.getName());
        System.out.println("BMI: " + person1.getBMI());
        System.out.println("Status: " + person1.getStatus());

        System.out.println("\nName: " + person2.getName());
        System.out.println("BMI: " + person2.getBMI());
        System.out.println("Status: " + person2.getStatus());
    }

    // Getter برای name
    public String getName() {
        return name;
    }
}