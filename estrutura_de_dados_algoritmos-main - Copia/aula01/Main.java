import java.util.ArrayList;

public class Main{
    public static void main(String[] args){

        ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
        
        if (args.length > 0){
            int idade = Integer.parseInt(args[1]);
            pessoas.add(new Pessoa(args[0], idade));
        }

        pessoas.add(new Pessoa("Maria", 25));
        pessoas.add(new Pessoa("Pedro", 40));

        for (Pessoa p : pessoas) {
            System.out.println(p.getNome());
        }

    }
}

