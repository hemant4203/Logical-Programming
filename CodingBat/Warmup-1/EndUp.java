public String endUp(String str) {
  if(str.length()>3){
    String upper = str.substring(str.length()-3).toUpperCase();
    
    return str.substring(0,str.length()-3)+upper;
  }
  return str.toUpperCase();
}
