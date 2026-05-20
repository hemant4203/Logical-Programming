public int maxTriple(int[] nums) {
  if(nums.length==1)
   return nums[0];
  
  int midle=nums.length/2;
  
  int large=Math.max(nums[0],nums[nums.length-1]);
  int max=Math.max(large,nums[midle]);
  
  return max;
}
