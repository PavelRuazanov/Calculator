import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    System.out.println("Введите операцию: ");
    System.out.println("1. Сложение.");
    System.out.println("2. Вычитание.");
    System.out.println("3. Умножение.");
    System.out.println("4. Деление.");
    Scanner scanner = new Scanner(System.in);
    int operation = scanner.nextInt();
    System.out.println("Введите первое число");
    int firstNumber = scanner.nextInt();
    System.out.println("Введите второе число");
    int secondNumber = scanner.nextInt();

    double result = 0;
    switch (operation) {
      case 1-> result = firstNumber + secondNumber;
      case 2-> result = firstNumber - secondNumber;
      case 3-> result = firstNumber * secondNumber;
      case 4-> result = (double) firstNumber / secondNumber;
    }
    System.out.println("Ваш результат: " + result);
  }
}
