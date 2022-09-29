package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Postagem {
	
	//constante
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	
	//atb
	private Date momento;
	private String titulo;
	private String conteudo;
	private Integer curtidas;
	
	//atb Associacao- Quando houver composição tem muitos (  *  ) ele não pode ser inciado no construtor e sim instanciada no proprio obj
	private List<Comentario> comentarios = new ArrayList<>();
	
	//const1
	public Postagem() {
		
	}
	//const2 - Caso tenha colocado alguma lista no construtor, tire-a e instancie ela em seu atb
	public Postagem(Date momento, String titulo, String conteudo, Integer curtidas) {
		this.momento = momento;
		this.titulo = titulo;
		this.conteudo = conteudo;
		this.curtidas = curtidas;
	}
	
	//get set
	public Date getMomento() {
		return momento;
	}
	public void setMomento(Date momento) {
		this.momento = momento;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getContente() {
		return conteudo;
	}
	public void setContente(String contente) {
		this.conteudo = conteudo;
	}
	public Integer getCurtidas() {
		return curtidas;
	}
	public void setCurtidas(Integer curtidas) {
		this.curtidas = curtidas;
	}
	public List<Comentario> getComentarios() {
		return comentarios;
	}

	// Operador Metodo // Usado para substituir o set da List
	public void addComentario(Comentario comentario) {
		comentarios.add(comentario);
	}
	public void removeComentario(Comentario comentario) {
		comentarios.remove(comentario);
	}
	
	
	//StringBuilder bom para montar um String muito grande a partir de vários Strings pequenos
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(titulo + "\n");
		sb.append(curtidas);
		sb.append(" Curtidas - ");
		sb.append(sdf.format(momento) + "\n");
		sb.append(conteudo + "\n");
		sb.append("Comentarios: \n");
		
		for (Comentario c : comentarios) {
			sb.append(c.getTexto() + "\n");
		}
		return sb.toString();
				
		
	}
	

}
