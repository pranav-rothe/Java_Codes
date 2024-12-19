package array;

public class MissingNumberArray {

	int total;
	int arr[]= {10,20,30,50};

	public void missingNumber() {
		total=arr.length+1;//
		System.out.println("Total length of array is: "+total);
		int expected_total=total*(total+1)/2;
		int actual_sum=0;

		for(int i: arr) {
			actual_sum+=i;
		}
		System.out.println("Missing number of given array is: "+expected_total+" - "+actual_sum+" = " +(expected_total-actual_sum));
	}

	public static void main(String[] args) {

		MissingNumberArray m=new MissingNumberArray();
		m.missingNumber();
	}

}
