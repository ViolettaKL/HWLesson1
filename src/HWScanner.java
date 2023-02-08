import java.util.Scanner;
public class HWScanner {
    public static void main(String[] args) {
        System.out.print("Введите число от 1 до 10: ");
        Scanner scan = new Scanner(System.in);
        int numberOne = scan.nextInt();
        System.out.print("Введите число от 1 до 10: ");
        int numberTwo = scan.nextInt();

        int result = numberOne * numberTwo;
        System.out.println("Результат:" + result);
    }
}
