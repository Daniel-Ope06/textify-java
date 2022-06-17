package Scripts.SymbolClasses;

import Scripts.CharInterface;

public class SymbolHash implements CharInterface{
    public String line(int lineNumber){
        String line = "";
        switch (lineNumber){
            case 1: line  = oooo+llll+oooo+llll+oooo+oooo; break;
            case 2: line  = oooo+llll+oooo+llll+oooo+oooo; break;
            case 3: line  = llll+llll+llll+llll+llll+oooo; break;
            case 4: line  = llll+llll+llll+llll+llll+oooo; break;
            case 5: line  = oooo+llll+oooo+llll+oooo+oooo; break;
            case 6: line  = oooo+llll+oooo+llll+oooo+oooo; break;
            case 7: line  = llll+llll+llll+llll+llll+oooo; break;
            case 8: line  = llll+llll+llll+llll+llll+oooo; break;
            case 9: line  = oooo+llll+oooo+llll+oooo+oooo; break;
            case 10: line = oooo+llll+oooo+llll+oooo+oooo; break;
        }
        return line;
    }
}
