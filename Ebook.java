public class Ebook extends Material {

    public Ebook(String titulo, String autor, String codigo) {
        super(titulo, autor, codigo);
    }

    @Override
    public int calcularPrazoDevolucao() {
        return 7; // 7 dias de prazo
    }
}
