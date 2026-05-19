public int start1(int[] a, int[] b) {
  int firstElementCount=0;
  if(a.length>=1 && a[0]==1)
   firstElementCount++;
  if(b.length>=1 && b[0]==1) 
   firstElementCount++;
  return firstElementCount;
}
