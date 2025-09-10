public class Pilha<T>{
    
    private No<T> topo;
    private String nomePilha;

    public Pilha(){
        this("");
    }

    public Pilha(String nomePilha){
        this.nomePilha = nomePilha;
        this.topo = null;
    }

    public void imprimirPilha(){
        if(this.topo == null){
            System.out.println("Pilha vazia!");
            return;
        }

        No<T> aux = topo;
        while(aux != null){
            System.out.println("Dado { " + aux.getDado() + " }");
            aux = aux.getNextNo();
        }
    }

    public void push(T dado){
        No<T> novoNo = new No<T>(dado);
        novoNo.setNextNo(this.topo);
        this.topo = novoNo;
    }

    public T pop(){
        if(this.topo == null){
            System.out.println("Pilha vazia!");
            return null;
        }

        T temp = top.getDado();
        topo = topo.getNextNo();
        return temp;
    }

    public T peek(){
        return topo.getDado();
    }
}