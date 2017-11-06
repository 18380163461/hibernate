import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import zhujie.Employee;


public class ClientTestZhuJie {
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
        Integer a=700;
        Integer b=700;
        System.out.println(a==b);

    }


    @Test
    public void test1() throws Exception {
        Session session = sessionFactory.openSession();// 从会话工厂获取一个session
        Transaction t = session.beginTransaction();

        Employee e1 = new Employee();
        e1.setId(1001);
        e1.setFirstName("Yii");
        e1.setLastName("Bai");

        Employee e2 = new Employee();
        e2.setId(1002);
        e2.setFirstName("Min");
        e2.setLastName("Su");

        session.persist(e1);
        session.persist(e2);

        t.commit();
        session.close();
        System.out.println("successfully saved");
    }
//

    @Test
    public void test2() throws Exception {
        Session session = sessionFactory.openSession();// 从会话工厂获取一个session
        Transaction t = session.beginTransaction();
        Employee employee = session.get(Employee.class, 1001);
        t.commit();
        session.close();
        System.out.println(employee.getLastName());
    }


}
