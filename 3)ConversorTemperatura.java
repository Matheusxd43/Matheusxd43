import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Voce vai digitar a temperatura em qual escala (C/F)? ");
        char escala = scanner.next().toUpperCase().charAt(0);

        double temperatura, convertida;

     
        if (escala == 'F') {
            System.out.print("Digite a temperatura em Fahrenheit: ");
            temperatura = scanner.nextDouble();
            convertida = (5.0 / 9.0) * (temperatura - 32.0);
            System.out.printf("Temperatura equivalente em Celsius: %.2f\n", convertida);
        } else if (escala == 'C') {
            System.out.print("Digite a temperatura em Celsius: ");
            temperatura = scanner.nextDouble();
            convertida = (temperatura * 9.0 / 5.0) + 32.0;
            System.out.printf("Temperatura equivalente em Fahrenheit: %.2f\n", convertida);
        } else {
            System.out.println("Escala invalida. Use apenas C ou F.");
        }
    }
}
