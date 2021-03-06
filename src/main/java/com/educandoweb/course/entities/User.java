package com.educandoweb.course.entities;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/** 
 *  Quando um objeto for transformado em uma cadeia de bytes, para que o objeto possa trafegar na rede, para que o objeto
 *  possa ser gravado em arquivos... Precisa da interface Serializable implementada.
 *
 */
//Sempre bom importar do lugar: javax.persistence.Entity; Dando preferência para a especificação //
//Sempre bom sua classe depender da especificação, não da implementação: org.hibernate..... //
@Entity  
public class User implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Auto Incremento //
	private Long id;
	private String name;
    private String email;
    private String phone;
    private String password;
    
    // Vazio, pois estou utilizando frameworks //
    public User() {
    	
    }

    // Todos os Atributos //
	public User(Long id, String name, String email, String phone, String password) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.password = password;
	}
    
	
	@Override
	public int hashCode() {
		return Objects.hash(email, id, name, password, phone);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(email, other.email) && Objects.equals(id, other.id) && Objects.equals(name, other.name)
				&& Objects.equals(password, other.password) && Objects.equals(phone, other.phone);
	}

	// getters and setters //
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}