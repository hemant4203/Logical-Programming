public int[] makeMiddle(int[] nums) {
  int[] arr = new int[2];
  if(nums.length<3) {
    for(int i=0; i<arr.length; i++)
     arr[i]=nums[i];
  }
  
  int midle = nums.length/2;
  arr[0]=nums[midle-1];
  arr[1]=nums[midle];
  return arr;
}
