package br.com.Produto;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.Produto.Dao.ClienteDAO;
import br.com.Produto.dto.ClienteDto;
import br.com.Produto.model.Cliente;
import br.com.Produto.service.Cliente.IClienteService;
import br.com.Produto.service.Cliente.ServiceClienteImpl;

@SpringBootTest(classes = ProdutoApplication.class)
public class ClienteTeste{
	
	@Autowired
	private ClienteDAO dao;
	
	@Autowired
	private IClienteService Iclient;

	@Autowired
	ServiceClienteImpl impl;
	@Test
	public void testeSalvarCarregar() {
		
		Cliente cliente = new Cliente();
		cliente.getId();
		cliente.setNome("jose");
		cliente.setTelefone(454545454);
		cliente.setCep(3456789);
		cliente.setEmail("ads@gmail");
		cliente.setEndereco("rua copa");
        cliente.setNumero(34);
        cliente.setCidade("itaqua");
        
        Cliente clienteSalvo= dao.save(cliente);
        
        
        
        assertEquals(cliente.getId(),clienteSalvo.getId());
        
       List <Cliente> lista =  Iclient.listartodos(); 
       
       
    	   System.out.println(lista);
    	   
       
    	   ClienteDto clienteDto = impl.ClienteMapper(cliente.getId());
    	   System.out.println("---------------------------MapperDTO------------------------");
    	   System.out.println(clienteDto);
    	   System.out.println("---------------------------MapperDTO------------------------");
    	   
	}
	
}