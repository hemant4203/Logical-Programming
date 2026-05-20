public int[] plusTwo(int[] a, int[] b) {
  int[] arr = new int[4];
  
  for(int i=0; i<a.length; i++)
   arr[i]=a[i];
  for(int i=0; i<b.length; i++)
   arr[i+2]=b[i];
  return arr;
}
