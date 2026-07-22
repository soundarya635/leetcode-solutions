class Solution {
    List<List<Integer>> res;

    public List<List<Integer>> threeSum(int[] nums) {
        res = new ArrayList<>();
        Arrays.sort(nums);

        int sum = 0;
        for (int left = 0; left < nums.length - 2; left++) {
            if(left != 0 && nums[left] == nums[left - 1])
                continue;
            int l = left + 1, r = nums.length - 1;
            while (l < r) {
                sum = nums[left] + nums[l] + nums[r];
                if (sum == 0) {
                    res.add(new ArrayList<>(Arrays.asList(nums[left], nums[l], nums[r])));
                    l++;
                    r--;
                    while (l<r && nums[r] == nums[r + 1])
                        r--;

                    while (l < r && nums[l] == nums[l - 1])
                        l++;
                }

                if (sum > 0)
                    r--;

                else if (sum < 0)
                    l++;

            }
        }
        return res;
    }
}