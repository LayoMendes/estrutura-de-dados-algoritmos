public class ListaCircular<T>{

    private No<T> primeiroNo;
    private No<T> ultimoNo;
    private String nomeListaCircular;
    private int tamanho;

    public ListaCircular(String nomeListaCircular){
        this.nomeListaCircular = nomeListaCircular;
        this.primeiroNo = null;
        this.ultimoNo = null;
        this.tamanho = 0;

    }

    public int tamanhoLista(){
        return tamanho;

    }

    public void addInicio(){
        
    }
}