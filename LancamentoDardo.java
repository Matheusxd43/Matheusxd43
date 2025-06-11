import java.util.Scanner;

public class LancamentoDardo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Digite as tres distancias:");
        double d1 = scanner.nextDouble();
        double d2 = scanner.nextDouble();
        double d3 = scanner.nextDouble();

        
        double maior = d1;
        if (d2 > maior) {
            maior = d2;
        }
        if (d3 > maior) {
            maior = d3;
        }

       
        System.out.printf("MAIOR DISTANCIA = %.2f\n", maior);
    }
}