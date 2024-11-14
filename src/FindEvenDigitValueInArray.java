public class FindEvenDigitValueInArray {
    public static void main(String[] args) {
int[]arr={1,11,111,1111,11111,11111};
        System.out.println(findNumber(arr));
        System.out.println(countNum(-1234));
        System.out.println(countNum2(1234));
    }

// function to find even digits num
    static int findNumber(int[]arr){
        int count=0;
        for (int num: arr){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
//function to find even num
    private static boolean even(int num) {
//        if (countNum(num)%2==0){
//            return true;
//        }
//        return false;
        return countNum(num)%2==0;
    }
    //function to count digit of a number
    static int countNum(int num){
        int count=0;
        if(num<0){
            num=num*-1;
        }
        while (num>0){
            count++;
            num/=10;
        }
        return count;
    }
    //fast function to count digit of a number
    static int countNum2(int num){
        if(num<0){
            num=num*-1;
        }
        return (int)(Math.log10(num))+1;
    }
}
