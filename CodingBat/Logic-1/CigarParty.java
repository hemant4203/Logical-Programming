public boolean cigarParty(int cigars, boolean isWeekend) {
  if((cigars>39 && cigars<61) && !isWeekend) return true;
  if((cigars<40 || cigars>60) && !isWeekend) return false;
  if(cigars<40 && isWeekend) return false;
  return true;
}
