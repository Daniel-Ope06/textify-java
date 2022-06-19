package Scripts.SymbolClasses;

import Scripts.CharInterface;

public class SymbolAdd implements CharInterface{
    public String line(int lineNumber){
        String line = "";
        switch (lineNumber){
            case 1: line  = oooo+oooo+llll+oooo+oooo+oooo; break;
            case 2: line  = oooo+oooo+llll+oooo+oooo+oooo; break;
            case 3: line  = oooo+oooo+llll+oooo+oooo+oooo; break;
            case 4: line  = oooo+oooo+llll+oooo+oooo+oooo; break;
            case 5: line  = llll+llll+llll+llll+llll+oooo; break;
            case 6: line  = llll+llll+llll+llll+llll+oooo; break;
            case 7: line  = oooo+oooo+llll+oooo+oooo+oooo; break;
            case 8: line  = oooo+oooo+llll+oooo+oooo+oooo; break;
            case 9: line  = oooo+oooo+llll+oooo+oooo+oooo; break;
            case 10: line = oooo+oooo+llll+oooo+oooo+oooo; break;
        }
        return line;
    }
}
