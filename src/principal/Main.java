package principal;

import java.util.UUID;

import entities.Clientes;
import repositories.ClienteRepository;

public class Main {
	
	public static void main(String[] args) {
		
		Clientes cliente = new Clientes();
		ClienteRepository repository = new ClienteRepository();
		
		cliente.setId(UUID.randomUUID());
		cliente.setNome("Bruno Antunes");
		cliente.setCpf("13035845201");
		cliente.setTelefone("965874521");
		cliente.setEmail("bantunes@gmail.com");
		
		
		System.out.println("\nSISTEMA PARA CADASTRO DE CLIENTES");
		System.out.println("\nTurma de Java WebDev Fullstack - Sabado Integral");
		System.out.println("\nDados do Cliente");
		System.out.println("\tID do Cliente ---------> "+cliente.getId());
		System.out.println("\tNome do Cliente -------> "+cliente.getNome());
		System.out.println("\tCPF do Cliente --------> "+cliente.getCpf());
		System.out.println("\tEmail do CLiente ------> "+cliente.getEmail());
		System.out.println("\tTelefone do Cliente ---> "+cliente.getTelefone());
		
		repository.exportarrDados(cliente);
		System.out.println("\n\nArquivo Exportado com Sucesso !");
		
	}

}
