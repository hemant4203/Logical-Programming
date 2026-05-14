public int[] reverse3(int[] nums) {
  int first=0;
  int last=nums.length-1;
  while(first<last){
    int temp=nums[last];
    nums[last]=nums[first];
    nums[first]=temp;
    
    first++;
    last--;
  }
  return nums;
}
