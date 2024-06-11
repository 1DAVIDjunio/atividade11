public class Controlador {
    private Modelo modelo;
    private Visao visao;

    public Controlador() {
        this.modelo = new Modelo();
        this.visao = new Visao();
    }

    public void iniciar() {
        for (int i = 0; i < 10; i++) {
            int numero = this.visao.lerNumero();
            this.modelo.adicionarNumero(i, numero);
        }

        int numeroBusca = this.visao.lerNumero();
        int indice = this.modelo.buscarNumero(numeroBusca);
        this.visao.exibirResultado(indice);
    }
}
