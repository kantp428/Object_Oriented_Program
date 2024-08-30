//package Lab8_2;
//
//import java.util.Iterator;
//
//public class NameRepository implements Containers{
//	
//	String[] names = {"John","May","Ryan"};
//	
//	@Override
//	public Iterator getIterator() {
//		// TODO Auto-generated method stub
//		return new Iterator() {
//			int index=0;
//			public boolean hasNext() {
//				if(index < names.length)
//					return true;
//				return false;
//			}
//			public Object next() {
//				return names[index++];
//			}
//		};
//	}
	
//	private class NameInterator implements Iterator{
//		
//		int index=0;
//		public boolean hasNext() {
//			if(index < names.length)
//				return true;
//			return false;
//		}
//		public Object next() {
//			return names[index++];
//		}
//		
//		public void remove() {
//			
//		}
//	}

//}
