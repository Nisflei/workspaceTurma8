package br.com.aula10.daoController;

import java.util.ArrayList;
import java.util.List;

import br.com.aula10.beansModel.Veiculo;

public class VeiculoDao {
	
	// objetivo de simular um BD em "memoria"  
	
	List<Veiculo> bancoVeiculos = new ArrayList<Veiculo>();
	
	public VeiculoDao() {}
	
	
	public boolean ConectarBD(String urlConexaoBD) {
		// Neste deveria estabelecer todos os passos necessario para criar uma conexao ao BD
		
		return true;
	}
	
	public boolean incluir(Veiculo v) {
		// salva no BD
		
		if (!ConectarBD("url teste")) {
			System.out.println("Erro no BD");
			return false;
		}
		
		bancoVeiculos.add(v);
		
		System.out.println("SALVAR OK");
		System.out.println(bancoVeiculos);
		return true;
	}
	
	public Veiculo consultaPorPlaca(String placa) {
		if (!ConectarBD("url teste")) {
			System.out.println("Erro no BD");
		}
		
		for (Veiculo elemento: bancoVeiculos) {
			if (elemento.getPlaca().equalsIgnoreCase(placa)) {
				System.out.println("CONSULTAR OK");
				return elemento;
			}
		}
		return null;
	}
	
	public boolean alterar(Veiculo v) {
		if (!ConectarBD("url teste")) {
			System.out.println("Erro no BD");
			return false;
		}
		
		for (Veiculo elemento: bancoVeiculos) {
			if (elemento.getPlaca().equalsIgnoreCase(v.getPlaca())) {
				bancoVeiculos.remove(elemento);
				bancoVeiculos.add(v);
				System.out.println("ALTERAR OK");
				System.out.println(bancoVeiculos);
				return true;
			}
		}
		return false;
	}
	
	public boolean excluir(Veiculo v) {
		if (!ConectarBD("url teste")) {
			System.out.println("Erro no BD");
			return false;
		}
		
		for (Veiculo elemento: bancoVeiculos) {
			if (elemento.getPlaca().equalsIgnoreCase(v.getPlaca())) {
				bancoVeiculos.remove(elemento);
				System.out.println("REMOVER OK");
				System.out.println(bancoVeiculos);
				return true;
			}
		}
		return false;
	}
	
	
	

}
