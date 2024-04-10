package com.ComBancoDeDados.ProjetoComBancoDeDados;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ComBancoDeDados.ProjetoComBancoDeDados.ClienteService.ClienteService;

@RestController
@RequestMapping(value="/api")

public class ClienteController {
	
	@Autowired
	private ClienteService clienteService;
	
	@GetMapping(value="/Allclientes")
	public ResponseEntity<List<Cliente>> listaFuncionarios (){
		List<Cliente> clientes = clienteService.listarTodosClientes();
		return new ResponseEntity<List<Cliente>> (clientes,HttpStatus.OK);
	}
	
	@GetMapping(value="/cliente/{id}")
	public ResponseEntity<Cliente> buscarcliente(@PathVariable ("id") int id) {
		Cliente cliente = clienteService.retornarCliente(id);
		return new ResponseEntity<Cliente> (cliente,HttpStatus.OK);
	}
	
	@DeleteMapping("/cliente/{id}")
	public void deletandoFuncionario(@PathVariable ("id") int id) {
		clienteService.deletarCliente(id);
		
	}
	
	@PostMapping("/cliente")
	public void inserindoClinte(@RequestBody Cliente cliente) {
		clienteService.inserirCliente(cliente);
	}

}
