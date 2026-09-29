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

/**
 *
 * @author aluno
 */
@Entity
@Table(name = "StatusBombeiro")
public class StatusBombeiro {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name = "stb_id")
private Integer id;

@Column(name = "stb_sigla", length = 45, unique = true, nullable = false)
private String sigla;

@Column(name = "stb_descricao", length = 45, nullable = false)
private String descricao;   

    public StatusBombeiro() {
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
        if (obj instanceof StatusBombeiro) {
            StatusBombeiro aux = (StatusBombeiro) obj;
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

