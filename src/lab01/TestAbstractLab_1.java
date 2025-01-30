package lab01;
import java.util.Scanner;

public class TestAbstractLab_1 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 3 sides(Example: 1 2 3): ");
        String sidesInput = input.nextLine();

        String[] numbers = sidesInput.split(" ");

        double side1 = Integer.parseInt(numbers[0]);
        double side2 = Integer.parseInt(numbers[1]);
        double side3 = Integer.parseInt(numbers[2]);

        System.out.print("Color: ");
        String colorInput = input.next();

        System.out.print("Is filled? (Boolean: true or false): ");
        boolean filledInput = input.nextBoolean();

        GeometricObject triangle = new Triangle(colorInput, filledInput, side1, side2, side3);
        System.out.println("\n" + triangle);
    }
}
