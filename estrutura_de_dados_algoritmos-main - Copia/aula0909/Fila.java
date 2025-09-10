public class Fila<T>{
    
    private No<T> primeiroNo;
    private No<T> ultimoNo;
    private String nomeFila;

    public Fila(){
        this("");
    }

    public Fila(String nomeFila){
        this.nomeFila = nomeFila;
        this.primeiroNo = null;
        this.ultimoNo = null;
    }

    public void adicionar(T dado){
        No<T> novoNo = new No<T>(dado);
        if(this.primeiroNo == null){
            primeiroNo = novoNo;
            ultimoNo = novoNo;
        } else {
            ultimoNo.setNextNo(novoNo);
            ultimoNo = novoNo;
        }
    }

    public T remover(){
        if(this.primeiroNo == null){
            System.out.println("Fila vazia!");
            return null;
        }

        T temp = primeiroNo.getDado();
        primeiroNo = primeiroNo.getNextNo();
        return temp;
    }

    public void imprimirFila(){
        if(this.primeiroNo == null){
            System.out.println("Fila vazia!");
            return;
        }

        No<T> aux = primeiroNo;
        while(aux != null){
            System.out.println("Dado { " + aux.getDado() + " }");
            aux = aux.getNextNo();
        }
    }

    
}