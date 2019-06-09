package br.com.fatec.principal;

import br.com.fatec.config.aplicacao.Broker;
import br.com.fatec.controller.command.Cadastrar;
import br.com.fatec.model.domain.Usuario;

public class App {

	public static void main(String[] args) {
		
		Usuario usuario = new Usuario();
		usuario.setIsAtivo(true);
		usuario.setNome("tzm");
		usuario.setSenha("39940030");
	
		Cadastrar cad = new Cadastrar();
		
		Broker broker = new Broker();
		broker.setEntidade(usuario);
		broker.adicionaComando(cad);
		//broker.adicionaComando(excluir);
		broker.executarAcoes();
		
		/*Regional regional = new Regional();
		regional.setNome("Sul");
		regional.setAtivo(true);
		resultado = new CadastrarCommand().executa(regional);
		System.out.println(resultado.getMensagem());
		System.out.println("Status:" + resultado.getMotivo());
		
		Setor setor = new Setor();
		setor.setNome("Shield");
		setor.setRegional(regional);
		setor.setAtivo(true);
		resultado = new CadastrarCommand().executa(setor);
		System.out.println(resultado.getMensagem());
		System.out.println("Status:" + resultado.getMotivo());
		
		Cargo cargo = new Cargo();
		cargo.setNome("Administrativo");
		cargo.setSetor(setor);
		cargo.setAtivo(true);
		resultado = new CadastrarCommand().executa(cargo);
		System.out.println(resultado.getMensagem());
		System.out.println("Status:" + resultado.getMotivo());
		
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Lucas Nogueira");
		funcionario.setDataContratacao(LocalDate.of(1998, 02, 06));
		funcionario.setCpf("423254234");
		funcionario.setCargo(cargo);
		funcionario.setUsuario(usuario);
		funcionario.setEmail("lucas@gmail.com");
		funcionario.setDataCadastro(LocalDate.now());
		funcionario.setAtivo(true);
		
		resultado = new CadastrarCommand().executa(funcionario);
		System.out.println(resultado.getMensagem());
		System.out.println("Status:" + resultado.getMotivo());*/
	}

}
