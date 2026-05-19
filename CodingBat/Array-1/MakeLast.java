public int[] makeLast(int[] nums) {
  int newLength = nums.length * 2;
  int lastElement = nums[nums.length-1];
  
  int[] newNums = new int[newLength];
  
  newNums[newLength-1] = lastElement;
  
  return newNums;
}
