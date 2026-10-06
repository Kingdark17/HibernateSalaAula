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
@Table(name = "Epecialidade")
public class Epecialidade {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "esp_id", unique = true)
    private Integer id;
    @Column(name = "esp_descricao", length = 45, nullable = false)
    private String descricao;

    public Epecialidade() {
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Epecialidade) {
            Epecialidade aux = (Epecialidade) obj;

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
