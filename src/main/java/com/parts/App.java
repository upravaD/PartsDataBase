package com.parts;

import com.parts.entity.Part;
import com.parts.utilities.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.List;

public class App {
    public static void main(String[] args) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            String hql = "from Part";
            Query<Part> query = session.createQuery(hql, Part.class);
            query.list().forEach(System.out::println);
        }
    }
}
