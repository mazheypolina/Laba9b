package sort;

import info.Symbol;
import info.Word;

public class Input {
    public static void InputChar(Word[] word, Symbol symbol){
        for (int i = 0; i < word.length; i++) {
            int count = 0;
            for (int j = 0; j < word[i].getWord().length(); j++) {
                if (word[i].getWord().charAt(j) == symbol.getSymbol()) {
                    count++;
                }
            }
            word[i].setNumberSymbol(count);
        }

        for (int i = 0; i < word.length; i++) {
            if (word[i].getNumberSymbol() != 0) {
                System.out.println("В слове " + "'" + word[i].getWord() + "'" + " символ " + symbol.getSymbol() + " встречается " + word[i].getNumberSymbol() + " раз!");
            }else{
                System.out.println("В слове "  + "'" + word[i].getWord() + "'" + " нет данного символа!");
            }
        }
    }
}
