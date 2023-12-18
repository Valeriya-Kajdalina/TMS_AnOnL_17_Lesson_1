import java.util.Scanner;

public class ScannerSample {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        float number1 = scanner.nextFloat();
        System.out.println("Введите второе число: ");
        float number2 = scanner.nextFloat();
        System.out.println("Сумма введенных чисел: ");
        System.out.print(number1+number2);
    }
}
