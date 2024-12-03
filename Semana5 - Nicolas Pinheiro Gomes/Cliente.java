public class Cliente {
    String nome;
    String cpf;
    String email;
    String profissao;
    String telefone;
    Endereco endereco;

    public Cliente(String nome, String cpf, String email, String profissao, String telefone, Endereco endereco){
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.profissao = profissao;
        this.telefone = telefone;
        this.endereco = endereco;
    }
}
