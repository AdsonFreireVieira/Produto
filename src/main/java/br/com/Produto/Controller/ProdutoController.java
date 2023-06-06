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

import br.com.Produto.model.Produto;
import br.com.Produto.service.Produto.IProdutoService;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

	@Autowired
	private IProdutoService service;

	@PostMapping()
	public ResponseEntity<Produto> adicionarNovo(@RequestBody Produto produto) {

		Produto result = service.cadastrarNovo(produto);

		if (result != null) {

			return ResponseEntity.status(201).body(result);

		} else {

			return ResponseEntity.notFound().build();
		}
	}

	@GetMapping()
	public ResponseEntity<List<Produto>> listar() {

		return ResponseEntity.ok(service.listar());
	}

	@GetMapping("/{id}")
	public ResponseEntity<Produto> buscarPorId(@PathVariable int id) {

		Produto result = service.buscarPorId(id);

		return ResponseEntity.ok().body(result);
	}

	@PutMapping("/{id}")
	public ResponseEntity<Produto> alterar(@RequestBody Produto produto, @PathVariable int id) {

		produto.setId(id);
		Produto result = service.alterar(produto);

		if (result != null) {

			return ResponseEntity.ok(result);
		}

		return ResponseEntity.badRequest().build();
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<?> deletar(@PathVariable int id) {

		service.deletar(id);

		return ResponseEntity.ok("Removed");

	}
}
