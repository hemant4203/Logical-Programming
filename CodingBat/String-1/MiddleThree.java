public String middleThree(String str) {
  if(str.length()==3){
    return str;
  }
  int mid=(str.length()/2)-1;
  return str.substring(mid,mid+3);
}
