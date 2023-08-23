public class VarArgsChallenges {

    // 1. Maximum of numbers using varargs

    static void MaxOfNums(int...nums){
        int max = nums[0];
        for(int num:nums){
            if (num > max) {
                max = num;
            }
        }
        System.out.println(max);
    }
    // 2. Sum of all elements using varargs
    static void SumOfNums(int...nums){
        int sum = 0;

        for(int x:nums){
            sum+=x;
        }
        System.out.println(sum);
    }
    // 3. Calculate Discount using varargs
    static void TotalWithDiscount(double discount, double...nums){
        double sum = 0;

        for(double x:nums){
            sum+=x;
        }
        double total = discount*sum;
        double discountAmt = sum-total;
        System.out.printf("%.2f", discountAmt);

    }
    public static void main(String[] args) {
        MaxOfNums(3,4,5,6);
        SumOfNums(3,4,5,6);
        TotalWithDiscount(.45, 23.3, 23.54, 90.23);
    }
}
