package com.example.javatester;

public class ArraySearcher {


    /**
     *
     * @param nums
     * @param toCheck
     * @return true if array contains [1,2,3] anywhere
     */
    public boolean a123(int[] nums, int[] toCheck) {


        final int checkLen = toCheck.length;
        for (int i = checkLen - 1; i < nums.length; i++) {
            boolean found = true;
            for (int j = 0; j < checkLen; j++) {
                if (nums[i - j] != toCheck[checkLen - j - 1]) {
                    found = false;
                    break;
                }
            }
            // return true; This would return true if a) we found a mismatch, or b) we didn't
            if (found) {
                return true;
            }
        }
        return false;
    }


    public boolean lookFor123(int[] nums) {
        int[] toCheck = new int[] {1,2,3};

        for (int i = 0; i < nums.length; i++) {
            boolean found = true;
            for (int j = 0; j < 3; j++) {
                if (nums[i + j] != toCheck[j]) {
                    found = false;
                    //break;
                }
            }
            if (found) {
                return true;
            }
        }
        return false;

    }

}
