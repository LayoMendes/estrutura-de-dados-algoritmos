public class Lista<T>{

    private String nomeLista;
    private No<T> primeiroNo;
    private No<T> ultimoNo;

    public Lista(){
        this("Lista");
    }

    public Lista(String nomeLista){
        this.nomeLista = nomeLista;
        this.primeiroNo = null;
        this.ultimoNo = null;
    }

    public void imprimirLista(){
        if(primeiroNo == null){
            System.out.println("Lista vazia!");
            return;
        }

        No<T> aux = primeiroNo;
        while(aux != null){
            System.out.println("Nome { " + aux.getDado() + " }");
            aux = aux.getNextNo();
        }
    }

    public void addInicio(T dado){
        No<T> novoNo = new No<T>(dado);
        if(primeiroNo == null){
            primeiroNo = novoNo;
            ultimoNo = novoNo;
        } else {
            novoNo.setNextNo(primeiroNo);
            primeiroNo = novoNo;
        }; 
    }

    public void removerInicio(){
        if(primeiroNo == null){
            System.out.println("Lista vazia!");
        } else {
            System.out.println(primeiroNo.getDado() + " removido");
            if(primeiroNo == ultimoNo) {
                primeiroNo = null;
                ultimoNo = null;
            } else {
                primeiroNo = primeiroNo.getNextNo();
            }
        }
    }

    public void addFim(T dado){
        No<T> novoNo = new No<T>(dado);
        ultimoNo.setNextNo(novoNo);
        ultimoNo = novoNo;
    }

    public void removerFim(){
        if(ultimoNo == null){
            System.out.println("Lista vazia!");
            return;
        } else {
            if(primeiroNo == ultimoNo) {
                System.out.println(ultimoNo.getDado() + " removido");
                primeiroNo = null;
                ultimoNo = null;
            } else {
                System.out.println(ultimoNo.getDado() + " removido");
                No<T> aux = primeiroNo;

                while(aux.getNextNo() != ultimoNo){
                    aux = aux.getNextNo();
                }

                ultimoNo = aux;
                ultimoNo.setNextNo(null);
            }
        }
        
    }
}