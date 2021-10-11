package ru.dataart.academy.java;

public class TwoSums {
    /**
     * @param nums   - sorted in ascending order array of integer values >=0
     * @param target - integer value >= 0
     * @return - array of two numbers from nums which sum equals to target
     * Example: nums = [1, 4, 6, 7, 10], target = 10
     * Result - [4, 6]
     * Example: nums = [1, 4, 6, 7, 10], target = 2
     * Result - []
     */
    public int[] getTwoSum(int[] nums, int target) {
        if (nums.length < 2) {
            return new int[0];
        }
        int rightPointer = nums.length - 1;
        int leftPointer = 0;
        while(leftPointer != rightPointer) {
            int result = nums[leftPointer] + nums[rightPointer];
            if (result == target) {
                return new int[] {nums[leftPointer],nums[rightPointer]};
            }
            if (result > target) {
                rightPointer--;
            }
            if (result < target) {
                leftPointer++;
            }
        }
        return new int[0];
    }
}
