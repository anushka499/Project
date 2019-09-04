package studentmanagement.config;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class DBconfig 
{
private static final String DBDRIVER="org.h2.Driver";
private static final String DBURL="jdbc:h2:tcp://localhost/~/test1";
private static final String DBUSERNAME="sa";
private static final String DBPASSWORD="123";
//code which should not be changed
//   jdbc:h2:~/test
// jdbc:h2:tcp://localhost/~/test1
private static Statement stmt=null;
private static void openConnection()
{
//private so that some other third party does not use this connection
	try
	{
		Class.forName(DBDRIVER);
		Connection conn=DriverManager.getConnection(DBURL,DBUSERNAME,DBPASSWORD);
		stmt=conn.createStatement();//to initialise stmt
		
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
//function for ddl,dcl,dml
public static int executeUpdate( String sql) //static functions need to be called just by using classname.methodname. no need of object
{
	try
	{
		openConnection();
		return stmt.executeUpdate(sql);
	}
catch(Exception e)
	{
	e.printStackTrace();
	return -1;
	}
}
//method to select query
public static ResultSet executeQuery( String sql) //static functions need to be called just by using classname.methodname. no need of object
{
	try
	{
		openConnection();
		return stmt.executeQuery(sql);
	}
catch(Exception e)
	{
	e.printStackTrace();
	return null;
	}

}
}
