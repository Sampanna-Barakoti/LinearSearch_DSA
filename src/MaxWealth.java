public class MaxWealth {
    public static void main(String[] args) {
        int[][]arr={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(maxWealth(arr));
    }

    static int maxWealth(int[][]accounts){
        //person=row
        //account=col
        int ans=Integer.MIN_VALUE;
        for(int person=0;person< accounts.length;person++ ){
            int sum=0;
            for (int account = 0; account <accounts[person].length ; account++) {
                sum+=accounts[person][account];
            }
            if(ans<sum){
                ans=sum;
            }
        }
        return ans;
    }
}
