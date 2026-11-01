import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double n1 = input.nextDouble();
        System.out.print("Enter second number: ");
        double n2 = input.nextDouble();
        System.out.print("Enter third number: ");
        double n3 = input.nextDouble();

        double average = (n1 + n2 + n3) / 3;
        System.out.printf("Average: %.2f%n", average);
        input.close();
    }
}
