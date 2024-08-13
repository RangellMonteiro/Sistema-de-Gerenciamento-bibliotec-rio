public class Funcionario extends Usuario {
    private static final int LIMITE_EMPRESTIMOS = 4;

    public Funcionario(String nome, String id) {
        super(nome, id);
    }

    @Override
    public void emprestarMaterial(Material material) {
        if (materiaisEmprestados.size() < LIMITE_EMPRESTIMOS) {
            materiaisEmprestados.add(material);
            System.out.println("Material '" + material.getTitulo() + "' emprestado ao funcionário " + this.getNome());
        } else {
            System.out.println("Limite de empréstimos atingido para o funcionário " + this.getNome());
        }
    }

    @Override
    public double calcularMulta(Material material, int diasAtraso) {
        return diasAtraso * 5; // R$5 por dia de atraso
    }
}
