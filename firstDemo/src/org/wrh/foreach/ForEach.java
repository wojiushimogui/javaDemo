package org.wrh.foreach;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class ForEach {

	enum Face {one ,two,three,four,five,six,seven ,nine,ten};
	enum Num {one ,two,three,four,five,six};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<Num>nums=Arrays.asList(Num.values());
		Collection<Face> faces=Arrays.asList(Face.values());
		
		for (Iterator iterator1 = nums.iterator(); iterator1.hasNext();) {
			//Face face1=(Face)iterator1.next();
			for (Iterator iterator2 = faces.iterator(); iterator2.hasNext();)
			System.out.println(iterator1.next()+"   "+iterator2.next());
				//System.out.println(face1+"   "+iterator2.next());
			
		}
		

	}

}
