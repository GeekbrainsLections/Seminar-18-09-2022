import java.io.File;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * program
 */
public class program {
    private static int divide(int a, int b) throws ArithmeticException {
        return a / b;
    }

    public static void main(String[] args) {
        try {
            File file = new File("1.txt");
            Scanner scanner = new Scanner(file);
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int result = divide(a, b);
            System.out.println(result);
            scanner.close();
        } catch (InputMismatchException ex) {
            System.err.println("Not number entered");
        } catch (ArithmeticException ex) {
            System.err.println("Division by zero");
        } catch (Exception ex) {
            System.err.println("An error occused");
        }

    }
}