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
@Table(name = "AutoEscada")
public class AutoEscada {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "aue_id", unique = true)
    private Integer id;
    @Column(name = "aue_altura-max", nullable = false)
    private Integer alturaMax;

    public AutoEscada() {
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public Integer getAlturaMax() {
        return alturaMax;
    }

    public void setAlturaMax(Integer alturaMax) {
        this.alturaMax = alturaMax;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof AutoEscada) {
            AutoEscada aux = (AutoEscada) obj;

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