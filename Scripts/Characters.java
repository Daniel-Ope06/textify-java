package Scripts;

// Letters
import Scripts.LetterClasses.Space;
import Scripts.LetterClasses.LetterA;
import Scripts.LetterClasses.LetterB;
import Scripts.LetterClasses.LetterC;
import Scripts.LetterClasses.LetterD;
import Scripts.LetterClasses.LetterE;
import Scripts.LetterClasses.LetterF;
import Scripts.LetterClasses.LetterG;
import Scripts.LetterClasses.LetterH;
import Scripts.LetterClasses.LetterI;
import Scripts.LetterClasses.LetterJ;
import Scripts.LetterClasses.LetterK;
import Scripts.LetterClasses.LetterL;
import Scripts.LetterClasses.LetterM;
import Scripts.LetterClasses.LetterN;
import Scripts.LetterClasses.LetterO;
import Scripts.LetterClasses.LetterP;
import Scripts.LetterClasses.LetterQ;
import Scripts.LetterClasses.LetterR;
import Scripts.LetterClasses.LetterS;
import Scripts.LetterClasses.LetterT;
import Scripts.LetterClasses.LetterU;
import Scripts.LetterClasses.LetterV;
import Scripts.LetterClasses.LetterW;
import Scripts.LetterClasses.LetterX;
import Scripts.LetterClasses.LetterY;
import Scripts.LetterClasses.LetterZ;

// Numbers
import Scripts.NumberClasses.Number0;
import Scripts.NumberClasses.Number1;
import Scripts.NumberClasses.Number2;
import Scripts.NumberClasses.Number3;
import Scripts.NumberClasses.Number4;
import Scripts.NumberClasses.Number5;
import Scripts.NumberClasses.Number6;
import Scripts.NumberClasses.Number7;
import Scripts.NumberClasses.Number8;
import Scripts.NumberClasses.Number9;

// Symbols
import Scripts.SymbolClasses.SymbolExclamation;
import Scripts.SymbolClasses.SymbolQuestion;
import Scripts.SymbolClasses.SymbolHash;
import Scripts.SymbolClasses.SymbolAdd;


public class Characters {
    public static String generateChar(String word, int lineNumber){
        word = word.toUpperCase();
        String line = new String("");
        for (int i = 0; i < word.length(); i++){
            char letter = word.charAt(i);
            switch(letter){
                // Letters
                case ' ': line += space.line(lineNumber); break;
                case 'A': line += Characters.a.line(lineNumber); break;
                case 'B': line += Characters.b.line(lineNumber); break;
                case 'C': line += Characters.c.line(lineNumber); break;
                case 'D': line += Characters.d.line(lineNumber); break;
                case 'E': line += Characters.e.line(lineNumber); break;
                case 'F': line += Characters.f.line(lineNumber); break;
                case 'G': line += Characters.g.line(lineNumber); break;
                case 'H': line += Characters.h.line(lineNumber); break;
                case 'I': line += Characters.i.line(lineNumber); break;
                case 'J': line += Characters.j.line(lineNumber); break;
                case 'K': line += Characters.k.line(lineNumber); break;
                case 'L': line += Characters.l.line(lineNumber); break;
                case 'M': line += Characters.m.line(lineNumber); break;
                case 'N': line += Characters.n.line(lineNumber); break;
                case 'O': line += Characters.o.line(lineNumber); break;
                case 'P': line += Characters.p.line(lineNumber); break;
                case 'Q': line += Characters.q.line(lineNumber); break;
                case 'R': line += Characters.r.line(lineNumber); break;
                case 'S': line += Characters.s.line(lineNumber); break;
                case 'T': line += Characters.t.line(lineNumber); break;
                case 'U': line += Characters.u.line(lineNumber); break;
                case 'V': line += Characters.v.line(lineNumber); break;
                case 'W': line += Characters.w.line(lineNumber); break;
                case 'X': line += Characters.x.line(lineNumber); break;
                case 'Y': line += Characters.y.line(lineNumber); break;
                case 'Z': line += Characters.z.line(lineNumber); break;

                // Numbers
                case '0': line += zero.line(lineNumber); break;
                case '1': line += one.line(lineNumber); break;
                case '2': line += two.line(lineNumber); break;
                case '3': line += three.line(lineNumber); break;
                case '4': line += four.line(lineNumber); break;
                case '5': line += five.line(lineNumber); break;
                case '6': line += six.line(lineNumber); break;
                case '7': line += seven.line(lineNumber); break;
                case '8': line += eight.line(lineNumber); break;
                case '9': line += nine.line(lineNumber); break;

                // Symbols
                case '!': line += exclamation.line(lineNumber); break;
                case '?': line += question.line(lineNumber); break;
                case '#': line += hash.line(lineNumber); break;
                case '+': line += add.line(lineNumber); break;

                // Unavailable Characters
                default : line += question.line(lineNumber);
            }
        }
        return line;
    }

    // Initialize letters
    static Space space = new Space(); 
    static LetterA a = new LetterA();
    static LetterB b = new LetterB();
    static LetterC c = new LetterC();
    static LetterD d = new LetterD();
    static LetterE e = new LetterE();
    static LetterF f = new LetterF();
    static LetterG g = new LetterG();
    static LetterH h = new LetterH();
    static LetterI i = new LetterI();
    static LetterJ j = new LetterJ();
    static LetterK k = new LetterK();
    static LetterL l = new LetterL();
    static LetterM m = new LetterM();
    static LetterN n = new LetterN();
    static LetterO o = new LetterO();
    static LetterP p = new LetterP();
    static LetterQ q = new LetterQ();
    static LetterR r = new LetterR();
    static LetterS s = new LetterS();
    static LetterT t = new LetterT();
    static LetterU u = new LetterU();
    static LetterV v = new LetterV();
    static LetterW w = new LetterW();
    static LetterX x = new LetterX();
    static LetterY y = new LetterY();
    static LetterZ z = new LetterZ();

    // Initialize numbers
    static Number0 zero = new Number0();
    static Number1 one = new Number1();
    static Number2 two = new Number2();
    static Number3 three = new Number3();
    static Number4 four = new Number4();
    static Number5 five = new Number5();
    static Number6 six = new Number6();
    static Number7 seven = new Number7();
    static Number8 eight = new Number8();
    static Number9 nine = new Number9();

    // Initialize symbols
    static SymbolExclamation exclamation = new SymbolExclamation();
    static SymbolQuestion question = new SymbolQuestion();
    static SymbolHash hash = new SymbolHash();
    static SymbolAdd add = new SymbolAdd();
}
