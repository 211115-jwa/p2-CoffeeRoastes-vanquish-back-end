package p2CoffeeRoastesvanquishbackend.services;

import p2CoffeeRoastesvanquishbackend.beans.CreditCard;

import p2CoffeeRoastesvanquishbackend.beans.Plan;

import java.util.Set;

import p2CoffeeRoastesvanquishbackend.beans.Address;
import p2CoffeeRoastesvanquishbackend.beans.CustomerPlan;

import p2CoffeeRoastesvanquishbackend.beans.User;
import p2CoffeeRoastesvanquishbackend.exceptions.CustomerDoesNotExistException;
import p2CoffeeRoastesvanquishbackend.exceptions.IncorrectAddressExeption;
import p2CoffeeRoastesvanquishbackend.exceptions.IncorrectCredentialsException;
import p2CoffeeRoastesvanquishbackend.exceptions.UsernameAlreadyExistsException;
import p2CoffeeRoastesvanquishbackend.exceptions.customerplandoesnotexist;

public interface UserService {
	public User register(User newUser) throws UsernameAlreadyExistsException;

	public User logIn(String username, String password) throws IncorrectCredentialsException;


	public User getUserById(int id);


	public User updateUser(User userToUpdate);

	public Plan getPlan(String preference, String type, String quantity, String grind, String frequency);


	public Set<CustomerPlan> getCustomerPlansByName(int i);


	public CustomerPlan CreateNewPlan(CustomerPlan cusutomerplan);

	public Object getcustomerPlanbyID(int i);

	public void toggle(int i);

	Set<CustomerPlan> getCustomerPlansByName(String name);






}
