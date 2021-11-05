package com.bridgelabz.addressbookapp.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.addressbookapp.DTO.AddressBookDTO;
import com.bridgelabz.addressbookapp.Model.AddressBookData;
import com.bridgelabz.addressbookapp.Model.ResponseDTO;

@RestController
@RequestMapping("/addressbookappservice")
public class Controllers {
	@RequestMapping(value= {"","/","/get"})
	public ResponseEntity<ResponseDTO> getAddressBookData(){
		AddressBookData addressBookData =  null;
		addressBookData = new AddressBookData(1,new AddressBookDTO("Chethan", 963258741,"Bangalore","Karnataka","chethan@777@gamuil.com",570002));
		ResponseDTO respDTO = new ResponseDTO("Get call Success:",addressBookData);
		return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
	}
	@GetMapping("/get/{addId}")
	public ResponseEntity<ResponseDTO> getAddressBookData(@PathVariable("addId") int addId){
		AddressBookData addressBookData =  null;
		addressBookData = new AddressBookData(addId,new AddressBookDTO("Chethan", 963258741,"Bangalore","Karnataka","chethan@777@gamuil.com",570002));
		ResponseDTO respDTO = new ResponseDTO("Get call  for ID Success:",addressBookData);
		return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
	}
	@PostMapping("/create")
	public ResponseEntity<ResponseDTO> addAddressBookData(@RequestBody AddressBookDTO addressBookDTO){
		AddressBookData addressBookData =  null;
		addressBookData = new AddressBookData(1,addressBookDTO);
		ResponseDTO respDTO = new ResponseDTO("Get call  for ID Success:",addressBookData);
		return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
	}
	@PutMapping("/update/{addId}")
	public ResponseEntity<ResponseDTO> updateAddressBookData(@PathVariable("addId") int addId,@RequestBody AddressBookDTO addressBookDTO){
		AddressBookData addressBookData =  null;
		addressBookData = new AddressBookData(addId,addressBookDTO);
		ResponseDTO respDTO = new ResponseDTO("Update AddressBook Data successful:",addressBookData);
		return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
	}
	@DeleteMapping("/delete/{addId}")
	public ResponseEntity<ResponseDTO>deleteAddressBookData(@PathVariable("addId") int addId){
		ResponseDTO respDTO = new ResponseDTO("Update AddressBook Data successful:",addId);
		return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
	}
}
