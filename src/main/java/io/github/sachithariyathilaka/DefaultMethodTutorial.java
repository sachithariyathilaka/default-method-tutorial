package io.github.sachithariyathilaka;

import io.github.sachithariyathilaka.interfaces.DefaultMethodInterface;

/**
 * Main class for the default method tutorial.
 *
 * @author  Sachith Ariyathilaka
 * @version 1.0.0
 * @since   2024/03/31
 */
public class DefaultMethodTutorial implements DefaultMethodInterface
{
    public static void main( String[] args )
    {
        DefaultMethodTutorial defaultMethodTutorial = new DefaultMethodTutorial();
        defaultMethodTutorial.defaultMethod();
        defaultMethodTutorial.abstractMethod();
    }

    @Override
    public void abstractMethod() {
        System.out.println( "Abstract method executed!" );
    }
}
