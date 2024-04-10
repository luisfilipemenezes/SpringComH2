package com.ComBancoDeDados.ProjetoComBancoDeDados;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "adress")
public class Endereco {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private int adress_id;
	

	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="cliente_id", referencedColumnName = "id")
	private Cliente cliente;
	private int cpf;
	private String rua;
	private String bairro;
	private int numero;
	
	public Endereco(int cpf, String rua, String bairro, int numero) {
		super();
		this.cpf = cpf;
		this.rua = rua;
		this.bairro = bairro;
		this.numero = numero;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
	

}
