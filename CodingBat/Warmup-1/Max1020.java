public int max1020(int a, int b) {
  boolean isAinRange=(a>=10 && a<=20);
  boolean isBinRange=(b>=10 && b<=20);
  
  if(isAinRange && isBinRange )
   return (a>b)?a:b;
  if(isAinRange)
   return a;
  if(isBinRange)
   return b;
  return 0;
}
