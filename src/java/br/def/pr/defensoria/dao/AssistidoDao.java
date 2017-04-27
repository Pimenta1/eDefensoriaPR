/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.def.pr.defensoria.dao;

/**
 *
 * @author joao
 */

import br.def.pr.defensoria.entity.Assistido;

public class AssistidoDao extends GenericDao<Assistido>{
public AssistidoDao() {
        super(Assistido.class);
    }
//    private Transaction trns;
//    private Session session;
//
//    public AssistidoDao() {
//    }
//
//    public void addAssistido(Assistido assistido) throws SQLException, ClassNotFoundException {
//        session = HibernateUtil.getSessionFactory().openSession();
//        trns = session.beginTransaction();
//        session.save(assistido);
//        trns.commit();
//        session.close();
//    }
//
//    public void deleteAssistido(Assistido assistido) throws SQLException, ClassNotFoundException {
//        session = HibernateUtil.getSessionFactory().openSession();
//        trns = session.beginTransaction();
//        session.delete(assistido);
//        session.getTransaction().commit();
////        if (trns != null) {
////            trns.rollback();
////        }
//        session.close();
//    }
//
//    public void updateAssistido(Assistido assistido) throws SQLException, ClassNotFoundException  {
//        session = HibernateUtil.getSessionFactory().openSession();
//        trns = session.beginTransaction();
//        session.update(assistido);
//        session.getTransaction().commit();
////        if (trns != null) {
////            trns.rollback();
////        }
//        session.close();
//    }
//
//    public List<Assistido> getAllAssistidos() throws SQLException, ClassNotFoundException {
//        List<Assistido> assistidos = new ArrayList<Assistido>();
//        session = HibernateUtil.getSessionFactory().openSession();
//        trns = session.beginTransaction();
//        assistidos = session.createQuery("from Assistido").list();
//        session.close();
//        return assistidos;
//    }
//
//    public Assistido getAssistidoById(Integer assistidoId) throws SQLException, ClassNotFoundException {
//        session = HibernateUtil.getSessionFactory().openSession();
//        trns = session.beginTransaction();
//        String queryString = "from Assistido where id = :id";
//        Query query = session.createQuery(queryString);
//        query.setInteger("id", assistidoId);
//        Assistido assistido = (Assistido) query.uniqueResult();
//        session.close();
//        return assistido;
//    }

}
