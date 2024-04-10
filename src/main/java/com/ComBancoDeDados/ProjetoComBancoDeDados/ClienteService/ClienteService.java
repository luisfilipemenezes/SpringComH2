package com.ComBancoDeDados.ProjetoComBancoDeDados.ClienteService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.ComBancoDeDados.ProjetoComBancoDeDados.Cliente;
import com.ComBancoDeDados.ProjetoComBancoDeDados.Reopsitory.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository clienteRepository;

	public List<Cliente> listarTodosClientes() {
		Cliente c =  new Cliente("Filipe", 334, 'M', null);
		clienteRepository.save(c);
		return  clienteRepository.findAll();
		
	}
	
	public Cliente  retornarCliente(int id) {
		return clienteRepository.getReferenceById(id);
		
	}
	
	public void inserirCliente(Cliente cliente) {
		clienteRepository.save(cliente);
		
	}
	
	public void deletarCliente(int id) {
		clienteRepository.deleteById(id);
	}
	
	
}
