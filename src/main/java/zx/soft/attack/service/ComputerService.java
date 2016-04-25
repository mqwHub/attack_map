package zx.soft.attack.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import zx.soft.attack.dao.ComputerMapper;
import zx.soft.attack.model.Computer;


@Service
public class ComputerService {
	
	@Inject
	private ComputerMapper computerMapper;
	
	
	//获取每个区域的电脑数
	public void getComputerData(){
		List<Computer> list = computerMapper.getAllComputer(1);
		//System.out.println(list.toString());
	}

	public static void main(String[] args) {
		new ComputerService().getComputerData();
	}
}
