public int[] biggerTwo(int[] a, int[] b) {
  int sumA=0;
  int sumB=0;
  for(int val:a)
   sumA +=val;
  for(int val:b)
   sumB +=val;
  if(sumA>sumB)
   return a;
  if(sumB>sumA)
   return b;
  return a;
}
