package edu.javacourse.register.manager;

import edu.javacourse.register.domain.Person;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import java.util.List;

public class PersonManager {
    public static void main(String[] args) {
        sessionExample();
        jpaExample();

    }

    private static void jpaExample() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistence");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        Person p = new Person();
        p.setFirstName("Алексей");
        p.setLastName("Федоров");
        em.persist(p);
        System.out.println(p.getPersonId());
        em.getTransaction().commit();
        em.close();

        em = emf.createEntityManager();
        List list = em.createQuery("FROM Person").getResultList();
        list.forEach(System.out::println);
        emf.close();
    }

    private static void sessionExample() {
        SessionFactory sf = buildSessionFactory();
        Session session = sf.openSession();
        session.getTransaction().begin();
        Person p = new Person();
        p.setFirstName("Василий");
        p.setLastName("Сидоров");
        session.persist(p);
        session.getTransaction().commit();
        session.close();

        session = sf.openSession();
        Person person = session.get(Person.class, 1);
        System.out.println(person);
        session.close();

        session = sf.openSession();
        List<Person> lists = session.createQuery("FROM Person", Person.class).list();
        lists.forEach(System.out::println);
        session.close();
    }

    private static SessionFactory buildSessionFactory() {
        try (StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                .configure("hibernate.cfg.xml").build()) {
            Metadata metadata = new MetadataSources(serviceRegistry).getMetadataBuilder().build();

        return metadata.getSessionFactoryBuilder().build();
        } catch (Throwable ex) {
            System.out.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
}
