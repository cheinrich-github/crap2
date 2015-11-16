package de.adesso.ruhe;


import javax.annotation.Nonnull;
import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Created by ruhe on 16.11.2015.
 */
public class Application {


    public static void main(@Nonnull final String[] args) {
        System.out.println(Arrays.asList("Hello", "world").stream().collect(Collectors.joining(", ")));
        final Application app = new Application();
        if (args != null) {
            app.parse(args);
        }
    }

    private void parse(@Nonnull String[] args) {
        System.out.print(args.length);
    }
}
