public class BinaryIterativeSearch implements Practice2Search{
	public static void main(String args[]){

	}
	public String searchName(){
		return "Binary Iterative Search";
	}
	public int search(int [] arr, int target){
		int low = 0, high = arr.length - 1; 
        while (low <= high) 
        { 
            int mid = low + (high-low)/2; 
            if (arr[mid] == target){
                return mid;
            }
            if (arr[mid] < target){
                low = mid + 1;
            }
            else{
                high = mid - 1; 
            }
        }
        return -1;
	}
}