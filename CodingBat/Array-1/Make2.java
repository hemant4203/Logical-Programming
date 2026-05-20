public int[] make2(int[] a, int[] b) {
  int j=0;
  int[] arr = new int[2];
  for(int i=0; i<a.length; i++){
    arr[j]=a[i];
    j++;
    if(j==arr.length)
     return arr;
  }
  
  
  for(int i=0; i<b.length; i++){
    arr[j]=b[i];
    if(j==arr.length-1)
     break;
    j++;
  }
  
  return arr;
}
