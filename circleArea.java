import java.util.Scanner; // Importing Scanner class

public class CircleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for radius
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        // Calculate area
        double area = Math.PI * radius * radius;

        // Display the area
        System.out.println("The area of the circle is: " + area);
    }
}
