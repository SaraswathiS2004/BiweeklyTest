package org.example.biweeklytest3;


public class SumOfCloset {

    public static int findClosetNumber(int [] nums , int target){
        sort(nums);
        int sumofThreeInteger = nums[0] + nums[1] + nums[2];
        for(int i = 0; i<= nums.length - 2; i++){
            int left = i + 1;
            int right = nums.length -1;
            while(left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                int differ1 = Math.abs(sum - target);
                int differ2 = Math.abs(sumofThreeInteger - target);
                if (differ1 < differ2) sumofThreeInteger = sum;
                else if (sum > target) right--;
                else left++;
            }
        }
        return sumofThreeInteger;
    }
    public static void sort(int [] nums){

        for(int i = 0; i< nums.length; i++){
            for(int j = i; j>0; j--){
                int temp = nums[j];
                if(nums[j] < nums[j -1]){
                    nums[j] = nums[j-1];
                    nums[j -1] = temp;
                }
            }
        }
    }

    public static void main(String[] args){
        int [] arr1  ={-1,2,1,-4};
        int target1 = 1;
        int [] arr2 = {0,0,0};
        int target2 = 1;
        System.out.println(findClosetNumber(arr1 , target1)); // output : 2
        System.out.println(findClosetNumber(arr2 , target2));//putput : 0
    }
}
