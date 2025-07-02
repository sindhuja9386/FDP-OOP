
class Rectangle extends Shape {
    private double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Step 4: Override area()
    @Override
    public String area() {
        double result = length * width;
        return String.valueOf(result);
    }
}