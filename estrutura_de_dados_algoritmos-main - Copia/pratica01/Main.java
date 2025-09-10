class Main{
    public static void main(String[] args) {
        
        Fila<String> fila1 = new Fila<String>("Alunos");

        fila1.adicionar("Marta");
        fila1.adicionar("Paulo");
        fila1.adicionar("Jorge");
        fila1.imprimirFila();   
    }
}