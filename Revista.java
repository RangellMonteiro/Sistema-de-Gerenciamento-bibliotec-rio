public class Revista extends Material {

    public Revista(String titulo, String autor, String codigo) {
        super(titulo, autor, codigo);
    }

    @Override
    public int calcularPrazoDevolucao() {
        return 10; // 10 dias de prazo
    }
}
