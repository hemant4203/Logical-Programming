public String minCat(String a, String b) {
  int shortLen=a.length();
  if(a.length()>b.length()){
    shortLen=b.length();
    return a.substring(a.length()-shortLen)+b;
  }
  return a+b.substring(b.length()-shortLen);
}
