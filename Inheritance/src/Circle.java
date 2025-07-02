
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    // Step 4: Override area()
    @Override
    public String area() {
        double result = Math.PI * radius * radius;
        return String.format("%.2f", result); // Rounded to 2 decimal places
    }
}