package app;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//@Target()
@Retention(RetentionPolicy.RUNTIME)
public @interface VM_keep {


    boolean retain();


}
