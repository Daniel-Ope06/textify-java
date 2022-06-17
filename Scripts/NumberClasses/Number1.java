package Scripts.NumberClasses;

import Scripts.CharInterface;

public class Number1 implements CharInterface{
    public String line(int lineNumber){
        String line = "";
        switch (lineNumber){
            case 1: line  = llll+llll+oooo+oooo; break;
            case 2: line  = llll+llll+oooo+oooo; break;
            case 3: line  = oooo+llll+oooo+oooo; break;
            case 4: line  = oooo+llll+oooo+oooo; break;
            case 5: line  = oooo+llll+oooo+oooo; break;
            case 6: line  = oooo+llll+oooo+oooo; break;
            case 7: line  = oooo+llll+oooo+oooo; break;
            case 8: line  = oooo+llll+oooo+oooo; break;
            case 9: line  = llll+llll+llll+oooo; break;
            case 10: line = llll+llll+llll+oooo; break;
        }
        return line;
    }
}
