public boolean unlucky1(int[] nums) {
  boolean isUnlucky1 = false;
  for(int i=0; i<nums.length-1; i++){
    if((i==0 || i==1) || (i==nums.length-2 || i==nums.length-1)) {
      if(nums[i]==1 && nums[i+1]==3)
       isUnlucky1=true;
    }
  }
  return isUnlucky1;
}
