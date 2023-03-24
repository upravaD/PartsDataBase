package com.parts;

import com.parts.entity.Part;
import com.parts.entity.Purchase;
import com.parts.utilities.MySessionFactory;
import org.hibernate.Session;
import org.hibernate.query.Query;

public class App {
    public static void main(String[] args) {
        try (Session session = MySessionFactory.getSessionFactory().openSession()) {
            String hql1 = "from Part";
            Query<Part> query1 = session.createQuery(hql1, Part.class);
            query1.list().forEach(System.out::println);
            String hql2 = "from Purchase";
            Query<Purchase> query2 = session.createQuery(hql2, Purchase.class);
            query2.list().forEach(System.out::println);
        }
    }
}
