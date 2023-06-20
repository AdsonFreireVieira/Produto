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

import br.com.Produto.model.Pedido;
import br.com.Produto.service.Pedido.IPedidoService;

@RestController
@RequestMapping("/pedido")
public class PedidoController {

	@Autowired
	private IPedidoService service;

	@PostMapping
	public ResponseEntity<Pedido> criarNovo(@RequestBody Pedido pedido) {

		Pedido res = service.criarNovo(pedido);

		if (res != null) {
			return ResponseEntity.ok().body(res);
		}
		return ResponseEntity.badRequest().build();
	}

	@PutMapping("/{id}")
	public ResponseEntity<Pedido> alterar(@RequestBody Pedido pedido , @PathVariable int id){
		
		pedido.setNumPedido(id);
		
		Pedido ped = service.alterarDados(pedido);
		
		if(ped != null) {
			
			return ResponseEntity.ok().body(ped);
		}
		return ResponseEntity.badRequest().build();
		
	}	
	@GetMapping
	public ResponseEntity<List<Pedido>> listarTodos() {
		
		return ResponseEntity.ok(service.listar());
	}

	@GetMapping("/{id}")
	public ResponseEntity<Pedido> buscarPorid(@PathVariable Integer id) {

		Pedido res = service.buscarporId(id);

		if (res != null) {
			return ResponseEntity.ok(res);
		}
		return ResponseEntity.notFound().build();
	
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deletar(@PathVariable int id) {
		service.deletar(id);
		return ResponseEntity.ok().body("Removed");
	}
}
