package br.com.Produto.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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

		if(res != null) {
			return ResponseEntity.ok().body(res);
		}
		return ResponseEntity.badRequest().build();
	}
	
	@GetMapping
	public ResponseEntity <List<Pedido>> listar(){
		return ResponseEntity.ok().body(service.listar());
	}

	@GetMapping("/{id}")
	public ResponseEntity<Pedido> buscarPorid(@PathVariable int id){
		
		Pedido res = service.buscarporId(id);
		
		if(res != null) {
		  return ResponseEntity.ok(res);
		}
		return ResponseEntity.notFound().build();		
	
		
	}
}








