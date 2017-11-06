import entity.MUser;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Client Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>ʮ�� 20, 2017</pre>
 */
public class ClientTest2 {
    org.hibernate.SessionFactory sessionFactory;


    @Before
    public void before() throws Exception {
        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure("hibernate.cfg.xml").build();
        // 2. 根据服务注册类创建一个元数据资源集，同时构建元数据并生成应用一般唯一的的session工厂
        sessionFactory = new MetadataSources(registry)
                .buildMetadata().buildSessionFactory();
    }

    @After
    public void after() throws Exception {
//        closeSession();
    }

    /**
     * Method: main(String args[])
     */
    @Test
    public void testMain() throws Exception {

    }


    @Test
    public void test2() throws Exception {
        Session session = sessionFactory.openSession();// 从会话工厂获取一个session
        Transaction tx = session.beginTransaction();

        MUser mUser = session.load(MUser.class, 1);
        System.out.println(mUser.getId() + "--" + mUser.getUsername());
        Session session1 = sessionFactory.openSession();
        MUser mUser2 = session1.get(MUser.class, 1);
        System.out.println(mUser2.getId() + "--" + mUser2.getUsername());
    }
//

    @Test
    public void jicheng() throws Exception {

    }


}
