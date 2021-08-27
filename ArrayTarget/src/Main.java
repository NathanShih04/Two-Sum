import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> array = new ArrayList<Integer>();
		System.out.println("Input target: ");
		int target = scan.nextInt();
		System.out.println("Input one array number. Input 000 to finish: ");
		int num = scan.nextInt();
		while(num != 000) {
			array.add(num);
			System.out.println("Input one array number. Input 000 to finish: ");
			num = scan.nextInt();
		}
			System.out.println(twoSum(array, target));
		
	}
	
	public static ArrayList<String> twoSum(ArrayList<Integer> array, int target) {
		ArrayList<String> ans = new ArrayList<String>();
		for (int i = 0; i < array.size(); i++) {
			for (int j = 0; j < array.size(); j++) {
				if(array.get(i) + array.get(j) == target) {
					ans.add("[" + array.get(i) + ", " + array.get(j) + "]");
				}
			}
		}
		return ans;
	}
	
}
