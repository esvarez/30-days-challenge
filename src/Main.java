public class Main {
    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{1,3,1,-1,3}));
    }

    // Use XOR operator to remove duplicates
    private static int singleNumber(int[] nums){
        int num = nums[0];
        for (int x = 1; x < nums.length; x++) {
            num ^= nums[x];
        }
        return num;
    }
}
