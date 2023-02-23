package me.whiteship.refactoring._11_primitive_obsession._30_repliace_primitive_with_object;

import java.util.List;

/**
 * @author kangmoo Heo
 */
public class Priority {
    private static final List<String> legalValues = List.of("low", "normal", "high", "rush");
    private final String value;

    public Priority(String value) {
        if(!legalValues.contains(value))
            throw new IllegalArgumentException("illegal value for priority" + value);
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    private int index(){
        return legalValues.indexOf(this.value);
    }

    public boolean higherThan(Priority other){
        return this.index() > other.index();
    }
}
