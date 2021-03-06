package p2CoffeeRoastesvanquishbackend.data;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import p2CoffeeRoastesvanquishbackend.beans.CreditCard;

@Repository
public interface CreditCardRepository extends JpaRepository<CreditCard, Integer> {

	public Set<CreditCard> findByUserUsername(String name);
	public CreditCard findById(String name);
	
}
