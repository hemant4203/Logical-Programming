public String delDel(String str) {
  if(str.length()<=3)
   return str;
  if(str.substring(1,4).equals("del")){
    String front=str.substring(0,1);
    String back=str.substring(4,str.length());
    return front+back;
  }
  return str;
}
