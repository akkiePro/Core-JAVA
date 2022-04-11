import java.util.*;

class Iteratorr{
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(12);
    	arr.add(8);
	    arr.add(2);
    	arr.add(23);

    	Iterator<Integer> it = arr.iterator();

    	System.out.println("all members...");

    	while(it.hasNext()){
    		System.out.println(it.next());
    	}

    	System.out.println("\nmembers which are greater than 10...");

    	while(it.hasNext()) {				//PROBLEM!!!!!!!!!!!
      		Integer i = it.next();
      		if(i < 10) {
        		it.remove();				//NOT REMOVED!!!!!!!
      		}
    	}
    	System.out.println(arr);
	}
}