package com.servelots.dao;


import com.servelots.entity.Pagelet;
import com.servelots.util.HibernateUtil;
import org.hibernate.Session;

public class PageletDAOImpl {

    public Long create(Pagelet pagelet) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();

        Long pageletId  = (Long) session.save(pagelet);

        session.getTransaction().commit();
        return pageletId;
    }

    public Pagelet read(Long Id) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();

        Pagelet pagelet = (Pagelet) session.load(Pagelet.class, Id);
        session.getTransaction().commit();

        return pagelet;
    }

    public void update(Pagelet pagelet) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();

        session.update(pagelet);

        session.getTransaction().commit();
    }

    public void delete(Pagelet pagelet) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();

        session.delete(pagelet);
        session.getTransaction().commit();
    }

}
