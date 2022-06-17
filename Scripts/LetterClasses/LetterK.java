package Scripts.LetterClasses;

import Scripts.CharInterface;

public class LetterK implements CharInterface{
    public String line(int lineNumber){
        String line = "";
        switch (lineNumber){
            case 1: line  = llll+oooo+llll+oooo; break;
            case 2: line  = llll+oooo+llll+oooo; break;
            case 3: line  = llll+llll+oooo+oooo; break;
            case 4: line  = llll+llll+oooo+oooo; break;
            case 5: line  = llll+oooo+oooo+oooo; break;
            case 6: line  = llll+oooo+oooo+oooo; break;
            case 7: line  = llll+llll+oooo+oooo; break;
            case 8: line  = llll+llll+oooo+oooo; break;
            case 9: line  = llll+oooo+llll+oooo; break;
            case 10: line = llll+oooo+llll+oooo; break;
        }
        return line;
    }
}
