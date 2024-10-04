public class insertandsort1{
	public static void main(String[] args){
		int arr[] = {10,12,45,90};
		int arr1[] = new int[arr.length+1];
		for(int j = 0;j < arr.length;j++){
			arr1[j] = arr[j];
		}
		arr1[arr.length] = 23;
		int temp = arr1[0];
		for (int i = 0; i<arr1.length ; i++ ) {
			for (int j = i+1 ; j<arr1.length ; j++) {
				if (arr1[i] > arr1[j]) {
					temp = arr1[j];
					arr1[j] = arr1[i];
					arr1[i] = temp;
				}
			}
		}
		arr = arr1;
		for (int f = 0; f < arr.length; f++ ) {
			System.out.print(arr[f]+" ");
		}
	}
}