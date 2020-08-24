package demo01;

import base.InitTest;
import demo01.entity.User;
import demo01.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;

public class Demo01Test extends InitTest {
  @Test
  public void testSql() throws Exception {
    String resource = "mybatis-config.xml";
    InputStream inputStream = Resources.getResourceAsStream(resource);
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    try (SqlSession session = sqlSessionFactory.openSession()) {
      UserMapper mapper = session.getMapper(UserMapper.class);
      User user = mapper.selectUser(0);
      System.out.println(user.getName());
      user = mapper.selectUser(1);
      System.out.println(user.getName());
    }
  }

}
