package test2;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import test2.TextEditor;

public class MainApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        TextEditor textEditor = (TextEditor) context.getBean("textEditor");
        textEditor.spellCheck();
        /*-----------------------------------------------*/
        TextEditor bean = context.getBean(TextEditor.class);
        bean.spellCheck();

    }
}
