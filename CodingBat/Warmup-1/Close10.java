public int close10(int a, int b) {
  int n = Math.abs(10-a);
  int m = Math.abs(10-b);
  
  if(n==m)
   return 0;
  if(n<m)
   return a;
  return b;
}
