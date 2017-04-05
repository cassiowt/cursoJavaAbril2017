package com.target.testarcomandos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;

import com.target.dados.Animal;
import com.target.dados.Consulta;

public class Teste {
	
	
	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Animal cao = new Animal("Draco");
		
		Consulta consulta1 = new Consulta(sdf.parse("15/04/2017"), true);
		Consulta consulta2 = new Consulta(sdf.parse("25/04/2017"), true);
		Consulta consulta3 = new Consulta(sdf.parse("30/04/2017"), true);
		
		Collection<Consulta> consultas = new ArrayList<>();
		
		consultas.add(consulta1);
		consultas.add(consulta2);
		consultas.add(consulta3);
		
		cao.setConsultas(consultas);
		
		
		System.out.println("Apelido " + cao.getApelido());
		
		for (Consulta con: cao.getConsultas()) {
			System.out.println(
					sdf.format(con.getDataConsulta())
					+ " Cancelado " + con.getCacelado());
		}
		
		
		
		
	}
}
