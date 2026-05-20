public int[] front11(int[] a, int[] b) {
  int length=0;
  if(a.length>0)
   length++;
  if(b.length>0)
   length++;
  int[] arr = new int[length];
  int i=0;
  if(a.length>0){
   arr[i]=a[0];
   i++;
  }
  if(b.length>0)
   arr[i]=b[0];
  return arr;
}
