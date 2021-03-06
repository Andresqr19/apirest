package br.com.unipac.apitrabalhos.model.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="TB_TRABALHO")
public class Trabalho {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String professor;
    private String tituloDoTrabalho;
    private Date data;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public String getTituloDoTrabalho() {
        return tituloDoTrabalho;
    }

    public void setTituloDoTrabalho(String tituloDoTrabalho) {
        this.tituloDoTrabalho = tituloDoTrabalho;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Trabalho{" +
                "id=" + id +
                ", professor='" + professor + '\'' +
                ", tituloDoTrabalho='" + tituloDoTrabalho + '\'' +
                ", data=" + data +
                '}';
    }
}