/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifc.ibrama.projetosalahibernate.pedro;

import ifc.ibrama.projetosalahibernate.pedro.util.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author aluno
 */
public class GerenciarBomberio {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        
        System.out.println("Conexao esabelecida com sucesso!");
        session.close();
    }
}
