import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Set {

    private ArrayList<LinkedList<String>> table = new ArrayList<LinkedList<String>>();

    public Set() {
        int lettersFromAlphabet = 26;

        // hash function
        for (int i=0; i < lettersFromAlphabet; i++) {
            table.add(new LinkedList<String>());
        }
    }

    private int getIndexOfTable(String str) {
        int lettersFromAlphabet = 26;
        String lowerCase = str.toLowerCase();
        char firstLetter = lowerCase.charAt(0);

        return firstLetter % lettersFromAlphabet;
    }

    public void add(String str){
        List<String> list = getListOfTable(str);

        if (!list.contains(str)) {
            list.add(str);
        }
    }

    public void remove(String str){
      List<String> list = getListOfTable(str);

      if (list.contains(str)) {
          list.remove(str);
      }
    }

    private List<String> getListOfTable(String str) {
        int index = getIndexOfTable(str);
        return table.get(index);
    }

    @Override
    public String toString() {
        return table.toString();
    }
}
