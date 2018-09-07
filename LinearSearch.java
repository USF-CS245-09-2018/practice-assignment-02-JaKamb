public class LinearSearch implements Practice2Search{
	public static void main(String args[]){
		LinearSearch yo = new LinearSearch();
		int[] arr = new int[]{1,5,3,1,6,7,4,3,2,34,123,0};
		System.out.println(yo.search(arr, 123));
	}
	public LinearSearch(){}
	public String searchName(){
		return "Linear Search";
	}
	public int search(int[] arr, int target){
		for(int i = 0;i < arr.length; i++){
			if(arr[i] == target){
				return i;
			}
		}
		return -1;
	}
}