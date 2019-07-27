package test1;

public class TextEditor {
    private SpellChecker spellChecker;
    /*
    有参构造
     */
    public TextEditor(SpellChecker spellChecker){
//        System.out.println("Inside TextEditorConstructor");
        this.spellChecker=spellChecker;
    }

    public void spellCheck(){
        spellChecker.checkSpelling();
    }
}
