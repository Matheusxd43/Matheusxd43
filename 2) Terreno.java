import java.util.Locale;
import java.util.Scanner;

public class Terreno {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US); // Usa ponto como separador decimal
        Scanner sc = new Scanner(System.in);

        // Leitura dos dados
        System.out.print("Digite a largura do terreno: ");
        double largura = sc.nextDouble();

        System.out.print("Digite o comprimento do terreno: ");
        double comprimento = sc.nextDouble();

        System.out.print("Digite o valor do metro quadrado: ");
        double valorMetroQuadrado = sc.nextDouble();

        // Cálculos
        double area = largura * comprimento;
        double preco = area * valorMetroQuadrado;

        // Saída formatada
        System.out.printf("Area do terreno = %.2f%n", area);
        System.out.printf("Preco do terreno = %.2f%n", preco);

        sc.close();
    }
}