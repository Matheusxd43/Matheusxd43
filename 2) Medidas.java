import java.util.Locale;
import java.util.Scanner;

public class Medidas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US); // Usa ponto como separador decimal
        Scanner sc = new Scanner(System.in);

        // Leitura das medidas
        System.out.print("Digite a medida A: ");
        double a = sc.nextDouble();

        System.out.print("Digite a medida B: ");
        double b = sc.nextDouble();

        System.out.print("Digite a medida C: ");
        double c = sc.nextDouble();

        // Cálculos das áreas
        double areaQuadrado = a * a;
        double areaTriangulo = (a * b) / 2.0;
        double areaTrapezio = ((a + b) * c) / 2.0;

        // Saídas formatadas com 4 casas decimais
        System.out.printf("AREA DO QUADRADO = %.4f%n", areaQuadrado);
        System.out.printf("AREA DO TRIANGULO = %.4f%n", areaTriangulo);
        System.out.printf("AREA DO TRAPEZIO = %.4f%n", areaTrapezio);

        sc.close();
    }
}
