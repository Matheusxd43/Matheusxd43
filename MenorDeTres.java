import java.util.Scanner;

public class MenorDeTres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Primeiro valor: ");
        int n1 = sc.nextInt();

        System.out.print("Segundo valor: ");
        int n2 = sc.nextInt();

        System.out.print("Terceiro valor: ");
        int n3 = sc.nextInt();

        int menor = n1;

        if (n2 < menor) {
            menor = n2;
        }
        if (n3 < menor) {
            menor = n3;
        }

        System.out.println("MENOR = " + menor);

        sc.close();
    }
}