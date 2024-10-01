package assignment2;

public class Assignment1_2 {
	 public static int remove(int[] arr) {
	        if (arr.length == 0) {
	            return 0;
	        }
	        
	        int uniq = 1;
	        for (int i = 1; i < arr.length; i++) {
	            // Check if the current element is different from the last unique element
	            if (arr[i] != arr[uniq - 1]) {
	                arr[uniq] = arr[i]; // Update the unique index position
	                uniq++; // Move the unique index forward
	            }
	        }

	        return uniq; // The new length of the array
	    }
	
	
	    public static void main(String[] args) {
	        int[] sortedarr = {1,1,2};
	        int newLength = remove(sortedarr);

	        System.out.println("New length: " + newLength);
	    }
}
