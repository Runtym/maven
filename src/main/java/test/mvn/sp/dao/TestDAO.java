package test.mvn.sp.dao;

import java.util.List;

import test.mvn.sp.vo.TestVO;

public interface TestDAO {
	public List<TestVO> selectTestVOList(TestVO test);
	public TestVO selectTestVO(Integer tnum);
}
