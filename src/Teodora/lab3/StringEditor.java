package Teodora.lab3;
import java.util.*;

public class StringEditor {

    public String data;

    public StringEditor() {
        this.data = "";
    }

    public int WordsCounter() {
        return this.data.split(" ").length;
    }

    public int SentenceCounter() {
        return this.data.split("[^!?.]+").length - 1;
    }

    public int LettersCounter() {
        int count = 0;
        for (int i = 0; i < this.data.length(); i++) {
            if (Character.isLetter(data.charAt(i))) {
                count++;
            }
        }
        return count;
    }

    public int VowelsCounter() {
        int count = 0;
        String str = this.data;
        str = str.toLowerCase();
        for (int i = 0; i < this.data.length(); i++) {
            Character ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }

    public int ConsonantsCounter() {
        int count = 0;
        String str = this.data;
        str = str.toLowerCase();
        for (int i = 0; i < this.data.length(); i++) {
            Character ch = str.charAt(i);
            if (Character.isLetter(ch)) {
                if (ch != 'a' && ch != 'e' && ch != 'i' && ch != '0' && ch != 'u') {
                    count++;
                }
            }
        }
        return count;
    }

    public void longestWord() {
        String str = this.data;
        String[] word = str.split("([,.!?;|0-9\\s])");
        Arrays.toString(word);
        String longWord = "";
        for (int i = 0; i < word.length; i++) {
            if (word[i].length() >= longWord.length()) {
                longWord = word[i];
            }
        }
        System.out.println("The most longest word is: " + longWord);
    }

    //Finding the most 5 often words
    public void top5Words() {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        ArrayList<String> arrayList = new ArrayList(Arrays.asList(this.data.toLowerCase().split("[,.!?;[0-9]\\s]+")));
        for (int i = 1; i <= 5; i++) {
            int maxValue = 0;

            for (String word : arrayList) {
                Integer number = map.get(word);
                if (number == null) number = 1;
                else number = ++number;
                map.put(word, number);
            }

            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                int value = entry.getValue();
                if (value > maxValue) {
                    maxValue = value;
                }
            }
            String key = getKeyFromValue(map, maxValue);
            System.out.println(" Top " + i + " = " + key);
            map.remove(key);
            arrayList.removeAll(Collections.singleton(key));
        }
    }

    public static String getKeyFromValue (Map < String, Integer > hashMap, Integer value){
        for (String word : hashMap.keySet()) {
            if (hashMap.get(word).equals(value)) {
                return word;
            }
        }
        return null;
    }
}
