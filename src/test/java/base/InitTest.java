package base;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.jdbc.ScriptRunner;
import org.junit.Before;

import java.sql.Connection;
import java.sql.DriverManager;

public class InitTest {


  @Before
  public void initData(){
    try {
      Class.forName("org.hsqldb.jdbcDriver");
      Connection connection = DriverManager.getConnection("jdbc:hsqldb:mem:mybatis","sa", "");
      ScriptRunner scriptRunner = new ScriptRunner(connection);
      scriptRunner.setLogWriter(null);
      scriptRunner.runScript(Resources.getResourceAsReader("create-table.sql"));
      scriptRunner.runScript(Resources.getResourceAsReader("init.sql"));
    }catch (Exception e){
      e.printStackTrace();
    }
  }

}
