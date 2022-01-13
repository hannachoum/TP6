package tp6;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyList <String> ml=new MyList <String>();
		
		System.out.println("*******EXERCICE 1************");
		
		System.out.println("ajout en début de liste ");
		ml.add("toto");	 
		System.out.println(ml.toString()); 
		System.out.println("ajout en début de liste ");
		ml.add("titi");
		System.out.println(ml.toString()); 
		System.out.println("ajout en fin de liste ");
		ml.addLast("tutu");
		System.out.println(ml.toString()); 
		System.out.println("ajout en fin de liste ");
		ml.addLast("tata");
		System.out.println(ml.toString()); 
		
		System.out.println("Insertion en position 1 ");
	 	ml.add("insertion",1); // doit se mettre après toto
	 	
	 	System.out.println(ml.toString()); 
		
	 	System.out.println("recherche de l'élement à l'index 3");
		System.out.println(ml.get(3)); 
		
		System.out.println("Affichons la somme des lettres de toute les cellules de la liste");
		System.out.println("La somme est "+ ml.sumLetter());
		
		
		System.out.println("*******EXERCICE 2************");
		System.out.println("Test de Contains ( Object o) ");
		
		System.out.println(ml.Contains("toto")); 
		
		System.out.println("ajout d'un int ");
		
		/***Ajout d'un integer***/
		MyList <Integer> ml2=new MyList <Integer>();
		ml2.add(44);
		System.out.println(ml2.toString());
		System.out.println("\"Affichons la somme des lettres de toute les cellules de la liste avec un int");
		System.out.println("La somme est "+ ml2.sumLetter());
		
		
		System.out.println("*******EXERCICE 3************");
		
		Map<String, String> MapGeometrique = new HashMap<String, String>();
		
		
			 Map<Point, Circle> m = new HashMap<>();
			 Point p1 = new Point(100,150);
			 Circle c1 = new Circle(p1,100);
			 m.put(p1, c1);
			 System.out.println(m.containsKey(p1));
			 System.out.println(m.containsKey(new Point(1,2)));
		
		
	}

}
