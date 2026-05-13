public boolean stringE(String str) {
  int ecount = 0;
  for(int i=0;i<str.length();i++){
    if(str.charAt(i)=='e')
     ecount++;
  }
  
  return (ecount<=3 && ecount>0);
}
