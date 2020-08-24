public class LoopX2 {

    public static void main(String[] args) {
        int[] nums = {5,17,24,5,8,-3,28 };
        int min = nums[0];
        int max = nums[0];
        float sum = 0f;




        for (int i = 0; i<nums.length; i++)
        {
            if (nums[i] > max)
            {
                max = nums[i];

            }
            if (nums[i] < min)
            {
                min = nums[i];

            }
            sum += nums[i];



        }

        System.out.println("max= " + max);
        System.out.println("min=" + min);
        System.out.println("average is " + sum/ nums.length);





    }
}
