public class Main{
    public static void main(String[] args) {
        Fila<Integer> fila1 = new Fila<Integer>("Inteiros");

        fila1.adicionar(56);
        fila1.adicionar(568);
        fila1.adicionar(879);
        fila1.adicionar(123);
        fila1.imprimirFila();
        System.out.println("-----------------");
        System.out.println("Removido: " + fila1.remover());
        fila1.imprimirFila();
        System.out.println("-----------------");
        fila1.adicionar(13);
        fila1.imprimirFila();
        System.out.println("-----------------");
    }
}