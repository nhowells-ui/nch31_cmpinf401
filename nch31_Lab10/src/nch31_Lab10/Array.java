package nch31_Lab10;

public class Array {

	public static void main(String[] args) {
		printArrayElements(null, 0);
	}

	public static void printArrayElements(int a[], int size){
	    if(size == 1){
	        System.out.println(a[size-1]);
	    }
	    else{
	        printArrayElements(a,size-1);
	        System.out.println(a[size-1]);
	    }
	}
}
