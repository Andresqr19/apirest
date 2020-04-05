package br.com.unipac.apitrabalhos.model.domain;

import javax.persistence.Table;

public class Professor {
    private long id;
    private String nome;
    private String disciplina;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", disciplina='" + disciplina + '\'' +
                '}';
    }
}
