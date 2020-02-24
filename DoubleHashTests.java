package Dictionary;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Iterator;

import org.junit.jupiter.api.Test;

class DoubleHashTests {
	HashComparator<String> scomp = new StringComparator();
	DoubleHash<String, String> ht = new DoubleHash<String, String>(101, scomp);
	DoubleHash<String, String> ht2 = new DoubleHash<String, String>(101, scomp);

	@Test
	void test() {
		assertEquals(ht.size().intValue(), 0); assertEquals(ht.isEmpty(), true);
		assertEquals(ht.findElement("Marco"), null);
		ht.insert("Marco", "Morazan"); ht.insert("Nick", "Olson");
		ht.insert("Jean Luc", "Picard"); ht.insert("Kathryn", "Janeway");
		assertEquals(ht.size().intValue(), 4);
		assertEquals(ht.isEmpty(), false);
		assertEquals(ht.findElement("Marco"), "Morazan");
		assertEquals(ht.findElement("Cathryn"), null);
		assertEquals(ht.findElement("Kathryn"), "Janeway");
		ht.delete("Kathryn");
		assertEquals(ht.findElement("Kathryn"), null);
		Iterator<String> klooper = ht.keys();
		Iterator<String> elooper = ht.elements();
		String res = "";
		while (klooper.hasNext())
		{ res = res + " " + klooper.next() + " " + elooper.next(); }
		assertEquals(res, " Jean Luc Picard Nick Olson Marco Morazan");
		}
	@Test
	void Test2() {
		assertEquals(ht.size().intValue(), 0); assertEquals(ht.isEmpty(), true);
		assertEquals(ht.findElement("Marco"), null);
		
		ht.insert("Vettel", "Sebastian");
		ht.insert("Raikkonin", "Kimi");
		ht.insert("Ricciardo", "Daniel");
		ht.insert("Verstappen", "Max");
		ht.insert("Hamilton", "Lewis");
		ht.insert("Alonso", "Mclaren");
		
		assertEquals(ht.findElement("Vettel"),"Sebastian");
		assertEquals(ht.findElement("Raikkonin"),"Kimi");
		assertEquals(ht.findElement("Ricciardo"),"Daniel");
		assertEquals(ht.findElement("Bottas"),null);
		
	}
	
	@Test 
	public void testCollisionCounter()
	{
		HashComparator<String> scomp = new StringComparator();
		LPHash<String, String> ht = new LPHash<String, String>(101, scomp);
		
		String[] keys = {"a","a","a","a","a"};
		String[] elems = {"b","b","b","b","b"};
		
		int i = 0;
		for(i = 0; i < keys.length; i++)
		{
			ht.insert(keys[i], elems[i]);
		}
		assertEquals(ht.collisionCount(),10);
	}
}	
