package gomesmatheus.com.github.dto;

import java.io.Serializable;
import java.time.Instant;

import gomesmatheus.com.github.entities.Client;

public class ClientDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String name;
	private String cpf;
	private Double income;
	private Instant birthDate;
	private Integer children;
	
	public ClientDTO() {}
	
	public ClientDTO(String name, String cpf, Double income, Instant birthDate, Integer children) {
		this.name = name;
		this.cpf = cpf;
		this.income = income;
		this.birthDate = birthDate;
		this.children = children;
	}
	
	public ClientDTO(Client entity) {
		this.name = entity.getName();
		this.cpf = entity.getCpf();
		this.income = entity.getIncome();
		this.birthDate = entity.getBirthDate();
		this.children = entity.getChildren();
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Double getIncome() {
		return income;
	}
	public void setIncome(Double income) {
		this.income = income;
	}
	public Instant getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Instant birthDate) {
		this.birthDate = birthDate;
	}
	public Integer getChildren() {
		return children;
	}
	public void setChildren(Integer children) {
		this.children = children;
	}

}
