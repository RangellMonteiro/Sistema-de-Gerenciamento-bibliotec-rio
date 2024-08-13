import java.util.ArrayList;
import java.util.List;

public abstract class Usuario { // Classe abstrata que define a estrutura básica para os usuários do sistema.
    protected String nome;
    protected String id;
    protected List<Material> materiaisEmprestados;

    public Usuario(String nome, String id) {
        this.nome = nome;
        this.id = id;
        this.materiaisEmprestados = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getId() {
        return id;
    }

    public List<Material> getMateriaisEmprestados() {
        return materiaisEmprestados;
    }

    public abstract void emprestarMaterial(Material material);

    public abstract double calcularMulta(Material material, int diasAtraso);
}
