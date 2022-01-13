package tp6;

import java.util.Objects;

public class Cell <E>{
	
	private E cellule; 
	private Cell <E> nextOne; 

	public Cell()
	{
		this.nextOne=null; 
	}
	
	public Cell(E str, Cell<E> next)
	{
		this.cellule=str; 
		this.nextOne=next; 
	}

    public int SommeNomCellule()
    {
    	if (cellule instanceof String)
    	{
    		return ((String) this.cellule).length(); 
    	}
    	if (cellule instanceof Integer)
    	{
    		 return this.cellule.toString().length(); 
    	}
    	else return 0; 
    }
    
	public E getCellule() {
		return cellule;
	}


	public void setCellule(E cellule) {
		this.cellule = cellule;
	}


	public Cell<E> getNextOne() {
		return nextOne;
	}


	public void setNextOne(Cell<E> nextOne) {
		this.nextOne = nextOne;
	}


	




	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cell [cellule=");
		builder.append(cellule);
		builder.append(", nextOne=");
		builder.append(nextOne);
		builder.append("]");
		return builder.toString();
	}
	
	
}
