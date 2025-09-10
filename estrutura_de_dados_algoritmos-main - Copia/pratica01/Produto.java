public class Produto{
    private String nome;
    private double preco;

    public Produto(){
        this("", 0.0);
    }

    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String toString(){
        return "Dado {" + this.nome + " " + this.preco + "}";
    }
}