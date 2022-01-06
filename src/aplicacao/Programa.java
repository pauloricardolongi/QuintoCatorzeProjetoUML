package aplicacao;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import entidades.Produto;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Produto>list = new ArrayList<>();
		
		list.add(new Produto("Tv",900.00));
		list.add(new Produto("Notebook", 1200.00));
		list.add(new Produto("Tablete",450.00));	
		
		list.sort((p1, p2) -> p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase()));
		
		for(Produto p : list) {
			System.out.println(p);
		}


	}

}
