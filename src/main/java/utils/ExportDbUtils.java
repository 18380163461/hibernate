package utils;


import org.hibernate.HibernateException;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.hibernate.tool.schema.TargetType;

import java.util.EnumSet;

public class ExportDbUtils {
    public static void main(String args[]) {
   /*    Configuration configuration=new Configuration();
        SchemaExport schemaExport=new SchemaExport();
        schemaExport.create();*/
        try {
            Configuration config = new Configuration().configure();
            StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                    .configure().build();
            Metadata metadata = new MetadataSources(serviceRegistry)
                    .buildMetadata();
            SchemaExport schemaExport = new SchemaExport();
            schemaExport.create(EnumSet.of(TargetType.DATABASE), metadata);
        } catch (HibernateException e) {
            System.out.println(e.toString());
            e.printStackTrace();
        }
    }
}