package p2CoffeeRoastesvanquishbackend.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import p2CoffeeRoastesvanquishbackend.data.AddressRepository;
import p2CoffeeRoastesvanquishbackend.beans.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer >{
	
	public Address deleteById(int id);
//public Address addAddressWhereUserIs(Address newAddress);
	public Address findByUserId(int id);
	
	
//    Invoice findByCustomerId(long id);
	
	
   
}
