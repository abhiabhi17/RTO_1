package com.rto.service;



import java.util.Optional;

import com.rto.entity.OwnerAddressEntity;
import com.rto.entity.VehicleDetailsEntity;
import com.rto.entity.VehicleOwnerRegistrationEntity;
import com.rto.entity.VehicleRegistrationNoEntity;
import com.rto.model.OwnerAddressModel;
import com.rto.model.VehicleDetailsModel;
import com.rto.model.VehicleOwnerRegistrationModel;
import com.rto.model.VehicleRegistrationNoModel;
import com.rto.model.VehicleSummary;

public interface RtoServiceMgmt {
	
	public String saveVehicleOwnerDetails(VehicleOwnerRegistrationModel vorModel);
	public String saveVehicleDetails(VehicleDetailsModel vehicle);
	public String saveOwnerAddress(OwnerAddressModel address);
	public String generateRegistrationNo(VehicleRegistrationNoModel registrationNo);
    public VehicleSummary getAllDetailsOfVehicleAndOwner(String regNo);
    public  VehicleOwnerRegistrationEntity getAllVehicleOwnerDetailsById();
    public  VehicleDetailsEntity getAllVehicleDetailsById();
    public  OwnerAddressEntity getAllOwnerAddressDetailsById();
    public  VehicleRegistrationNoEntity getAllRegistrationDetailsById();
	
    
    
    
	public Optional<VehicleOwnerRegistrationEntity> getbyId(Integer vehicleOwn);
	
	
	public Optional<VehicleDetailsEntity> getVehicleById(Integer vihcleOwnEntity);
	
	
	
	public Optional<OwnerAddressEntity> getownerId(Integer vehicleOwnEntity);
	
	
	
	
	
	
	
}
