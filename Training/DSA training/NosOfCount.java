public class NosOfCount {
    public static void main(String[] args) {
        int[] arr={5,3,2,7,8,5,7,2,8,5,7,7,8,3,5,2,7,2};
        int[] a= {0,0,0,0,0,0,0,0,0};
        //System.out.println(arr.length);
        for(int i =0 ;i<arr.length;i++){
                    a[arr[i]-1]++;
        }
        for (int i=0;i<9;i++){
            if(a[i]!=0)
            System.out.println("The Frequency of "+i+ " is "+a[i]);
        }
    }
}
