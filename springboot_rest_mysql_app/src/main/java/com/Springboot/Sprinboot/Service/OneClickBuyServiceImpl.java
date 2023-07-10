package com.Springboot.Sprinboot.Service;

import com.Springboot.Sprinboot.Entity.OneClickBuy;
import com.Springboot.Sprinboot.Repository.OneClickBuyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OneClickBuyServiceImpl implements OneClickBuyService{

    @Autowired
    private OneClickBuyRepo oneClickBuyRepo;
    @Override
    public String saveDetails(OneClickBuy oneClickBuy) {
        oneClickBuyRepo.save(oneClickBuy);
        return "success";
    }
    @Override
    public OneClickBuy getById(Integer ID){
        Optional<OneClickBuy> findById = oneClickBuyRepo.findById(ID);
        if(findById.isPresent()){
            return findById.get();
        }
        return null;
    }

    public List<OneClickBuy> getAll() {
        return oneClickBuyRepo.findAll();
    }

    public String deleteById(Integer ID){
        if(oneClickBuyRepo.existsById(ID)){
            oneClickBuyRepo.deleteById(ID);
        } else{
            return "No record found";
        }
        return null;
    }
}

