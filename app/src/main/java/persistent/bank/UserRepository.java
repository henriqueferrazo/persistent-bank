package persistent.bank;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class UserRepository {
    public User save(User user) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            transaction = session.beginTransaction();

            session.save(user);

            session.getTransaction().commit();

            return user;
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return null;
    }

}

