public String middleTwo(String str) {
  if(str.length()==2)
   return str;
  int middle = (str.length()/2)-1;
  return str.substring(middle,middle+2);
}
