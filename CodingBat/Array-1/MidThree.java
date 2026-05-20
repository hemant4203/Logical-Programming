public int[] midThree(int[] nums) {
  int[] arr = new int[3];
  
  if(nums.length<4){
    for(int i=0; i<nums.length; i++)
     arr[i]=nums[i];
  }
  
  int midle=nums.length/2;
  
  arr[0]=nums[midle-1];
  arr[1]=nums[midle];
  arr[2]=nums[midle+1];
  
  return arr;
}
