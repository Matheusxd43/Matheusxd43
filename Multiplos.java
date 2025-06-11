import java.util.Scanner;

public class Multiplos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite dois numeros inteiros:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();


        if (a % b == 0 || b % a == 0) {
            System.out.println("Sao multiplos");
        } else {
            System.out.println("Nao sao multiplos");
        }
    }
}
