package designPattern.TemplateMethodPattern;

public class Tea extends CaffeineBeverage{
    public void brew() {
        System.out.println("찻 잎 우리는 중");
    }

    public void addCondiments() {
        System.out.println("레몬 추가");
    }

}
