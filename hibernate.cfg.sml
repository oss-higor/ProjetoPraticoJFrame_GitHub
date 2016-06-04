// codigos fonte>pacote default
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE hibernate-configuration PUBLIC "-//Hibernate/Hibernate Configuration DTD 3.0//EN" "http://hibernate.sourceforge.net/hibernate-configuration-3.0.dtd">
<hibernate-configuration>
  <session-factory>
    <property name="hibernate.dialect">org.hibernate.dialect.MySQLDialect</property>
    <property name="hibernate.connection.driver_class">com.mysql.jdbc.Driver</property>
    <property name="hibernate.connection.url">jdbc:mysql://localhost:3306/projetopraticohibernate?zeroDateTimeBehavior</property>
    <property name="hibernate.connection.username">root</property>
    <property name="hibernate.connection.password">drd21tkh</property>
    <property name="hibernate.hbm2ddl.auto">update</property>
    <mapping class="br.com.projetopraticohibernate.model.Cliente"/>
  </session-factory>
</hibernate-configuration>
