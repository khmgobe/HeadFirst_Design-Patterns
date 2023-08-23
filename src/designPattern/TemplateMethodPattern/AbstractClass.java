package designPattern.TemplateMethodPattern;

public abstract class AbstractClass {

    final void templateMethod() {
        primitiveOperation1();
        primitiveOperation2();
        concreteOperation();
        hook();
    }
    /** 서브 클래스에서 구현하도록*/
    abstract void primitiveOperation1();
    abstract void primitiveOperation2();

    /** 템플릿 메소드에서 호출 또는 서브클래스에서 호출하여 사용*/
    final void concreteOperation() {
        System.out.println("오퍼레이션");
    }


    void hook() {}
}
