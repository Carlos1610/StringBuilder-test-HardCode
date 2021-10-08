package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		Comment c1 = new Comment("Tenha uma boa viagem");
		Comment c2 = new Comment("wow isso é incrivel!");

		Post p1 = new Post(sdf.parse("08/10/2021 20:10:44"), "Viajando para o Brasil", "vou visitar esse pais marabilhoso!", 12);
		
		p1.addComment(c1);
		p1.addComment(c2);
		
		System.out.println(p1);
	}

}
