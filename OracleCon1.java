import java.sql.*;
class OracleCon1
{
public static void main(String args[])throws Exception
{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection(
"jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
Statement stmt=con.createStatement();
int m=stmt.executeUpdate(“insert into student values(1000,’SURESH’,75)”);
if(m==1)
{
System.out.print(“\n\n\t RECORD HAS BEEN INSERTED SUCCESSFULLY”);
}
else
{
System.out.print(“\n\n\t RECORD HAS NOT BEEN INSERTED”):
con.close();
}
}
