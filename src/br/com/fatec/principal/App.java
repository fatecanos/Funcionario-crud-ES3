package br.com.fatec.principal;

import java.time.LocalDate;

import br.com.fatec.config.aplicacao.Resultado;
import br.com.fatec.config.patterns.Command;
import br.com.fatec.controller.command.Cadastrar;
import br.com.fatec.model.dao.DaoGenerico;
import br.com.fatec.model.domain.Cargo;
import br.com.fatec.model.domain.Funcionario;
import br.com.fatec.model.domain.Regional;
import br.com.fatec.model.domain.Setor;
import br.com.fatec.model.domain.Usuario;

public class App {

	public static void main(String[] args) {
		
		Usuario usuario = new Usuario();
		usuario.setIsAtivo(true);
		usuario.setNome("joao");
		usuario.setSenha("050523232323");
	
		Command cad = new Cadastrar();
		
		/*Resultado resultado = cad.executa(usuario);
		System.out.println(resultado.getMensagem()+": "+resultado.getMotivo());
		
		Regional regional = new Regional(true, "Sul");
		Setor setor = new Setor(true, "Administrativo", regional);
		Cargo cargo = new Cargo(true, "Gerente", setor);
		
		resultado = cad.executa(regional);
		resultado = cad.executa(setor);
		resultado = cad.executa(cargo);*/
		
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Lucas Marques Nogueira");
		funcionario.setCpf("12323123123");
		funcionario.setDataCadastro(LocalDate.now());
		funcionario.setDataContratacao(LocalDate.now());
		funcionario.setNumeroMatricula(123);
		funcionario.setEmail("lucas@gmail.com");
		funcionario.setCargo(cargo);
		funcionario.setUsuario(usuario);
		funcionario.setIsAtivo(true);
		
		resultado = cad.executa(funcionario);
		
		System.out.println(resultado.getMensagem() + ": "+ resultado.getMotivo());
		
	}

}
