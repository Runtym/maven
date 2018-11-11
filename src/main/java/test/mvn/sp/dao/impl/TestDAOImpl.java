package test.mvn.sp.dao.impl;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import test.mvn.sp.App;
import test.mvn.sp.dao.TestDAO;
import test.mvn.sp.vo.TestVO;

public class TestDAOImpl implements TestDAO {

	private SqlSessionFactory ssf;
	
	private SqlSession ss;
	public TestDAOImpl() {
		InputStream is = TestDAOImpl.class.getResourceAsStream("/conf/config.xml");
		ssf = new SqlSessionFactoryBuilder().build(is,"orc");
		ss = ssf.openSession();
	}
	
	public List<TestVO> selectTestVOList(TestVO test) {
		// TODO Auto-generated method stub
		return ss.selectList("test.mvn.sp.TestMapper.selectTest",test);
	}

	public TestVO selectTestVO(Integer tnum) {
		return ss.selectOne("test.mvn.sp.TestMapper.selectTest",tnum);
	}

}
