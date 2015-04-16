package java.ds;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by openworld on 15-4-16.
 */
interface IStack<T>{

    public T pop();
    public void push(T t);
    public boolean isEmpty();
    public T peak();

}

public class Stack<T> implements IStack<T> {

    private List<T> list;

    public Stack() {
        list = new ArrayList<T>();
    }

    @Override
    public T pop() {
        return list.remove(list.size()-1);
    }

    @Override
    public void push(T t) {

    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public T peak() {
        return null;
    }

}


