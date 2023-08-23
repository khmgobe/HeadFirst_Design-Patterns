package designPattern.TemplateMethodPattern;

public class Coffee extends CaffeineBeverage{

    public void brew() {
        System.out.println("필터로 커피 우리기");
    }

    public void addCondiments() {
        System.out.println("설탕과 우유 추가 ");
    }

    void boilWater() {
        System.out.println("물 끓이는 중");
    }

    void pourInCup() {
        System.out.println("컵에 따르는 중");
    }
}
