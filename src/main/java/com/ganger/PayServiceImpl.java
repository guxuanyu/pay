package com.ganger;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

@Service
public class PayServiceImpl implements PayService{

	@Autowired
	PayRespositroy payRespositroy;
	
	@Override
	public List<Pay> getPays() {
		List<Pay> res=payRespositroy.findAll(Sort.by(Direction.DESC, "id"));
		return res;
	}

	@Override
	public void newPay(PayForm pay) {
		Pay save=new Pay();
		BeanUtils.copyProperties(pay, save);
		save.setId(0);
		save.setPost(new Timestamp(System.currentTimeMillis()));
		if(pay.getMsg()==null) {
			save.setMsg("");
		}
		payRespositroy.save(save);
	}

}
