package p2CoffeeRoastesvanquishbackend.services;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;

import p2CoffeeRoastesvanquishbackend.beans.Address;
import p2CoffeeRoastesvanquishbackend.data.AddressRepository;

import p2CoffeeRoastesvanquishbackend.exceptions.IncorrectAddressExeption;


//@Service

public class AddressServiceImpl implements AddressService {

	private AddressRepository addressRepo;
	
	

	@Autowired
	public AddressServiceImpl(AddressRepository addressRepo) {
		
   	this.addressRepo = addressRepo;

	}
	// This function is to Look up address by User id

	@Override
	public Address addNewAddress(Address newAddress) {

		return addressRepo.create(newAddress);
	}

	// This function is to Add Address where user is

	@Override
	public Address getLookUpAddressByUser(int user_id) {
		Address UserByAddress = addressRepo.findAddressByUserId("User Address exist");
		if (UserByAddress != null) {
			addressRepo.findById(user_id);
		}
		return UserByAddress;
	}

    //  This function is to Delete address by Id

	@Override
	public Address deleteAddressById(Address id) throws IncorrectAddressExeption {

		Address DeleteUserAddressFromDatabase = addressRepo.findAddressByUserId(" 11006 SE 68TH ST APT 303");
		if (DeleteUserAddressFromDatabase != null) {
			return DeleteUserAddressFromDatabase;

		} else {

			throw new IncorrectAddressExeption();
		}

	}
}