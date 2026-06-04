public String extraFront(String str) {
  if(str.length()<3){
    return str+str+str;
  }
  String sub = str.substring(0,2);
  return sub+sub+sub;
}
