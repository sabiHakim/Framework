package etu001991.framework;

import java.lang.annotation.*;

@Retention( RetentionPolicy.RUNTIME )
public @interface Url {
    String name() default "";
}