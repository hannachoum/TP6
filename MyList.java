package tp6;



public class MyList <E>{
	
	private Cell<E> firstOne; 
	
    
	public MyList()
	{
		firstOne=null; 
		
		
	}
  
    public void add(E str) 
    {
    	this.firstOne=new Cell<E>(str,this.firstOne); 
    	
      //Création d'une cellule
      // Placement de cette cellule en tête de liste 
    }
    
  
    public int size()
    {
    	int size=0; 
    	Cell<E> CurrentCell= firstOne; 
    	while(CurrentCell!=null)
    	{
    		size++; 
    		CurrentCell=CurrentCell.getNextOne(); 
    	}
    	return size; 
    	
    }

	@Override
	public String toString() 
	{
		String affichage= "Voici la liste à l'état courant : "; 
		
		Cell<E> CurrentCell=firstOne; 
	    
		
    	while(CurrentCell!=null)
    	{
    	 affichage = affichage + CurrentCell.getCellule().toString() +","; 
    	 CurrentCell=CurrentCell.getNextOne(); 
    	}
    	
    	
		return affichage; 
		
		
	}
    
	
	
	
    public void addLast(E str)
    {
    	Cell<E> CurrentCell= firstOne;  
        Cell<E> cpt=CurrentCell; 
    	while (CurrentCell!=null)
    	{
    		cpt=CurrentCell; 
    		CurrentCell=CurrentCell.getNextOne(); 
    	}
    	Cell<E> Cpt2=new Cell<E>(str,null); 
    	cpt.setNextOne(Cpt2);

    }
    
    
    public void add(E str, int i)
    {
    	Cell<E> CurrentCell= firstOne;  
    	Cell<E> before=null; 
    	Cell<E> after=null; 
    	Cell<E> insertion = new Cell<E>(str,null); 
    	int id=0; 
    	boolean ajout=false; 
    	while (CurrentCell!=null)
    	{
    		if(this.size()<i)
    		{
    			System.out.println("liste trop petite");
    			break; 
    		}
    		
    		if(id==i)
    		{
    			//Il faut tout décaler 
    			
    				before=CurrentCell; 
    				System.out.println("avant" +before.toString());
    				after= CurrentCell.getNextOne(); 
    				System.out.println("apres" +before.toString());
    				before.setNextOne(insertion);
    				insertion.setNextOne(after);
    				ajout=true; 
    				break; 
    				
    		}
    		id++; 
 
    	}
    		
    		if(id==i && ajout!=true )
    		{
    			CurrentCell.setNextOne(new Cell<E>(str,null));
    			
    		}
    		else
    		{
    		  System.out.println("pas de cellule d'indice i");
    		}
    	
    	ajout=false; 
    }
    
    
    public String get (int index)
    { 
    	Cell<E> CurrentCell= firstOne;
    	int id=0; 
    	
    		while (CurrentCell!=null)
    		{
    	    	if(id==index)
    	    	{
    	    		return CurrentCell.toString(); 
    	    	}
    	    	else 
    	    	{
    	    		CurrentCell=CurrentCell.getNextOne(); 
    	    	}
    	    	id++;
    		}
    		
    		return " impossible"; 
    	
    }
    
    public int sumLetter()
    {
    	Cell<E> CurrentCell= firstOne;
    	int cpt=0; 
    	while (CurrentCell!=null)
		{
    		cpt=cpt+CurrentCell.SommeNomCellule(); 
    		CurrentCell=CurrentCell.getNextOne(); 
		}
    	return cpt; 
    }
    
    
  

	public boolean Contains(E o)
    {
    	Cell<E> CurrentCell= firstOne; 
    	while (CurrentCell!=null)
    	{
    		if (CurrentCell.getCellule().equals(o))
    		{
    			return true; 
    		}
    		CurrentCell=CurrentCell.getNextOne(); 
    	}
    	return false; 
    	
    }

    
}
