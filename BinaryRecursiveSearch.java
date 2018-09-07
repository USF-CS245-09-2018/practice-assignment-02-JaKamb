public class BinaryRecursiveSearch implements Practice2Search{
	public static void main(String args[]){

	}
	public String searchName(){
		return "Binary Recursive Search";
	}
	public int search(int [] arr, int target){
		int low = 0, high = arr.length - 1;
		int mid = low + (high-low)/2;
		if(arr[mid] == target){
			return mid;
		}
		else if(arr[mid] > target){
			return search(java.util.Arrays.copyOfRange(arr, low, mid), target);
		}
		return search(java.util.Arrays.copyOfRange(arr, mid, high), target);
	}
}