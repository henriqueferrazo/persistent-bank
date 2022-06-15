package persistent.bank;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.jdbc.Expectations;
import org.hibernate.query.Query;

public class OperationRepository {

    public Operation save(Operation operation) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            transaction = session.beginTransaction();

            session.save(operation);

            session.getTransaction().commit();

            return operation;
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return null;
    }

    public List<Operation> findOperationsBetween(long start, long end) {

        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();

            Query query = session.createQuery("SELECT o FROM OPeration o WHERE date BETEWEEN? 1 AND ?2");
            query.setParameter(1, start);
            query.setParameter(2, end);

            List<Operation> operations = query.list();

            session.getTransaction().commit();
            return operations;
        } catch (Exception e) {
            e.printStackTrace();
            if (transaction != null) {
                transaction.rollback();
            }
            throw e;
        }
    }

}
