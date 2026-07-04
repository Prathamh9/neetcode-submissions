class Solution {
    private void sort(int []arr){
      HashMap<Integer,Integer> mapn=new HashMap<>();
      int minval=arr[0],maxval=arr[0];
      for(int i=0;i<arr.length;i++){
        minval=Math.min(arr[i],minval);
        maxval=Math.max(arr[i],maxval);
        mapn.put(arr[i],mapn.getOrDefault(arr[i],0)+1);
      }
      int index=0;
      for(int i=minval;i<=maxval;i++){
        while(mapn.getOrDefault(i,0)>0){
        arr[index]=i;
        index ++;
        mapn.put(i,mapn.get(i)-1);
        }
      }
    }
    public int[] sortArray(int[] nums) {
      sort(nums);
      return nums;
    }
}