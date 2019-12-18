class BMI {
    public static void main(String args[]) {
        double height = 63.2;
        double weight = 200.1;
        System.out.println("BMI is for height: " + height + " inches and weight: " + weight + " lbs is : "
                + (weight / (height * height)));
    }
}