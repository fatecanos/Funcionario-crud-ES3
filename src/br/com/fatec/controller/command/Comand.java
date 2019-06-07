package br.com.fatec.controller.command;

import br.com.fatec.config.patterns.ICommand;
import br.com.fatec.controller.facade.Fachada;

abstract class Comand implements ICommand{
	protected Fachada fachada = new Fachada();
}
