package test.mvn.sp;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import test.mvn.sp.vo.TestVO;

public class App {
	public String s1;
	protected String s2;
	String s3;
	private String s4;
	
    public static void main( String[] args ){
    	InputStream is = App.class.getResourceAsStream("/conf/config.xml");

    	SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(is,"orc");
    	
    	SqlSession ss = ssf.openSession();
    	List<TestVO> tList = ss.selectList("test.mvn.sp.TestMapper.selectTest");
    	System.out.println(tList);
    	TestVO tvo = new TestVO();
    	tvo.setTnum(1);
    	tvo = ssf.openSession().selectOne("test.mvn.sp.TestMapper.selectTest",tvo);
    	System.out.println(tvo);
    }
}
