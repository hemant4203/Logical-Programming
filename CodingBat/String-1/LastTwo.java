public String lastTwo(String str) {
  if(str.length()<2) return str;
  if(str.length() == 2){
    String first = str.substring(0,1);
    String last = str.substring(1);
    return last+first;
  }
  String first = str.substring(str.length()-1);
  String last = str.substring(str.length()-2,str.length()-1);
  return str.substring(0,str.length()-2)+first+last;
}
