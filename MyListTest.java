package tp6;

import static org.junit.jupiter.api.Assertions.*; 

import org.junit.jupiter.api.Test;

class MyListTest {

	@Test
	void test() {
		fail("Not yet implemented");
	}

	
	public void testSum() throws Exception {

		MyList ml=new MyList();
		ml.add("toto");	
		ml.add("titi");
	    assertEquals(ml.sumLetter(), 8);
	  }
	

	
}
