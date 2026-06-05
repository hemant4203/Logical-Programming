public String withoutX2(String str) {
  if(str.length()>1 && (str.charAt(0)=='x' && str.charAt(1)=='x')) 
   return str.substring(2);
  if(str.length()>0 && str.charAt(0)=='x')
   return str.substring(1);
  if(str.length()>2 && str.charAt(1)=='x')
   return str.charAt(0)+str.substring(2);
  return str;
}
