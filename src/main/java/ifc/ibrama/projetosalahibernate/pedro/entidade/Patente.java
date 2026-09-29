/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifc.ibrama.projetosalahibernate.pedro.entidade;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Objects;

/**
 *
 * @author aluno
 */
@Entity
@Table(name = "Patente")
public class Patente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "pat_id")
    private Integer id;

    @Column(name = "pat_sigla", length = 10, unique = true, nullable = false)
    private String sigla;

    @Column(name = "pat_descricao", length = 45, nullable = false)
    private String descricao;

    public Patente() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Patente) {
            Patente aux = (Patente) obj;
            if ((aux.getId().equals(this.id)) && (aux.getSigla().equals(this.sigla))) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @Override

    public int hashCode() {
        return getClass().hashCode();
    }

}
