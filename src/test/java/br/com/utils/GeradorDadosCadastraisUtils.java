package br.com.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class GeradorDadosCadastraisUtils {
	
	public static String gerarNomeUsuarioComHoraMinutoSegundo(String nomeUsuario) {
		Date dataHora = new Date();
		return nomeUsuario
				.concat("_")
				.concat(new SimpleDateFormat("HH_mm_ss").format(dataHora));
	}
	
	
	public static String gerarEmailUsuario(String nomeUsuario) {
		return nomeUsuario.concat("@email.com").toLowerCase();
	}

}
