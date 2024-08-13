package sistemaGerenciador;

public class Principal {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Usuario estudante = new Estudante("João", 123);
        Usuario professor = new Professor("Maria", 456);
        Usuario funcionario = new Funcionario("Ana", 140);

        Material livro1 = new LivroFisico("Java Programming", "John Doe", 001);
        Material ebook1 = new Ebook("Effective Java", "Joshua Bloch", 002);
        Material revista1 = new Revista("Tech Today", "Jane Smith", 003);

        biblioteca.adicionarUsuario(estudante);
        biblioteca.adicionarUsuario(professor);
        biblioteca.adicionarUsuario(funcionario);

        biblioteca.adicionarMaterial(livro1);
        biblioteca.adicionarMaterial(ebook1);
        biblioteca.adicionarMaterial(revista1);

        biblioteca.realizarEmprestimo(estudante, livro1);
        biblioteca.realizarEmprestimo(professor, ebook1);
        biblioteca.realizarEmprestimo(funcionario, revista1);
        biblioteca.realizarEmprestimo(estudante, livro1); // Empréstimo repetido para testar o contador
        biblioteca.realizarEmprestimo(professor, livro1); // Empréstimo repetido para testar o contador

        biblioteca.gerarRelatorios(); // Gera o relatório de materiais mais emprestados

    }

}
