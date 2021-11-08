package com.bridgelabz.addressbookapp.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bridgelabz.addressbookapp.DTO.AddressBookDTO;
import com.bridgelabz.addressbookapp.Model.AddressBookData;

@Service
public interface IAddressBookService {
	List<AddressBookData> getAddressBookData();
	AddressBookData getAddressBookDataById(int addId);
	AddressBookData createAddressBookData(AddressBookDTO addresBookDTO);
	AddressBookData updateAddressBookData(int addId,AddressBookDTO addressBookDTO);
	void deleteAddressBookData(int addId);
}
