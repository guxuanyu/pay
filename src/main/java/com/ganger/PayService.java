package com.ganger;

import java.util.List;

public interface PayService {

	List<Pay> getPays();
	
	void newPay(PayForm pay);
}
