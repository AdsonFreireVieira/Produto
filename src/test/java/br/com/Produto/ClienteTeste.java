package br.com.Produto;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.Produto.Dao.ClienteDAO;
import br.com.Produto.model.Cliente;

@SpringBootTest(classes = ProdutoApplication.class)
public class ClienteTeste{
	
	@Autowired
	private ClienteDAO dao;

	@Test
	public void testeSalvarCarregar() {
		
		Cliente cliente = new Cliente();
		cliente.setNome("jose");
		cliente.setTelefone(454545454);
		cliente.setCep(3456789);
		cliente.setEmail("ads@gmail");
		cliente.setEndereco("rua copa");
        cliente.setNumero(34);
        cliente.setCidade("itaqua");
        
        Cliente clienteSalvo= dao.save(cliente);
        
        assertEquals(cliente.getId(),clienteSalvo.getId());
	} 
	
}