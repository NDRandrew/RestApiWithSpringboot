package com.Springboot.Sprinboot.Service;

import com.Springboot.Sprinboot.Entity.OneClickBuy;

import java.util.List;


public interface OneClickBuyService {
	public String saveDetails(OneClickBuy oneClickBuy);
	public OneClickBuy getById(Integer ID);
	public List<OneClickBuy> getAll();
	public String deleteById(Integer ID);

}
