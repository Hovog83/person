package com.company.core.annotations;
import java.lang.annotation.*;

@Target(value=ElementType.TYPE)
@Retention(value= RetentionPolicy.RUNTIME)
public @interface ModelEnum {
    String[] designation();
}
