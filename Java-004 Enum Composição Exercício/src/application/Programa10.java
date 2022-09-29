package application;

import java.util.Date;

import entities.Pedido;
import entities.enums.StatusPedido;

public class Programa10 {
	
	public static void main(String[] args) {
		
		// Istanciando Class e (populando seus atributos)
		Pedido pedido = new Pedido(1080, new Date(), StatusPedido.AGUARDANDO_PAGAMENTO);
		
		System.out.println(pedido);
				
				
		//Instanciando Class
		//Convertendo String para enum 
		//Usando valueOf, e passando o nome identico ao descrito na classe enum é possível instanciá-lo
		StatusPedido sp1 = StatusPedido.ENTREGUE;
		
		StatusPedido sp2 = StatusPedido.valueOf("ENTREGUE");
		
		System.out.println(sp1);
		System.out.println(sp2);
	}

}
