import java.util.Arrays;

public class triangle {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		ConstructTriangle(arr);
	}

	static void ConstructTriangle(int[] arr) {
		if (arr.length < 1) {
			return;
		}
		int[] num = new int[arr.length - 1];
		for (int i = 0; i < arr.length - 1; i++) {
			int x = arr[i] + arr[i + 1];
			num[i] = x;
		}
		ConstructTriangle(num);
		System.out.println(Arrays.toString(arr));

	}
}
