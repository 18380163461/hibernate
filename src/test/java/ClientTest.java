import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import utils.SessionFactory;

/**
 * Client Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>ʮ�� 20, 2017</pre>
 */
public class ClientTest {
    Session session;
    Transaction transaction;

    @Before
    public void before() throws Exception {
        session = utils.SessionFactory.getSession();
        transaction = session.getTransaction();
        transaction.begin();
    }

    @After
    public void after() throws Exception {
        try {
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
        }
        SessionFactory.closeSession();
    }

    /**
     * Method: main(String args[])
     */


    @Test
    public void test1() throws Exception {


    }


}
