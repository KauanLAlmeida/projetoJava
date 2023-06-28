package com.projeto.java;

import java.time.LocalDate;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.projeto.java.dominio.Pessoa;
import com.projeto.java.dominio.PessoaRepositorio;

@Component
@Transactional
public class PopulacaoInicialBanco implements CommandLineRunner{
    
	@Autowired
	private PessoaRepositorio pessoaRepo;
	
	@Override
	public void run(String... args) throws Exception {
		
		Pessoa p1 = new Pessoa("Joao");
		p1.setDataNascimento(LocalDate.of(2000, 04, 01));
		p1.setEmail("Joaolucas@gmail.com");
		Pessoa p2 = new Pessoa("Maria");
		p2.setDataNascimento(LocalDate.of(2002, 05, 10));
		p2.setEmail("Marialucas@gmail.com");
		
		pessoaRepo.save(p1);
		pessoaRepo.save(p2);
         		
	}
	

}
