package mybatis_spring_study.config;

import static org.junit.Assert.*;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ContextRoot.class})
public class ContextSqlSessionTest {
	protected static final Log log = LogFactory.getLog(ContextSqlSessionTest.class);
	
	@After
	public void tearDown() throws Exception {
		System.out.println();
	}
	
	@Autowired
	private SqlSessionFactory sessionFactory;

	@Test
	public void testSqlSession() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		SqlSession session = sessionFactory.openSession();
		log.debug("session " + session);
		Assert.assertNotNull(session);
	}

}
