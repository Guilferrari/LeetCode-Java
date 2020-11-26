
//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//
//        You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//        You can return the answer in any order.
//
//
//
//        Example 1:
//
//        Input: nums = [2,7,11,15], target = 9
//        Output: [0,1]
//        Output: Because nums[0] + nums[1] == 9, we return [0, 1].
//        Example 2:
//
//        Input: nums = [3,2,4], target = 6
//        Output: [1,2]
//        Example 3:
//
//        Input: nums = [3,3], target = 6
//        Output: [0,1]

// ==============================================================================
package com.company;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int x = i + 1; x < nums.length; x++) {
                if (nums[x] == target - nums[i]) {
                    return new int[] { i, x };
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}


//==============================================================
// full problem

//public class TwoSum {
//
//    public static void main(String[] args) {
//        int[] nums = new int[]{2, 7, 11, 15};
//        int target = 26;
//        int[] result = twoSum(nums, target);
//        System.out.println(result[0] + " " + result[1]);
//    }
//
//    public static int[] twoSum(int[] nums, int target) {
//        for (int i = 0; i < nums.length; i++) {
//            for (int x = i + 1; x < nums.length; x++) {
//                if (nums[x] == target - nums[i]) {
//                    return new int[] { i, x };
//                }
//
//            }
//        }
//
//        throw new IllegalArgumentException("No two sum solution");
//    }
//}


