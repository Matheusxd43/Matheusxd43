import java.util.Locale;
import java.util.Scanner;

public class Consumo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US); // Usa ponto como separador decimal
        Scanner sc = new Scanner(System.in);

        // Entrada dos dados
        System.out.print("Distancia percorrida: ");
        int distancia = sc.nextInt();

        System.out.print("Combustível gasto: ");
        double combustivel = sc.nextDouble();

        // Cálculo do consumo médio
        double consumoMedio = distancia / combustivel;

        // Saída com três casas decimais
        System.out.printf("Consumo medio = %.3f%n", consumoMedio);

        sc.close();
    }
}
