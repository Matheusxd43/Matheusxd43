import java.util.Locale;
import java.util.Scanner;

public class Circulo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US); // Garante uso de ponto decimal
        Scanner sc = new Scanner(System.in);

        // Entrada do raio
        System.out.print("Digite o valor do raio do circulo: ");
        double raio = sc.nextDouble();

        // Cálculo da área
        double area = Math.PI * raio * raio;

        // Saída com três casas decimais
        System.out.printf("AREA = %.3f%n", area);

        sc.close();
    }
}
