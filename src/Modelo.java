import java.util.Arrays;

public class Modelo {
    private int[] numeros;

    public Modelo() {
        this.numeros = new int[10]; // Armazena 10 números
    }

    public void adicionarNumero(int index, int numero) {
        this.numeros[index] = numero;
        Arrays.sort(this.numeros); // Mantém a array ordenada para a busca binária
    }

    public int buscarNumero(int numero) {
        int inicio = 0;
        int fim = this.numeros.length - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;

            if (this.numeros[meio] == numero) {
                return meio; // Retorna o índice se o número for encontrado
            } else if (this.numeros[meio] < numero) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }

        return -1; // Retorna -1 se o número não for encontrado
    }
}
