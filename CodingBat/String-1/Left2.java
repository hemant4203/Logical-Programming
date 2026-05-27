public String left2(String str) {
  StringBuilder sb = new StringBuilder();
  char[] chars=str.toCharArray();
  int rotateCount=1;
  while(rotateCount<3){
    char first = chars[0];
    for(int i=0; i<chars.length-1;i++){
      chars[i]=chars[i+1];
    }
    chars[chars.length-1]=first;
    rotateCount++;
  }
  for(int i=0; i<chars.length; i++)
   sb.append(chars[i]);
  
  str=sb.toString();
  return str;
}
