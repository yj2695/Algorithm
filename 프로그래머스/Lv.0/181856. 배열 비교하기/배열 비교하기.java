class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int r1 = 0;
        int r2 = 0;

        if(arr1.length == arr2.length){
            for(int i=0; i<arr1.length; i++){
                r1 += arr1[i];
                r2 += arr2[i];
            }
        }
        else{
            r1 = arr1.length;
            r2 = arr2.length;
        }

        return r1==r2? 0 : r1>r2? 1:-1;
    }
}