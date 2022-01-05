package aplicacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entidades.Produto;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Produto>list = new ArrayList<>();
		
		list.add(new Produto("Tv",900.00));
		list.add(new Produto("Notebook", 1200.00));
		list.add(new Produto("Tablete",450.00));
		
		Collections.sort(list);
		
		for(Produto p : list) {
			System.out.println(p);
		}


	}

}
