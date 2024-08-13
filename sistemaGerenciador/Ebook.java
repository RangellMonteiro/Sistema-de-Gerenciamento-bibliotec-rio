package sistemaGerenciador;

public class Ebook extends Material {

    public Ebook(String titulo, String autor, int codigo) {
        super(titulo, autor, codigo);
    }

    @Override
    public int calcularPrazoDevolucao() {
        return 7; // 7 dias de prazo
    }
}
