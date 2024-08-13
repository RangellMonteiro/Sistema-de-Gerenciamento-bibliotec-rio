package sistemaGerenciador;

public class LivroFisico extends Material {

    public LivroFisico(String titulo, String autor, int codigo) {
        super(titulo, autor, codigo);
    } // Método construtor

    @Override
    public int calcularPrazoDevolucao() {
        return 14; // 14 dias de prazo
    }
}
