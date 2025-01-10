public class unique
{
    public static void main(String[] args) {
        int []arr={2,2,5,2,7,7,8,7,8,8};

        System.out.println(findUnique(arr));
    }
    static int findUnique(int[] arr) {
        int result = 0;

        // Iterate over every bit position
        for (int i = 0; i < 32; i++) {
            int bitSum = 0;

            // Count the number of 1s at the ith bit position
            for (int num : arr) {
                if ((num & (1 << i)) != 0) {
                    bitSum++;
                }
            }

            // If bitSum is not a multiple of 3, this bit belongs to the unique number
            if (bitSum % 3 != 0) {
                result =result| (1 << i);
            }
        }

        return result;
    }

}
