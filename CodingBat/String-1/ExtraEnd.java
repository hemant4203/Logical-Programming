public String extraEnd(String str) {
  String newStr = str.substring(str.length()-2,str.length());
  return newStr+newStr+newStr;
}
