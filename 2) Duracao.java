import java.util.Scanner;

public class Duracao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada
        System.out.print("Digite a duracao em segundos: ");
        int duracaoTotal = sc.nextInt();

        // Cálculos
        int horas = duracaoTotal / 3600;
        int minutos = (duracaoTotal % 3600) / 60;
        int segundos = duracaoTotal % 60;

        // Saída
        System.out.println(horas + ":" + minutos + ":" + segundos);

        sc.close();
    }
}
