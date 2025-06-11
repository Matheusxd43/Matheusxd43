import java.util.Locale;
import java.util.Scanner;

public class Troco {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US); // Usa ponto como separador decimal
        Scanner sc = new Scanner(System.in);

        // Entrada dos dados
        System.out.print("Preço unitário do produto: ");
        double precoUnitario = sc.nextDouble();

        System.out.print("Quantidade comprada: ");
        int quantidade = sc.nextInt();

        System.out.print("Dinheiro recebido: ");
        double dinheiroRecebido = sc.nextDouble();

        // Cálculo do troco
        double total = precoUnitario * quantidade;
        double troco = dinheiroRecebido - total;

        // Saída
        System.out.printf("TROCO = %.2f%n", troco);

        sc.close();
    }
}
