package br.com.fatec.principal;

import java.time.LocalDate;
import br.com.fatec.config.aplicacao.Resultado;
import br.com.fatec.controller.command.CadastrarCommand;
import br.com.fatec.model.domain.Cargo;
import br.com.fatec.model.domain.Funcionario;
import br.com.fatec.model.domain.Regional;
import br.com.fatec.model.domain.Setor;
import br.com.fatec.model.domain.Usuario;

public class App {

	public static void main(String[] args) {
		Resultado resultado;
		
		Usuario usuario = new Usuario();
		usuario.setAtivo(true);
		usuario.setNome("tiozimdamanha");
		usuario.setSenha("1234");
		resultado = new CadastrarCommand().executa(usuario);
		System.out.println(resultado.getMensagem());
		System.out.println("Status:" + resultado.getMotivo());
		
		Regional regional = new Regional();
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
		System.out.println("Status:" + resultado.getMotivo());
	}

}
