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

import br.com.Produto.model.pedido;
import br.com.Produto.service.Pedido.IPedidoService;

@RestController
@RequestMapping("/pedido")
public class PedidoController {

	@Autowired
	IPedidoService service;

	@PostMapping
	public ResponseEntity<pedido> criarNovo(@RequestBody pedido novo) {

		pedido result = service.criarNovo(novo);
		if (result != null) {

			return ResponseEntity.status(201).body(result);

		}
		return ResponseEntity.badRequest().build();
	}

	@PutMapping("/{id}")
	public ResponseEntity<pedido> alterar(@PathVariable int id, @RequestBody pedido Pedido) {

		Pedido.setId(id);
		pedido result = service.alterarDados(Pedido);

		if (result != null) {
			return ResponseEntity.ok().body(result);
		}
		return ResponseEntity.notFound().build();

	}

	@GetMapping
	public ResponseEntity<List<pedido>> listar() {

		return ResponseEntity.ok(service.listar());
	}

	@GetMapping("{id}")
	public ResponseEntity<pedido> buscarporId(@PathVariable int id) {

		return ResponseEntity.ok(service.buscarporId(id));
	}

	@DeleteMapping("{id}")
	public ResponseEntity<?> deletar(@PathVariable int id) {
		service.deletar(id);
		return ResponseEntity.ok("Removed");
	}
}
