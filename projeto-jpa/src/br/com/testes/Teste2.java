package br.com.testes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import br.com.entity.Agenda;
import br.com.logic.Logic;

public class Teste2 {

	public static void main(String[] args) throws Exception {

		Logic logic = new Logic();

		String inicio = "06:00";
		String fim = "18:59";

		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
		Calendar hinicio = Calendar.getInstance();
		Calendar hfim = Calendar.getInstance();

		hinicio.setTime(sdf.parse(inicio));
		hfim.setTime(sdf.parse(fim));

		long minutos = ((hfim.getTimeInMillis() - hinicio.getTimeInMillis())) / 60000;
		long resto = minutos % 60;
		long horas = minutos / 60;
		
		String diferenca = horas +":"+resto;
		double valor = horas * 10.00;
		double varesto = resto  * 60;
		double v = varesto / 60;
		
		System.out.println(valor);
		System.out.println(v);
	}
}
