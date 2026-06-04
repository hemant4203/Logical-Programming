public String lastTwo(String str) {
  if(str.length()<2) return str;
  String body = str.substring(0,str.length()-2);
  char first = str.charAt(str.length()-1);
  char last = str.charAt(str.length()-2);
  return body+first+last;
}
