public class InheritanceTest {
    public static void main(String[] args) {
        // TC1: Circle with radius 5 → Area ≈ 78.5
        Shape circle1 = new Circle(5);
        System.out.println("TC1 - Circle Area: " + circle1.area());

        // TC2: Rectangle 10x5 → Area = 50
        Shape rect1 = new Rectangle(10, 5);
        System.out.println("TC2 - Rectangle Area: " + rect1.area());

        // TC3: Shape area() not overridden → Output: Default area
        Shape shape = new Shape();
        System.out.println("TC3 - Shape Area: " + shape.area());

        // TC4: Zero radius circle → Output: Area = 0
        Shape circle2 = new Circle(0);
        System.out.println("TC4 - Zero Radius Circle Area: " + circle2.area());

        // TC5: Rectangle with width 0 → Output: Area = 0
        Shape rect2 = new Rectangle(10, 0);
        System.out.println("TC5 - Rectangle Area with width 0: " + rect2.area());
    }
}