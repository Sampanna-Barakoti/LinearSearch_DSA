public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][]arr={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int target=5;
        System.out.println(Search(arr,target));
    }
    static int Search(int[][]arr, int target){
        for (int row = 0; row <arr.length; row++) {
            for (int col = 0; col <arr[row].length ; col++) {
                if (arr[row][col]==target){
                    return arr[row][col];
                }
            }
        }
        return -1;
    }

}
