public class main {
    public static void main(String[] args) {

        Circle circle1 = new Circle();
        System.out.println("The Area of the circle number 1 with the radius of " + circle1.Radius + " is " + circle1.getArea());

        Circle circle2 = new Circle(25);

        System.out.println("The Area of the circle number 2 with the radius of " + circle2.Radius + " is " + circle2.getArea());

        Circle circle3 = new Circle(125);
        System.out.println("The Area of the circle number 3 with the radius of " + circle3.Radius + " is " + circle3.getArea());


        circle2.setRadius(100);
        System.out.println("The new area of circle number 2 with the radius of " + circle2.Radius + " is " + circle2.getArea());
    }
}






