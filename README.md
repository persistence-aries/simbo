//simbo


import java.util.HashMap;
import java.util.Map;

public class Simbo {
	public static int[] simboSum(int[] nums, int target) {
		int[] result = new int[2];
		Map<Integer, Integer> map = new HashMap();	 
		for(int i=0;i<nums.length;i++) {
			 if(map.containsKey(target - nums[i])) {
				 result[0] = target - nums[i];
				 result[1] = nums[i];
			 }
			 map.put(nums[i], i);
		}
		return result;
	}
	
	
	public static void main(String[] args) {
		//測試
		int target = 13;
		int[] a = new int[5];
		a[0]=1;
		a[1]=4;
		a[2]=7;
		a[3]=23;
		a[4]=9;
		int[] re2 = simboSum(a,target);
		System.out.println("("+re2[0]+", "+re2[1]+")");
	}
	
	 

}