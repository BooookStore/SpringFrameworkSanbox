package com.example.constraint;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = {EqualEmailValidator.class})
@Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface EqualEmail {

    String message() default "{com.example.validation.accountCreateForm.message}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    String email();

    String confirmEmail();

    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    @Documented
    public @interface List {
        EqualEmail[] value();
    }

}
