public class SearchInRange {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6,7,8,9,11,22,33,44};
        int target=46;
        boolean ans=linearSearch(arr,target,1,6);
        System.out.println(ans);
    }

    static boolean linearSearch(int [] arr , int target,int start,int end){

        if(arr.length==0){
            return false;
        }

        for (int i = start; i <end ; i++) {
            if(arr[i]==target){
                return true;
            }
        }

        return false;
    }
}

