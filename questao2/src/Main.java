import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        boolean validInput = false;

        //  loop com try catch para evitar que usuario dê input com entrada invalida.
        while (!validInput) {
            try {
                System.out.print("Informe um numero inteiro: ");
                number = scanner.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Por favor, insira um numero inteiro valido.");
                scanner.next();
            }
        }

        if (isFibonacci(number)) {
            System.out.println("O numero informado pertence a sequencia de Fibonacci.");
        } else {
            System.out.println("O numero informado nao pertence a sequencia de Fibonacci.");
        }

        scanner.close();
    }
    public static boolean isFibonacci(int num) {
        int a = 0, b = 1;

        while (a <= num) {
            if (a == num) {
                return true;
            }
            int temp = a + b;
            a = b;
            b = temp;
        }

        return false;
    }
}
