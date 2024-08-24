package repositories;

import java.io.PrintWriter;

import entities.Clientes;

public class ClienteRepository {
	
	public void exportarrDados(Clientes cliente) {		
		
		try {
			
			PrintWriter printWriter = new PrintWriter("c:\\temp\\Cliente_"+cliente.getNome()+"_"+cliente.getId()+".txt");
			
			printWriter.write("DADOS DO CLIENTE: "+cliente.getNome()+"\n");
			printWriter.write("\nID ----------> "+cliente.getId());
			printWriter.write("\nNome --------> "+cliente.getNome());
			printWriter.write("\nCPF ---------> "+cliente.getCpf());
			printWriter.write("\nEmail -------> "+cliente.getEmail());
			printWriter.write("\nTelefone ----> "+cliente.getTelefone());
			printWriter.flush();
			printWriter.close();
			
		} catch (Exception e) {

			System.out.println("\nERRO ------> "+e.getMessage());
			
		}
		
	}

}
