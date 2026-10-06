/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifc.ibirama.br3n0.mpbb0128.hibernate.entidadades;

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
@Table(name = "UnidadeResgate")
public class UnidadeResgate {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "unr_id", unique = true)
    private Integer id;
    @Column(name = "unr_capacidade", nullable = false)
    private Integer capacidade;

    public UnidadeResgate() {
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

   public Integer getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(Integer capacidade) {
        this.capacidade = capacidade;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof UnidadeResgate) {
            UnidadeResgate aux = (UnidadeResgate) obj;

            if (!(aux.getId().equals(this.id))) {
                return false;
            } else {
                return true;
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