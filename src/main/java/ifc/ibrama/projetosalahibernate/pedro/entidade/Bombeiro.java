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
import java.time.LocalDate;

/**
 *
 * @author aluno
 */
@Entity
@Table(name="Bombeiro")
public class Bombeiro {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="bom_id")
    private Integer id;
    @Column(name="bom_cpf", length=11, unique=true , nullable=false)
    private String cpf;
    @Column(name="bom_Data_nacimento", nullable=false)
    private LocalDate data_Nacimento;
    @Column(name="bom_nome_completo", length=45,nullable=false)
    private String Nome;
    @Column(name="bom_nome_guerra", length=45, unique=true , nullable=false)
    private String Nome_Guerra;

    public Bombeiro() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getData_Nacimento() {
        return data_Nacimento;
    }

    public void setData_Nacimento(LocalDate data_Nacimento) {
        this.data_Nacimento = data_Nacimento;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getNome_Guerra() {
        return Nome_Guerra;
    }

    public void setNome_Guerra(String Nome_Guerra) {
        this.Nome_Guerra = Nome_Guerra;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Bombeiro) {
            Bombeiro aux = (Bombeiro) obj;
            if ((aux.getId().equals(this.id)) && (aux.getCpf().equals(this.cpf))) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
        
    }
    @Override
            
    public int hashCode(){
        return getClass().hashCode();
    }
    
}
