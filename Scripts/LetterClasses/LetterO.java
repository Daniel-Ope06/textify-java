package Scripts.LetterClasses;

import Scripts.CharInterface;

public class LetterO implements CharInterface{
    public String line(int lineNumber){
        String line = "";
        switch (lineNumber){
            case 1: line  = llll+llll+llll+oooo; break;
            case 2: line  = llll+llll+llll+oooo; break;
            case 3: line  = llll+oooo+llll+oooo; break;
            case 4: line  = llll+oooo+llll+oooo; break;
            case 5: line  = llll+oooo+llll+oooo; break;
            case 6: line  = llll+oooo+llll+oooo; break;
            case 7: line  = llll+oooo+llll+oooo; break;
            case 8: line  = llll+oooo+llll+oooo; break;
            case 9: line  = llll+llll+llll+oooo; break;
            case 10: line = llll+llll+llll+oooo; break;
        }
        return line;
    }
}
