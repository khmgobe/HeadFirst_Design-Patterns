package designPattern.ObserverPattern;


public interface Subject {
    // Observer 인자로 받고 각각 옵저버 등록 및 제거 역할
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);

    // 주제의 상태 변경 시 모든 옵저버에게 변경 내역 알리는 메소드
    public void notifyObservers();
}
