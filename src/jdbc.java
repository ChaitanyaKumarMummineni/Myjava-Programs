import java.sql.*;
public class jdbc {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/chaitu?characterEncoding=UTF-8","root","root");
        Statement s=c.createStatement();
        s.executeUpdate("create table emp(Eid int(4),Ename varchar(20),Esal int(6));");
        System.out.println("table created");
        s.executeUpdate("insert into emp values(101,'chaitu',69999),(102,'Baba',2000);");
        System.out.println("values are inserted into the table");
        c.close();
    }
}
