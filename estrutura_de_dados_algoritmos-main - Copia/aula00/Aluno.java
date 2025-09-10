public class Aluno extends Pessoa{
	private int alunoId;

	public Aluno(int alunoId, String nome, int idade, long cpf) {
		super(nome, idade, cpf);
		this.alunoId = alunoId;
	}

	public int getAlunoId() {
		return alunoId;
	}

	public void setAlunoId(int alunoId) {
		this.alunoId = alunoId;
	}

	@Override
	public String toString() {
		return String.format("%s\nAluno ID: %d", super.toString(), alunoId);
	}
}

