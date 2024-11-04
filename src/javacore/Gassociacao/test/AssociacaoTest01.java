package javacore.Gassociacao.test;

import javacore.Gassociacao.domain.Aluno;
import javacore.Gassociacao.domain.Local;
import javacore.Gassociacao.domain.Professor;
import javacore.Gassociacao.domain.Seminario;

/*
Crie um sistema que gerencie seminários;
O sistema deverá cadastrar seminários, estudantes, professores e local onde será realizado;

Um aluno poderá estar em apenas um semínario;
Um seminário poderá ter nenhum ou vários alunos;
Um professor poderá ministrar vários seminários;
Um seminário deve ter um local;

Campos Básicos: (excluindo relacionamento);
Seminário: título;
Aluno: nome e idade;
Professor: nome e especialidade;
Local: Endereço;
 */
public class AssociacaoTest01 {
    public static void main(String[] args) {
        Local local = new Local("Local: Av. Paulista, n. 1000");
        Aluno aluno1 = new Aluno("Natanael", 37);
        Aluno aluno2 = new Aluno("Sirilo", 25);
        Aluno[] alunosParaSeminario = {aluno1, aluno2};
        Professor professor = new Professor("André", "Cibersegurança");
        Seminario seminario = new Seminario("Cibersegurança no século XXI", alunosParaSeminario, local);
        Seminario[] seminariosDisponiveis = {seminario};

        professor.setSeminario(seminariosDisponiveis);
        professor.imprimeSeminarios();
    }
}
