package com.enviro.assessment.grad001.kamohelolebjane.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.enviro.assessment.grad001.kamohelolebjane.model.CategorizationLookup;
import com.enviro.assessment.grad001.kamohelolebjane.model.Enviro;
import com.enviro.assessment.grad001.kamohelolebjane.service.EnviroService;

@RestController
@Validated
public class EnviroController {
	
   @Autowired
   EnviroService enviroService;
   
   //Get all waste categories.
   @GetMapping("/wastecategory")
   public List<String> wastecategory(){
	   return enviroService.getCategories();
   }
   //Return disposal guide information
   @GetMapping("/disposalguidlines")
   public List<String> disposalguidlines(){
	   return enviroService.disposalGuidlines();
   }
   //Returns recycling tips
   @GetMapping("/recyclingtips")
   public List<String> findRecyclingTips(){
	   return enviroService.findRecyclingTips();
   }
   //Updates  recycle tips
   @PutMapping("/updatetip/{id}")
   public int assignTechnician(@PathVariable Long id, @RequestBody Map<String,String> RecycTip) {
	   String recycTip=RecycTip.get("recyclingTips");
	   return enviroService.updateRecyTipByID(id, recycTip);
   }
   //Gets all the data
   @GetMapping("/allinfo")
   public List<Enviro> allinfo(){
	   return enviroService.allinfo();
   }
   
   @GetMapping("/categorizationlookupinfo")
   public List<String> allCategorizationLookupinfo(){
	   return enviroService.allCategorizationLookupinfo();
   }
   //Deletes a certain waste Item information for a certain category by ID
   @DeleteMapping("/deleteitemidentificationinfo/{id}")
	public int deleteItemIdentificationInfoById(@PathVariable long id){
		return enviroService.deleteItemIdentificationInfoById(id);
	}
}
