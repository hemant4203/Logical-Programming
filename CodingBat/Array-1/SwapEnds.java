public int[] swapEnds(int[] nums) {
  int first=0;
  int last=nums.length-1;
  
  int temp=nums[first];
  nums[first]=nums[last];
  nums[last]=temp;
  
  return nums;
}
