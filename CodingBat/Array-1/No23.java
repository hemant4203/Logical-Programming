public boolean no23(int[] nums) {
  boolean isContain2 = (nums[0]==2 || nums[1]==2);
  boolean isContain3 = (nums[0]==3 || nums[1]==3);
  
  if(!isContain2 && !isContain3)
   return true;
  return false;
}
