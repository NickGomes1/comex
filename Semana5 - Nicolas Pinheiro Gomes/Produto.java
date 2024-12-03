public class Produto{
    private String nome;
    private String descricao;
    private double precoUnitario;
    private int quantidade;

    public Produto(String nome, String descricao, double precoUnitario, int quantidade){
        this.nome = nome;
        this.descricao = descricao;
        this.precoUnitario = precoUnitario;
        this.quantidade = quantidade;
    }

    public Produto(String nome){
        this.nome = nome;
    }

    public void getInfo(){
        System.out.println(">> Dados do produto:");
        System.out.println("Nome: " + this.nome);
        System.out.println("Descrição: " + this.descricao);
    }

    public String getNome(){
        return this.nome;
    }

    public String getDescricao(){
        return this.descricao;
    }

    public double getPrecoUnitario(){
        return this.precoUnitario;
    }

    public int getQuantidade(){
        return this. quantidade;
    }

    public void setNome(String nome){
        this.nome = nome; 
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public void setPrecoUnitario(Double precoUnitario){
        this.precoUnitario = precoUnitario;
    }

    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
}