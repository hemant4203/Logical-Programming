public int[] frontPiece(int[] nums) {
  int[] arr = new int[2];
  if(nums.length>2){
    for(int i=0; i<2; i++)
     arr[i]=nums[i];
    return arr;
  }
  
  return nums;
}
