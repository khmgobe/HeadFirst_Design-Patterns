package designPattern.SingletonPattern;

public class Singleton {
    private static Singleton uniqueInstance; // 인스턴스를 저장하는 정적 변수 선언

    private Singleton() {
    } //private 이므로 Singleton 에서만 클래스의 인스턴스 생성 가능

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton(); // 인스턴스를 만들어서 리턴.
        }
        return uniqueInstance;
    }
}
