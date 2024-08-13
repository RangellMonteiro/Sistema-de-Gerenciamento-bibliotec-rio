public class Professor extends Usuario {
    private static final int LIMITE_EMPRESTIMOS = 5;

    public Professor(String nome, String id) {
        super(nome, id);
    }

    @Override
    public void emprestarMaterial(Material material) {
        if (materiaisEmprestados.size() < LIMITE_EMPRESTIMOS) {
            materiaisEmprestados.add(material);
            System.out.println("Material '" + material.getTitulo() + "' emprestado ao professor " + this.getNome());
        } else {
            System.out.println("Limite de empréstimos atingido para o professor " + this.getNome());
        }
    }

    @Override
    public double calcularMulta(Material material, int diasAtraso) {
        return diasAtraso * 10; // R$10 por dia de atraso
    }
}
