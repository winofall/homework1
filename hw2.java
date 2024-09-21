public class hw2 {
    public static void main(String[] args) {
        int[][] arr={{1, -2, 3, 5, -1},{1, -2, 3, -8, 5, 1},{1, -2, 3,-2, 5, 1}};
        for(int i=0;i<arr.length;i++) {
            int n=arr[i].length;
            int []ins=new int[n+1];
            ins[0]=0;
            for(int j=1;j<=n;j++) {
                ins[j]=ins[j-1]+arr[i][j-1];
            }
            int maxis=0;
            for(int j=1;j<=n;j++) {
                for(int k=j;k<=n;k++) {
                    int l=ins[k]-ins[j-1];
                    if(l>maxis) {
                        maxis=l;
                    }
                }
            }
            System.out.println("第 "+(i+1)+" 个最大和是"+maxis);
        }
    }
}
