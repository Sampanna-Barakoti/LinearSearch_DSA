//finding element whether it exist in the array or not

public class Linear_search_1 {
    public static void main(String[] args) {
    int[]arr={1,2,3,4,5,6,7,8,9,11,22,33,44};
    int target=4;
    int ans=linearSearch(arr,target);
    System.out.println(ans);
    int ans2=linearSearch(arr,target);
    System.out.println(ans2);

    }

    static int linearSearch2(int [] arr , int target){
        //if array is empty
        if(arr.length==0){
            return 0;
        }
        //if not empty
       for(int ele: arr){
           if (ele==target){
               return ele;
           }
        }
//if item not matched
        return -1;
    }

    //searching for the index
    static int linearSearch(int [] arr , int target){
        //if array is empty
        if(arr.length==0){
            return 0;
        }
    //if not empty
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==target){
                return i;
            }
        }
//if item not matched
        return -1;
    }
}
