public class Main{
    public static void main(String[] args){

        Pessoa pessoa = new Pessoa();
        Professor professor = new Professor(1, "João", 30, 12345678901L);
        Aluno aluno = new Aluno(1, "Maria", 34, 12345678901L);

        System.out.println(pessoa.toString() + "\n-----------");
        pessoa.setIdade(40);
        System.out.println(professor.toString() + "\n-----------");
        System.out.println(aluno.toString() + "\n-----------");
    }
}