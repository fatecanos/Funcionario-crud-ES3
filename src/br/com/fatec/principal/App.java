package br.com.fatec.principal;

import java.time.LocalDate;

import br.com.fatec.model.dao.DaoGenerico;
import br.com.fatec.model.domain.Cargo;
import br.com.fatec.model.domain.Funcionario;
import br.com.fatec.model.domain.Regional;
import br.com.fatec.model.domain.Setor;
import br.com.fatec.model.domain.Usuario;

public class App {

	public static void main(String[] args) {
		
		Usuario usuario = new Usuario();
		usuario.setAtivo(true);
		usuario.setNome("tiozimdamanha");
		usuario.setSenha("1234");
		DaoGenerico.salvar(usuario);
		
		Regional regional = new Regional();
		regional.setNome("Sul");
		regional.setAtivo(true);
		DaoGenerico.salvar(regional);
		
		Setor setor = new Setor();
		setor.setNome("Shield");
		setor.setRegional(regional);
		setor.setAtivo(true);
		DaoGenerico.salvar(setor);
		
		Cargo cargo = new Cargo();
		cargo.setNome("Administrativo");
		cargo.setSetor(setor);
		cargo.setAtivo(true);
		DaoGenerico.salvar(cargo);
		
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Lucas Nogueira");
		funcionario.setDataContratacao(LocalDate.of(1998, 02, 06));
		funcionario.setCpf("423254234");
		funcionario.setCargo(cargo);
		funcionario.setUsuario(usuario);
		funcionario.setEmail("lucas@gmail.com");
		funcionario.setDataCadastro(LocalDate.now());
		funcionario.setAtivo(true);
		
		DaoGenerico.salvar(funcionario);
	}

}
