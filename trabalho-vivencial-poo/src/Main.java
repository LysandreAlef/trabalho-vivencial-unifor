// Francisco

//Crie uma classe com método main onde você deverá instanciar:
//● 3 objetos de disciplina;
//● 3 objetos aluno (2 regulares e 1 bolsista);
//● 1 objeto professor;
//● 2 objetos visitante;
//● 3 objetos turma, contendo todos os alunos, o professor e 1 disciplina em cada
//turma criada;
//● Imprima na tela a informação de cada turma, seu código, o professor, a
//disciplina e a lista de alunos matriculados na turma.

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // 1. Instanciar 3 objetos de disciplina
        Disciplina d1 = new Disciplina("Infectologia e Doenças Infecciosas", "MED101");
        Disciplina d2 = new Disciplina("Medicina Tropical", "MED102");
        Disciplina d3 = new Disciplina("Imunologia", "MED201");

        // 2. Instanciar 3 objetos aluno (2 regulares e 1 bolsista)
        Aluno a1 = new Regular("Ana Saraiva Albuquerque", "2023001");
        Aluno a2 = new Regular("Bruno Costa Sobreira", "2023002");
        Aluno a3 = new Bolsista("Carla Dias dos Santos", "2023003");

        // Lista de alunos
        List<Aluno> todosAlunos = new ArrayList<>();
        todosAlunos.add(a1);
        todosAlunos.add(a2);
        todosAlunos.add(a3);

        // 3. Instanciar 1 objeto professor
        Professor p1 = new Professor("Me. Ricardo Calil Kores", "Infectologia");

        // 4. Instanciar 2 objetos visitante
        Visitante v1 = new Visitante("Marcos Andrade da Silva Junior");
        Visitante v2 = new Visitante("Lucia Ferreira de Setubal");

        // 5. Instanciar 3 objetos turma
        Turma t1 = new Turma("T-01", p1, d1);
        Turma t2 = new Turma("T-02", p1, d2);
        Turma t3 = new Turma("T-03", p1, d3);

        // Adicionar todos os alunos em todas as turmas
        for (Aluno aluno : todosAlunos) {
            t1.adicionarAluno(aluno);
            t2.adicionarAluno(aluno);
            t3.adicionarAluno(aluno);
        }

        // 6. Imprimir informações das turmas
        t1.imprimirInfo();
        t2.imprimirInfo();
        t3.imprimirInfo();
    }
}
