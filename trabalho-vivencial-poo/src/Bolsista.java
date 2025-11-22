// Matheus

public class Bolsista extends Aluno {

    public Bolsista(String nome, String matricula) {
        super(nome, matricula);
    }

    @Override
    public String toString() {
        return super.toString() + " - Bolsista";
    }
}