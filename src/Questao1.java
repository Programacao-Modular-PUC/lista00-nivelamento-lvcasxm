import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = 1;

        System.out.println("Digite um número: ");
        x = scanner.nextInt();

        int fatorial = 1;

        for (int i = 1; i <= x; i++) {
            fatorial *= i;
        }

        System.out.println("Fatorial: " + fatorial);
    }
}
