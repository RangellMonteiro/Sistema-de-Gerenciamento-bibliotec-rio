import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Biblioteca {
    private List<Usuario> usuarios;
    private List<Material> materiais;

    public Biblioteca() {
        this.usuarios = new ArrayList<>();
        this.materiais = new ArrayList<>();
    }

    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void adicionarMaterial(Material material) {
        materiais.add(material);
    }

    public void realizarEmprestimo(Usuario usuario, Material material) {
        if (materiais.contains(material)) {
            usuario.emprestarMaterial(material);
            material.incrementarEmprestimos(); // Incrementa o contador de empréstimos
        } else {
            System.out.println("Material '" + material.getTitulo() + "' não disponível na biblioteca.");
        }
    }

    public void gerarRelatorios() {
        System.out.println("Relatório de materiais mais emprestados:");
        materiais.stream()
                .sorted(Comparator.comparingInt(Material::getNumeroEmprestimos).reversed())
                .forEach(material -> System.out
                        .println(material.getTitulo() + " - " + material.getNumeroEmprestimos() + " empréstimos"));
    }
}
