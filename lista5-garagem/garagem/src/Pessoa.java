public class Pessoa{
    public String nome;
    public int cpf;
    public int telefone;
    
    public Pessoa(String nome, int cpf, int telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;

    }    
        
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
}