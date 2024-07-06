package src;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Descrição dos curso JSava");
		curso1.setCargaHoraria(8);
		System.out.println(curso1);
		
		Curso curso2 =new Curso();
		curso2.setTitulo("Curso Python");
		curso2.setDescricao("Descrição dos curso Python");
		curso2.setCargaHoraria(4);
		System.out.println(curso2);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria Java");
		mentoria.setDescricao("Descrição mentoria Java");
		mentoria.setData(LocalDate.now());
		System.out.println(mentoria);

		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Backend Java");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		System.out.println("------------------");
		
		Dev dev1 = new Dev();
		dev1.setNome("Caroline");
		dev1.inscriverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos" + dev1.getConteudosInscritos());
		dev1.progredir();
		System.out.println("Conteúdos concluidos" + dev1.getConteudosConcluidos());
		System.out.println("XP: " + dev1.calcularTotalXp());
		
		System.out.println("------------------");
		
		Dev dev2 = new Dev();
		dev2.setNome("Simão");
		dev2.inscriverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos" + dev2.getConteudosInscritos());
		dev2.progredir();
		System.out.println("Conteúdos concluidos" + dev2.getConteudosConcluidos());
		System.out.println("XP: " + dev2.calcularTotalXp());
	}

}
