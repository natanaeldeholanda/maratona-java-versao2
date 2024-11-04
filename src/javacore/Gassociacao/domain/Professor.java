package javacore.Gassociacao.domain;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminario;

    public Professor(String nome) {
        this.nome = nome;
    }

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor(String nome, String especialidade, Seminario[] seminario) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminario = seminario;
    }

    public void imprimeSeminarios() {
        System.out.println("-*-*-*-SEMINÁRIO-*-*-*-");
        System.out.println("Professor: " + this.nome);
        System.out.print("Seminários Cadastrados: ");
        if (seminario == null) return;
        for (Seminario seminario : seminario) {
            System.out.println(seminario.getTitulo());
            System.out.println(seminario.getLocal().getEndereco());
            if (seminario.getAlunos() == null || seminario.getAlunos().length == 0) continue;
            System.out.println("-*-*-*-ALUNOS MATRICULADOS-*-*-*-");
            for (Aluno aluno : seminario.getAlunos()) {
                System.out.println("Aluno: " + aluno.getNome() + " Idade: " + aluno.getIdade());
            }

        }
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");

    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario[] seminario) {
        this.seminario = seminario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
