package zx.soft.attack.service;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import zx.soft.attack.dao.ComputerMapper;
import zx.soft.attack.model.Computer;



@Service
public class ComputerService {
	
	@Inject
	private ComputerMapper computerMapper ;
	private static Logger logger = LoggerFactory.getLogger(ComputerService.class);
	
	
	//获取每个区域的电脑数
	public List getComputerData(){
		List<Computer> list = computerMapper.getAllComputer();
		logger.info("执行到service层");
		System.out.println(list.toString());
		return list;
		
	}


}
