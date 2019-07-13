import java.util.Scanner;

public class InsertionDeletion {
	public static void insertionDeletion(int[] arr, int index, int choice, Scanner t) {
		if (choice == 0) {
			System.out.println("Enter value to be inserted:");
			int val = t.nextInt();
			for (int i = arr.length-2; i>=index; i--) {
				
				arr[i + 1] = arr[i];
				
			}

			arr[index] = val;
		}

		else {
			if (choice == 1) {
				for (int i = index; i < arr.length - 1; i++) {
					arr[i] = arr[i + 1];
				}
			} else
				System.out.println("Invalid input of choice");
		}
	}

	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size = s.nextInt();
		int inputArray[] = new int[size];
		for (int i = 0; i < size-1; i++) {
			System.out.println("Enter " + i + " Element");
			inputArray[i] = s.nextInt();

		}
		return inputArray;

	}

	public static void print(int[] input) {
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}

	}

	public static void main(String[] args) {
		int arr[] = takeInput();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter choice");
		int choice = s.nextInt();
		System.out.println("Enter index");
		int index = s.nextInt();
		insertionDeletion(arr, index, choice, s);
		print(arr);

	}
}
