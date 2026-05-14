public int sum2(int[] nums) {
  int sum=0;
  if(nums.length<3){
    for(int val:nums)
     sum += val;
    return sum;
  }
  
  if(nums.length>2){
    sum = nums[0]+nums[1];
    return sum;
  }
  return 0;
}
