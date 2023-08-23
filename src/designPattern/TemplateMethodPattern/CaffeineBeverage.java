package designPattern.TemplateMethodPattern;

public abstract class CaffeineBeverage {

    /** 서브 클래스가 오버라이드 하지 못하도록 */
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    /** 서브 클래스가 알아서 처리하게 */
    abstract void brew();
    abstract void addCondiments();

    void boilWater() {
        System.out.println("물 끓이는 중");
    }

    void pourInCup() {
        System.out.println("컵에 따르는 중");
    }
}
