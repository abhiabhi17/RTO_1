package com.rto.controller;



import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


import com.rto.entity.VehicleOwnerRegistrationEntity;
import com.rto.model.VehicleOwnerRegistrationModel;
import com.rto.service.RtoServiceMgmt;

/*vehicle  owner details controller is used to
 * 
 *  register owner register details
 *  */
@Controller
public class VehicleOwnerDetailsController {


	final static Logger Log = Logger.getLogger(VehicleOwnerDetailsController.class);
	@Autowired
	private RtoServiceMgmt service;
	
	@RequestMapping(value= {"/","/vehicleReg"},method=RequestMethod.GET)
	public String showForm(Model model) {
		
		VehicleOwnerRegistrationModel vomodel=new VehicleOwnerRegistrationModel();
		
		model.addAttribute("owner",vomodel);
		return "VehicleOwnerDetails";
	}
	
	
	/* this method for registering owner form */
	
	@RequestMapping(value= "ownerRegistration",method=RequestMethod.POST)
	public String registerForm(Model model,@ModelAttribute("owner") VehicleOwnerRegistrationModel owner,HttpServletRequest request) {
		//user service
		
		

		String result=service.saveVehicleOwnerDetails(owner);
		model.addAttribute("msg",result);
	
		
	    return "redirect:/vdetails";
	}
	

	
	
	
	@RequestMapping(value= {"/test"},method=RequestMethod.GET)
	public  String goPrevious(Model model,@ModelAttribute("owner") VehicleOwnerRegistrationModel owner,@RequestParam("vehicleOwn") Integer vehicleOwn
			,HttpServletRequest request,HttpServletResponse response) {
		
		/*
		 * VehicleOwnerRegistrationModel vomodel=new VehicleOwnerRegistrationModel();
		 * System.out.println("============="); model.addAttribute("owner",vomodel);
		 */
		
		                           String id=(String)request.getParameter("vehicleOwn");
		                           System.out.println(id);
		                           Optional<VehicleOwnerRegistrationEntity> vd =service.getbyId(vehicleOwn);
		                       if(vd.isPresent())
		                       {
		                    	   VehicleOwnerRegistrationEntity entity=  vd.get();
		                    	   VehicleOwnerRegistrationModel vomodel=new VehicleOwnerRegistrationModel();
		                    	   BeanUtils.copyProperties(entity, vomodel);
		                    	   model.addAttribute("owner",vd);
		                       } 
		
		return "VehicleOwnerDetails";
	}
}
