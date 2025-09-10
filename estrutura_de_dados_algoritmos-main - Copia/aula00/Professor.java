public class Professor extends Pessoa{
	private int professorId;

	public Professor(int professorId, String nome, int idade, long cpf) {
		super(nome, idade, cpf);
		this.professorId = professorId;
	}

	public int getProfessorId() {
		return professorId;
	}

	public void setProfessorId(int professorId) {
		this.professorId = professorId;
	}

	@Override
	public String toString() {
		return String.format("%s\nProfessor ID: %d", super.toString(), professorId);
	}
}
