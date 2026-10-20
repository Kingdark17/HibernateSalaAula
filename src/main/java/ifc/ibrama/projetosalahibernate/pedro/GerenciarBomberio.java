/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifc.ibrama.projetosalahibernate.pedro;

import ifc.ibrama.projetosalahibernate.pedro.entidade.Bombeiro;
import ifc.ibrama.projetosalahibernate.pedro.util.HibernateUtil;

import java.time.LocalDate;
import java.time.Month;

import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author aluno
 */
public class GerenciarBomberio {
    public static void main(String[] args) {
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        
        Bombeiro bombeiro01 = new Bombeiro();
        bombeiro01.setCpf("123456789");
        bombeiro01.setNome("Fulano");
        bombeiro01.setNome_Guerra("Silva");
        bombeiro01.setData_Nacimento(LocalDate.of(2000, Month.MARCH, 14));

        Transaction transacao = null;
        try{
            transacao = sessao.beginTransaction();
            
            sessao.persist(bombeiro01);
            transacao.commit();
            
            sessao.close();
        }catch (Exception erro){
            if (transacao != null) {
                transacao.rollback();
            }
        }
        
        System.out.println("Conexao esabelecida com sucesso!");
        HibernateUtil.shutdow();
        sessao.close();
    }
}
