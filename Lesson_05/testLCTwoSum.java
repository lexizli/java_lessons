package Lesson_05;


public class testLCTwoSum {

    
        public static void main(String[] args) {
            System.out.print("\033[H\033[J");
            int[] testArr = {3,2,4};

            System.out.println(arrayToString(twoSum(testArr, 6)));
    
        }
            public static int[] twoSum(int[] nums, int target) {
                int[] res = new int[2];
                int step = 1;
                for(int i=0;i<nums.length;)
                {
                    if(step >= nums.length)
                    break;
                    if(step + i >= nums.length)
                    {
                        step++;
                        i=0;
                        continue;
                    }
                    else if(nums[i] + nums[step + i] == target)
                    {
                        res[0] = i;res[1] = i + step;
                        break;
                    }
                    i++;
                }
                return res;
            }
        
/*
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int first = 0;
        int second = 0;
        int firstIndex = -1;
        int secondIndex = -1;
        int sumOf = 0;
        for(int i = 0; i < nums.length; i++){
            first = nums[i];
            for(int j = i+1; j < nums.length; j++) {
                sumOf = first + nums[j];
                if (sumOf == target) {
                    firstIndex = i;
                    second = nums[j];
                    secondIndex = j;
                    break;
                }
            }
            if (sumOf == target) {
                break;
            }
        }
        result[0] = firstIndex;
        result[1] = secondIndex;
        return result;
        
    }
*/
        // collect array in string for output
        public static String arrayToString(int[] myArray) {

            String outArray = new String();
            outArray = "\t";
            int border = myArray.length;
            for (int i = 0; i < border; i++) {
                outArray += (Integer.toString(myArray[i]) + "  ");
            }
            return outArray;
    
        }
    
}
