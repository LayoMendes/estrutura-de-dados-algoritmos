class Main{
    public static void main(String[] args) {
        
        Pilha<String> pilha1 = new Pilha<String>("Letras");

        pilha1.push("a");
        pilha1.push("b");
        System.out.println(pilha1.pop());
        pilha1.imprimirPilha();

    }
}