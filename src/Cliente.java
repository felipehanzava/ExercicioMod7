public class Cliente {

    private int codigo;
    private String nome;
    private String endereco;
    private String telefone;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String pesquisarNome () {
        return nome;
    }

    public void cadastrarNome (String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void cadastrarEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void cadastrarTelefone(String telefone) {
        this.telefone = telefone;
    }
}
