import java.util.Scanner;

public class Visao {
    private Scanner scanner;

    public Visao() {
        this.scanner = new Scanner(System.in);
    }

    public int lerNumero() {
        System.out.print("Digite um número: ");
        return this.scanner.nextInt();
    }

    public void exibirResultado(int indice) {
        if (indice != -1) {
            System.out.println("O número foi encontrado no índice " + indice);
        } else {
            System.out.println("O número não foi encontrado.");
        }
    }
}
