package com.example.constraint;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.util.ObjectUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class EqualEmailValidator implements ConstraintValidator<EqualEmail, Object> {

    private String email;
    private String confirmEmail;
    private String message;

    @Override
    public void initialize(EqualEmail value) {
        this.email = value.email();
        this.confirmEmail = value.confirmEmail();
        this.message = value.message();
    }

    @Override
    public boolean isValid(Object o, ConstraintValidatorContext constraintValidatorContext) {
        BeanWrapper beanWrapper = new BeanWrapperImpl(o);
        Object emailValue = beanWrapper.getPropertyValue(email);
        Object confirmEmailValue = beanWrapper.getPropertyValue(confirmEmail);

        boolean isMatch = ObjectUtils.nullSafeEquals(emailValue, confirmEmailValue);
        if (isMatch) {
            return true;
        } else {
            constraintValidatorContext.disableDefaultConstraintViolation();
            constraintValidatorContext.buildConstraintViolationWithTemplate(message)
                    .addPropertyNode(confirmEmail).addConstraintViolation();
            return false;
        }
    }

}
