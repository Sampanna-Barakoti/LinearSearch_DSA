public class FindMInNumberInArray {
    public static void main(String[] args) {
        int[] arr={5,3,6,2,5,27,6,1};
        System.out.println(minNum(arr));
    }

    static int minNum(int[]arr){
        int min=arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if (min>arr[i]){
                min=arr[i];
            }
        }
        return min;
    }

}
