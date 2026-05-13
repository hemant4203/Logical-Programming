public boolean in3050(int a, int b) {
  boolean isinFirstRange = ((a>=30 && a<=40) && (b>=30 && b<=40));
  boolean isinSecondRange = ((a>=40 && a<=50) && (b>=40 && b<=50));
  
  if(isinFirstRange || isinSecondRange)
   return true;
  return false;
}
