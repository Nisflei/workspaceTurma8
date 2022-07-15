package br.com.aula10.implementacaoViewer;

import br.com.aula10.beansModel.Veiculo;
import br.com.aula10.daoController.VeiculoDao;
import br.com.aula10.util.Input;

public class ExecutarVeiculo {

	public static void main(String[] args) {

		String opc;
		String placa;
		Veiculo veiculoLocalizado;

		VeiculoDao veiculoDao = new VeiculoDao();

		do {
			opc = Input.texto("=== Controle de Veiculo === \n\n"
					+ "Escolha opção: \n<I>ncluir  \n<A>lterar  \n<C>onsultar  \n<E>xcluir  \n<S>air");

			switch (opc.charAt(0)) {

			case 'I':
				// fazer a inclusao
				try {
					Veiculo v = new Veiculo();

					v.setPlaca(Input.texto("Placa:"));
					v.setModelo(Input.texto("Modelo:"));
					v.setPotencia(Input.inteiro("Potencia:"));
					v.setAnoFabricacao(Input.inteiro("Ano Fabricação:"));
					v.setProprietario(Input.texto("Proprietario:"));

					veiculoDao.incluir(v);
				} catch (Exception e) {
					Input.mensagem(e.getMessage());
				}
				break;

			case 'C':

				placa = Input.texto("Digite a placa para pesquisa:");

				try {

					veiculoLocalizado = veiculoDao.consultaPorPlaca(placa);

					if (veiculoLocalizado == null) {
						Input.mensagem("Veiculo não localizado..!!");
					} else {
						Input.mensagem("--- Dados do Veiculo --- \n\n" + veiculoLocalizado.toString());
					}
				} catch (Exception e) {
					Input.mensagem(e.getMessage());
				}

			case 'A':
				placa = Input.texto("Digite a placa do veiculo para Alterar:");

				veiculoLocalizado = veiculoDao.consultaPorPlaca(placa);

				if (veiculoLocalizado == null) {
					Input.mensagem("Veiculo não localizado..!!");
				} else {
					veiculoLocalizado.setProprietario(Input.texto("Novo Proprietario"));

					veiculoDao.alterar(veiculoLocalizado);
				}
				break;

			case 'E':
				// excluir  

				placa = Input.texto("Digite a placa do veiculo para Excluir:");

				veiculoLocalizado = veiculoDao.consultaPorPlaca(placa);

				if (veiculoLocalizado == null) {
					Input.mensagem("Veiculo não localizado..!!");
				} else {
					if (veiculoDao.excluir(veiculoLocalizado)) {
						Input.mensagem("Exclusão com sucesso..!! Placa:" + veiculoLocalizado.getPlaca());
					} else {
						Input.mensagem("Não Localizado..! ");

					}
				}
				break;

			case 'S':
				break;

			default:
				Input.mensagem("Digite somente a iniciais indicadas..!!!");
				break;
			}

		} while (!opc.equalsIgnoreCase("S"));

		System.out.println("Fim do programa...!!!");
	}

}
