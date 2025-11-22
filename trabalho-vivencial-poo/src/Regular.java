// Matheus

public class Regular extends Aluno {
    public Regular(String nome, String matricula) {
        super(nome, matricula); // Chama o constructor de Aluno
    }

    @Override
    public String toString() {
        return super.toString() + " - Regular";
    }
}