import java.util.Scanner;

public class MedidorGlicose {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite a medida da glicose: ");
        double glicose = scanner.nextDouble();

        
        String classificacao;
        if (glicose <= 100.0) {
            classificacao = "normal";
        } else if (glicose <= 140.0) {
            classificacao = "elevado";
        } else {
            classificacao = "diabetes";
        }

        
        System.out.println("Classificacao: " + classificacao);
    }
}