package zx.soft.attack.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import zx.soft.attack.model.Computer;

public interface ComputerMapper {
	
	
	@Select("select * from `computer`")
	public List<Computer> getAllComputer();

}
