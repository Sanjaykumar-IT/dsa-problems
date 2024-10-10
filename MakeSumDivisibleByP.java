import java.util.HashMap;

class MakeSumDivisibleByP {
    public int minSubarray(int[] nums, int p) {
        HashMap<Integer, Integer> map = new HashMap<>();
        long sum = 0;  
        for(int x : nums){
            sum += x;
        }

        int target = (int)(sum % p); 
        if (target == 0) {
            return 0;
        }

        long curr = 0;  
        map.put(0, -1);

        int min_length = nums.length;

        for (int i = 0; i < nums.length; i++) {
            curr = (curr + nums[i]) % p;

            int prev = (int)((curr - target + p) % p);

            if (map.containsKey(prev)) {
                min_length = Math.min(min_length, i - map.get(prev));
            }
            map.put((int)curr, i);
        }

        return min_length == nums.length ? -1 : min_length;
    }

    public static void main(String[] args) {
        MakeSumDivisibleByP solution = new MakeSumDivisibleByP();
        
        int[] nums = {3, 1, 4, 2};
        int p = 6;
        
        int result = solution.minSubarray(nums, p);
        System.out.println("Minimum subarray length to make sum divisible by " + p + " is: " + result);
    }
}

