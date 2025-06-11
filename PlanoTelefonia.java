import java.util.Scanner;

public class PlanoTelefonia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada: minutos consumidos
        System.out.print("Digite a quantidade de minutos: ");
        int minutos = scanner.nextInt();

        // Constantes do plano
        double valorBase = 50.00;
        int franquia = 100;
        double valorExcedentePorMinuto = 2.00;
        double valorFinal = valorBase;

        // Verifica se houve excedente
        if (minutos > franquia) {
            int minutosExcedentes = minutos - franquia;
            valorFinal += minutosExcedentes * valorExcedentePorMinuto;
        }

        // Exibe o valor a pagar
        System.out.printf("Valor a pagar: R$ %.2f\n", valorFinal);
    }
}