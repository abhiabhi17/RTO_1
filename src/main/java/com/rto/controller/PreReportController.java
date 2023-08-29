package com.rto.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.rto.entity.OwnerAddressEntity;
import com.rto.entity.VehicleDetailsEntity;
import com.rto.entity.VehicleOwnerRegistrationEntity;
import com.rto.entity.VehicleRegistrationNoEntity;
import com.rto.model.VehicleOwnerRegistrationModel;
import com.rto.model.VehicleRegistrationNoModel;
import com.rto.service.RtoServiceMgmt;

@Controller
public class PreReportController {

	final static Logger Log = Logger.getLogger(PreReportController.class);
	
	@Autowired
	private RtoServiceMgmt service;
	
	
	  @RequestMapping(value= "/pregen",method=RequestMethod.GET)
	  public String showForm(Model model,@ModelAttribute("regNo") VehicleRegistrationNoModel regiModel)
	  { 
		  
		  Log.info(" register form  method loaded ");
		  return "prefinalReport"; 
		  
	  }
	  
	

/*method is for is used to
 * 
 *  generate vehicle no
 *  */
	@RequestMapping(value= "/pre",method=RequestMethod.POST)
	public String showRegisterForm(Model model,@ModelAttribute("regNo") VehicleRegistrationNoModel regiModel) {
		VehicleOwnerRegistrationEntity voEntity=null;
		VehicleRegistrationNoEntity listForReg=null;
		VehicleDetailsEntity listForVehicle=null;
		OwnerAddressEntity listForAdd=null;
		//use service
		String result=service.generateRegistrationNo(regiModel);
		
		//get data from service
		voEntity=service.getAllVehicleOwnerDetailsById();
		listForVehicle=service.getAllVehicleDetailsById();
		listForAdd=service.getAllOwnerAddressDetailsById();
		listForReg=service.getAllRegistrationDetailsById();
		
		model.addAttribute("msg",result);
		model.addAttribute("Vowner",voEntity);
		model.addAttribute("listForAdd",listForAdd);
		model.addAttribute("listForReg",listForReg);
		model.addAttribute("listForVehicle",listForVehicle);
		
		return "VehicleSummary";
	}
	
}
