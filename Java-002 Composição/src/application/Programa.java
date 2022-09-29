package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comentario;
import entities.Postagem;

public class Programa {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		Comentario c1 = new Comentario("Tenha uma boa viagem!");
		Comentario c2 = new Comentario("Uau, isso é fantástico!");
		
		Postagem p1 = new Postagem(
				sdf.parse("21/06/2018 13:05:44"),
				"Viajando para Nova Zelandia",
				"Eu vou visitar esse país maravilhoso!",
				12);
		p1.addComentario(c1);
		p1.addComentario(c2);
		
		Comentario c3 = new Comentario("Boa noite");
		Comentario c4 = new Comentario("Que a força esteja com você");
		
		Postagem p2 = new Postagem(
				sdf.parse("28/07/2018 23:14:19"),
				"Boa noite, galera",
				"Te vejo amanhã",
				5);
		p2.addComentario(c3);
		p2.addComentario(c4);
		
		
		
		
		
		System.out.println(p1);
		System.out.println(p2);

	}

}
