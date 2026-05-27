public String right2(String str) {
  char[] chars=str.toCharArray();
  StringBuilder sb = new StringBuilder();
  int rotateCount=1;
  while(rotateCount<3){
    char last=chars[chars.length-1];
    for(int i=chars.length-1; i>0; i--){
      chars[i]=chars[i-1];
    }
    chars[0]=last;
    rotateCount++;
  }
  
  for(int i=0; i<chars.length; i++)
   sb.append(chars[i]);
   
  str=sb.toString();
  return str;
}
