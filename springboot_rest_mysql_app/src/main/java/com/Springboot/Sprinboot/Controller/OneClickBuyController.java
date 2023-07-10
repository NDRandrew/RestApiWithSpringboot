package com.Springboot.Sprinboot.Controller;

import com.Springboot.Sprinboot.Repository.OneClickBuyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.Springboot.Sprinboot.Entity.OneClickBuy;
import com.Springboot.Sprinboot.Service.OneClickBuyService;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class OneClickBuyController {
	@Autowired
	private OneClickBuyService oneClickBuyService;
	
	@PostMapping("/OCB/addOneClickBuy")
	public ResponseEntity<String> postDetails(@RequestBody OneClickBuy oneClickBuy) {
		String status = oneClickBuyService.saveDetails(oneClickBuy);
		return new ResponseEntity<>(status, HttpStatus.CREATED);
	}
	@GetMapping("/OCB/getOneClickBuy")
	public ResponseEntity <List<OneClickBuy>> getAll(){
		return new ResponseEntity<>(oneClickBuyService.getAll(), HttpStatus.OK);
	}
	@GetMapping("/OCB/getOneClickBuy/{ID}")
	public ResponseEntity<OneClickBuy> getOneClickBuy(@PathVariable Integer ID){
		OneClickBuy oneClickBuy = oneClickBuyService.getById(ID);
		return new ResponseEntity<OneClickBuy>(oneClickBuy, HttpStatus.OK);

	}
	@DeleteMapping("/OCB/getOneClickBuy/{ID}")
	public ResponseEntity<String> deleteClickBuy(@PathVariable Integer ID){
		String status = oneClickBuyService.deleteById(ID);
		return new ResponseEntity<>(status, HttpStatus.OK);

	}
	@PutMapping("/OCB/updateOCB")
	public ResponseEntity<String> updateDetails(@RequestBody OneClickBuy oneClickBuy) {
		String status = oneClickBuyService.saveDetails(oneClickBuy);
		return new ResponseEntity<>(status, HttpStatus.OK);
	}

}
