public int[] makeEnds(int[] nums) {
  int[] newNums = new int[2];
  newNums[0]=nums[0];
  newNums[1]=nums[nums.length-1];
  
  return newNums;
}
