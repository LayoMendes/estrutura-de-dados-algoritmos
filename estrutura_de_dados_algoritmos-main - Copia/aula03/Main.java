class Main {
    public static void main(String[] args) {
        
        Lista<String> lista1 = new Lista<String>("Alunos");


        lista1.addInicio("user1");
        lista1.addInicio("user2");
        lista1.addInicio("user3");
        lista1.addFim("userfim");
        lista1.imprimirLista();

        System.out.println("-----------------------------------");

        lista1.removerInicio();
        lista1.removerFim();
        lista1.imprimirLista();
    }
}