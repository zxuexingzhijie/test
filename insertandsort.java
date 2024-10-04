public class insertandsort{
	public static void main(String[] args){
		int arr[] = {10,12,45,90};
		int arr1[] = new int[arr.length+1];
		for (int i = 0; i <arr.length ; i++) {
			arr1[i] = arr[i];
		}


		int insert = 23;
		int index = 0;
		for (int f = 0; f<arr1.length ;f++ ) {
			if(insert < arr1[f]){
				index = f;
				break;
			}
		}
		for (int j = arr1.length-1; j > index ; j-- ) {
			arr1[j] = arr[j-1];
		}
		arr1[index] = insert;
		arr = arr1;
		for (int j = 0; j < arr1.length ; j++) {
			System.out.print(arr[j] + " ");
		}
	}
}