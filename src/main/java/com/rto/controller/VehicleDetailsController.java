package com.rto.controller;

import java.util.ArrayList;
import java.util.List;
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

import com.rto.entity.VehicleDetailsEntity;

import com.rto.model.VehicleDetailsModel;
import com.rto.model.VehicleOwnerRegistrationModel;
import com.rto.service.RtoServiceMgmt;



/*vehicle  Details controller is used to
 * 
 *  register owner register details
 *  */
@Controller
public class VehicleDetailsController {

	final static Logger Log = Logger.getLogger(VehicleDetailsController.class);
	@Autowired
	private RtoServiceMgmt service;
	
	@RequestMapping(value= "/vdetails",method=RequestMethod.GET)
	public String showForm(Model model) {
		VehicleDetailsModel vDmodel=new VehicleDetailsModel();
		//type select box
		typeList(model);
		
		
		
				model.addAttribute("VehicleDetailsModel",vDmodel);
		return "VehicleDetails";
	}
	
	public void typeList(Model model){
		List<String> typeList=new ArrayList();
		typeList.add("2 Wheeler");
		typeList.add("4 Wheeler");
		typeList.add("8 Wheeler");
		typeList.add("Lodded vehicles");
		model.addAttribute("typeList",typeList);
		
	}

	/* used to display 
	 * registraton form */
	@RequestMapping(value= "/vRegistrationdetails",method=RequestMethod.POST)
	public String showRegisterForm(Model model,@ModelAttribute("VehicleDetailsModel") VehicleDetailsModel vehicle) {
		//use service
		
		Log.info(" register form  method loaded ");
		
		String result=service.saveVehicleDetails(vehicle);
		
		//model.addAttribute("Rmsg",result);
		return "redirect:/ownerAddress";
	}
	
	@RequestMapping(value= {"/test1"},method=RequestMethod.GET)
	public  String goPrevious(Model model,@ModelAttribute("VehicleDetailsModel") VehicleDetailsModel vehicle,@RequestParam("vihcleOwnEntity") Integer vihcleOwnEntity
			,HttpServletRequest request,HttpServletResponse response) {
		VehicleDetailsModel vDmodel=new VehicleDetailsModel();
		
		typeList(model);
		
		Optional<VehicleDetailsEntity> vd=service.getVehicleById(vihcleOwnEntity);
		if(vd.isPresent())
		{
		VehicleDetailsEntity entity=  vd.get();
		VehicleDetailsModel vmodel=new VehicleDetailsModel();
		BeanUtils.copyProperties(entity, vmodel);
     model.addAttribute("VehicleDetailsModel", vd);
     
		}
		
		return "VehicleDetails";
	}


	
}
