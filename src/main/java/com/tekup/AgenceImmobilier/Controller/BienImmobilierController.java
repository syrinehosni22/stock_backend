package com.tekup.AgenceImmobilier.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tekup.AgenceImmobilier.Service.BienImmobilierServices;
import com.tekup.AgenceImmobilier.model.BienImmobilier;


@RestController
@RequestMapping({"/api/bienImmobilier"})
public class BienImmobilierController {

	
	@Autowired
	private BienImmobilierServices bienImmobilierServices;
	
	
	@GetMapping("/findAll")
	public List<BienImmobilier> getALLBienImmobilier(){
		return bienImmobilierServices.getAllBienImmobilier();
}
	
	@PostMapping("/Add")
	public BienImmobilier AddBienImmobilier(@RequestBody BienImmobilier B) {
		return bienImmobilierServices.saveBienImmobilier(B);
}

      
    @DeleteMapping("/delete")
    public void DeleteBienImmobilier(@RequestBody BienImmobilier B) {
    	bienImmobilierServices.deleteBienImmobilier(B);
    }
}