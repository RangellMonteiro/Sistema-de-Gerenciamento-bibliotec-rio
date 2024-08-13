public abstract class Material { // Define a estrutura básica para os tipos de materiais
    protected String titulo;
    protected String autor;
    protected String codigo;
    protected int numeroEmprestimos;

    public Material(String titulo, String autor, String codigo) {
        this.titulo = titulo;
        this.autor = autor;
        this.codigo = codigo;
        this.numeroEmprestimos = 0;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getNumeroEmprestimos() {
        return numeroEmprestimos;
    }

    public void incrementarEmprestimos() {
        this.numeroEmprestimos++;
    }

    public abstract int calcularPrazoDevolucao();
}
