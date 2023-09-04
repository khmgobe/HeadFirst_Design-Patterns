package designPattern.TemplateMethodPattern;

public class TeaWithHook extends CaffeineBeverageWithHook{

    @Override
    void brew() {
        System.out.println("끓여부러부러");
    }

    @Override
    void addCondiments() {
        System.out.println("넣을까요 말까요오~");
    }
}
