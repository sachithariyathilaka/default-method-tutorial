package io.github.sachithariyathilaka.interfaces;

/**
 * Default method interface for implements the default methods.
 *
 * @author  Sachith Ariyathilaka
 * @version 1.0.0
 * @since   2024/03/31
 */
public interface DefaultMethodInterface {

    default public void defaultMethod() {
        System.out.println("Default method executed!");
    }

    abstract void abstractMethod();
}
