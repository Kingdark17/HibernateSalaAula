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
@Table(name = "AutoTanque")
public class AutoTanque {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "aut_id", unique = true)
    private Integer id;
    @Column(name = "aut_litragem", nullable = false)
    private Integer litragem;

    public AutoTanque() {
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

   public Integer getLitragem() {
        return litragem;
    }

    public void setLitragem(Integer litragem) {
        this.litragem = litragem;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof AutoTanque) {
            AutoTanque aux = (AutoTanque) obj;

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