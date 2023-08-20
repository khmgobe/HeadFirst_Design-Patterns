package designPattern.AdaptorPattern;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.function.Consumer;

public class EnumerationIterator implements Iterator<Object> {
    Enumeration<?> enumeration;

    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    public Object next() {
        return enumeration.nextElement();
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
    public EnumerationIterator(Enumeration<?> enumeration) {
        this.enumeration = enumeration;
    }
}
