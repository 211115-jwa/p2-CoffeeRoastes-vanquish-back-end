package p2CoffeeRoastesvanquishbackend.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import java.util.Objects;

import javax.persistence.Column;



@Entity
@Table(name="role")

public class Role {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="role_id")
	private int id;
	@Column(name="role_name")
	private String name;

	public Role() {
		id = 1;
		name = "User";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Role other = (Role) obj;
		return id == other.id && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Role [id=" + id + ", name=" + name + "]";
	}



}
