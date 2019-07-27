package test2;

import test1.SpellChecker;

public class TextEditor {
    private SpellChecker spellChecker;
    /*
    set and get 方法
     */
    public SpellChecker getSpellChecker() {
        return spellChecker;
    }

    public void setSpellChecker(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }

    public void spellCheck(){
        spellChecker.checkSpelling();
    }
}
