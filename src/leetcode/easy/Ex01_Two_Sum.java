package leetcode.easy;

public class Ex01_Two_Sum {

	public static void main(String[] args) {
		int[]nums={3,3};
		
		Ex01_Two_Sum.twoSum(nums, 6);

	}

	public static int[] twoSum(int[] nums, int target) {
		int answer[]=new int[2];
		int n1=0,n2=0;
		int position=0;
		for(int i=0;i<nums.length;i++) {
			n1=nums[i];
			for(int y=i+1;y<nums.length;y++) {
				n2=nums[y];
				if(n1+n2==target) {
					answer[0]=i;
					answer[1]=y;
					return answer;
				}
			}
		}
		
		
		return null;
	}

}
