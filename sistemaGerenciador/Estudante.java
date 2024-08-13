package sistemaGerenciador;

public class Estudante extends Usuario {
    private static final int LIMITE_EMPRESTIMOS = 3;

    public Estudante(String nome, int id) {
        super(nome, id);
    }

    @Override
    public void emprestarMaterial(Material material) {
        if (materiaisEmprestados.size() < LIMITE_EMPRESTIMOS) {
            materiaisEmprestados.add(material);
            System.out.println("Material '" + material.getTitulo() + "' emprestado ao estudante " + this.getNome());
        } else {
            System.out.println("Limite de empréstimos atingido para o estudante " + this.getNome());
        }
    }

    @Override
    public double calcularMulta(Material material, int diasAtraso) {
        return diasAtraso * 1.0; // R$1.00 por dia de atraso
    }
}