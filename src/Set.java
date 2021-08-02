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

        return str.toLowerCase().charAt(0) % lettersFromAlphabet;
    }

    public void add(String str){
        int index = getIndexOfTable(str);
        List<String> list = table.get(index);

        if (!list.contains(str)) {
            list.add(str);
        }
    }

    public void remove(String str){
      int index = getIndexOfTable(str);
      List<String> list = table.get(index);

      if (list.contains(str)) {
          list.remove(str);
      }
    }



    @Override
    public String toString() {
        return table.toString();
    }
}
