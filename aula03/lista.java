public class Lista<T> {

    private String nomeLista;
    private No<T> primeiroNo;
    private NO<T> ultimoNo;

    public Lista(){

        this("Lista");
   
    }

    public Lista(String nomeLista){

        this.nomeLista = nomeLista;
    }
}