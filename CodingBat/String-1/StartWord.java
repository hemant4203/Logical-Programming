public String startWord(String str, String word) {
  int wordLength = word.length();
  if(str.length()<wordLength) return "";
  if(str.substring(1,wordLength).equals(word.substring(1))) return str.substring(0,wordLength);
  return "";
}
