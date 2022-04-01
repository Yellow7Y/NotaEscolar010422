import java.util.Scanner;

public class NotaEscolar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite sua nota: ");
        Double nota = scanner.nextDouble();
        if (nota >= 70) {
            System.out.print("Parabéns, voce passou de ano: ");
        }
        else{
            System.out.print("Infelismente, voce está de recuperacao: ");
        }
    }
}