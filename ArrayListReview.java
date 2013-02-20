import java.util.*;
public class ArrayListReview{
	public static void main(String[] args){
		new ArrayListReview(4);
	}
	public int size;
	public int[] arrayCollection;
	public ArrayListReview(int y){
		arrayCollection = new int[y];
		size = 0;
		add(3);
		add(4);
		add(5);
		add(7);
		sizeReturn();
		get(0);
		setValue(0,6);
		remove(1);
		System.out.println(arrayCollection[3]);
	}
	
	public void sizeReturn(){
		System.out.println("The size of the collection is "+ size);
	}
	public void add(int element){
		arrayCollection[size] = element;
		size = size + 1;
		System.out.println("You have just added an element to the array!");
	}
	public void get(int b){
		System.out.println("The value of the index you got is "+ arrayCollection[b]);
	}
	public void setValue(int i, int v){
		arrayCollection[i] = v;
		System.out.println("you have just updated one of the elements in the array at index "+i+" to " + arrayCollection[i]);
	}
	public void remove(int c){
		for(int i = c; i < arrayCollection.length - 1 ; i++){
			arrayCollection[i] = arrayCollection[i+1];
			/*if(c == arrayCollection.length){
				return;
			}else{
				arrayCollection[c] = arrayCollection[c+1];
				//arrayCollection[c+1] = null;
			}*/
		}
		size = size - 1; 
		System.out.println("you have just removed the value at index "+ c +" The array now consists of "+ arrayCollection.length+" index values");
		//c++;
	}
}