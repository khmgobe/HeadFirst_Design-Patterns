package designPattern.TemplateMethodPattern;

public abstract class CaffeineBeverageWithHook {

    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }
        abstract void brew();

    abstract void addCondiments();

    void boilWater() {
        System.out.println("물 끓이는 중");
    }

    void pourInCup() {
        System.out.println("컵에 따르는 중");
    }


    /** 기본 메소드, 서브클레스에서 필요할 때 오버라이드 할 수 있는 메소드인 후크*/
    boolean customerWantsCondiments() {
        return true;
    }
}
