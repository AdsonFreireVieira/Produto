package br.com.Produto.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.Produto.model.Cliente;
import br.com.Produto.service.Cliente.IClienteService;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

	@Autowired
	private IClienteService service;

	@PostMapping
	public ResponseEntity<Cliente> cadastrarNovo(@RequestBody Cliente cliente) {

		Cliente result = service.salvar(cliente);
		if (result != null) {
			return ResponseEntity.status(201).body(result);
		} else {

			return ResponseEntity.badRequest().build();
		}
	}

	@GetMapping("/{id}")
	public ResponseEntity<Cliente>  buscarporId(@PathVariable Integer id) {

		Cliente result = service.buscar(id);

		if (result != null) {

			return ResponseEntity.ok(result);
		} else {

			return ResponseEntity.notFound().build();
		}
	}

	@GetMapping
	public ResponseEntity<List<Cliente>> getAll() {

		return ResponseEntity.ok(service.listartodos());
	}

	@PutMapping("/{id}")
	public ResponseEntity<Cliente> alterar(@RequestBody Cliente cliente, @PathVariable Integer id) {
		cliente.setId(id);

		try {
			Cliente result = service.alterar(cliente);
			if (result != null) {
				return ResponseEntity.ok(result);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ResponseEntity.badRequest().build();

	}
   @DeleteMapping("/{id}")
    public ResponseEntity<?> deletar(@PathVariable  Integer id){
	  
	   service.deletar(id);
	   return ResponseEntity.ok("Removed");
   }

}










