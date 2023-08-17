package designPattern.SingletonPattern;

public class Singleton_DCL {
    private volatile static Singleton_DCL uniqueInstance;

    private Singleton_DCL() {}

    public static Singleton_DCL getInstance() {
        if (uniqueInstance == null) { // 인스턴스 여부를 체킹하고 없으면 동기화된 블록으로 이동
            synchronized (Singleton_DCL.class) {
                if (uniqueInstance == null) { // 이렇게 되면 처음에만 동기화
                    uniqueInstance = new Singleton_DCL(); // 블록에서도 다시 한 번 널체킹 후 인스턴스 생성
                }
            }
        }
        return uniqueInstance;
    }
}
