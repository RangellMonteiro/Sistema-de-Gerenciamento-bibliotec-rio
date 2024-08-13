public class LivroFisico extends Material {

    public LivroFisico(String titulo, String autor, String codigo) {
        super(titulo, autor, codigo);
    } // Método contrutor

    @Override
    public int calcularPrazoDevolucao() {
        return 14; // 14 dias de prazo
    }
}
