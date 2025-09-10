import java.util.ArrayList;

class Main{
    public static void main(String[] args){

        No<String> string_obj1 = new No<String>("Andre");
        No<String> string_obj2 = new No<String>("Paula", string_obj1);
        No<String> string_obj3 = new No<String>("Bruno", string_obj2);
        No<String> string_obj4 = new No<String>("João", string_obj3);

        No<String> aux = string_obj4;
        while (aux != null){
            System.out.println(aux + "\n");
            aux = aux.getNextNo();
        }
    }
}