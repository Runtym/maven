package test.mvn.sp.vo;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("test")
public class TestVO {
	private Integer tnum;
	private Integer tage;
	private String tname;
}
