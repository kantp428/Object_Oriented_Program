package Lab8_2;

import java.util.Iterator;

public class Program {
	public static void main(String[] args) {
		Containers c = new Containers() {	
			String[] names = {"John","May","Ryan"};
			@Override
			public Iterator getIterator() {
				return new Iterator() {
					int index=0;
					public boolean hasNext() {
						if(index < names.length)
							return true;
						return false;
					}
					public Object next() {
						return names[index++];
					}
				};
			}
		};
		
		
		//NameRepository namesRepository = new NameRepository();
		
		for(Iterator iter = c.getIterator(); iter.hasNext(); ) {
			String name = (String) iter.next();
			System.out.println("Name: "+name);
		}
	}
}
