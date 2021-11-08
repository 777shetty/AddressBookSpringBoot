package com.bridgelabz.addressbookapp.services;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bridgelabz.addressbookapp.DTO.AddressBookDTO;
import com.bridgelabz.addressbookapp.Model.AddressBookData;



@Service
public class AddressBookService implements IAddressBookService {

	private List<AddressBookData> addressBookList =new ArrayList<>();

	@Override
	public List<AddressBookData> getAddressBookData() {
		return addressBookList;
	}

	@Override
	public AddressBookData getAddressBookDataById(int addId) {
		return addressBookList.get(addId-1);
	}

	@Override
	public AddressBookData createAddressBookData(AddressBookDTO addressBookDTO) {
		AddressBookData addressBookData =  null;
		addressBookData = new AddressBookData(1,addressBookDTO);
		addressBookList.add(addressBookData);
		return addressBookData;
	}

	@Override
	public AddressBookData updateAddressBookData(int addId, AddressBookDTO addressBookDTO) {
		AddressBookData addressBookData = this.getAddressBookDataById(addId);
		addressBookData.setName("Chethan");
		addressBookData.setMobileNumber("9685743620");
		addressBookData.setCity("Mysore");
		addressBookData.setState("Karnataka");
		addressBookData.setEmail("abc123@gmail.com");
		addressBookList.set(addId-1, addressBookData);
		return addressBookData;
	}

	@Override
	public void deleteAddressBookData(int addId) {
		addressBookList.remove(addId-1);

	}

}
