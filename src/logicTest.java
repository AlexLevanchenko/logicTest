import java.util.Scanner;

public class logicTest {

    public static void main(String[] args) {
        double a, b, c;
        Scanner input = new Scanner(System.in);
        System.out.print("Введите значение а: ");
        a = input.nextDouble();
        System.out.print("Введите значение b: ");
        b = input.nextDouble();
        if (a <= b) {
            c = a + b;
        } else {
            c = a - b;
        }
        System.out.println("Результат: " + c);
    }
}
