import java.util.*;

public class WordList
{
  private ArrayList <String> myList;

  public WordList() { myList = new ArrayList<String>(); }
  public void add(String word) { myList.add(word); }
  public String toString() { return myList.toString(); }

  public int numWordsOfLength(int len)
  {
    int count = 0;
    for(int i =0; i < myList.length(); i++){
      if(myList.get(i).length() == len){
        count++;
      }
      return count;
  }
  }

  public void removeWordsOfLength(int len)
  {
   for(int r = 0; r < myList.length(); r++){
    if(myList.get(r).length() == len){
      myList.remove(r);
      r--;
  }
}
  }
}
