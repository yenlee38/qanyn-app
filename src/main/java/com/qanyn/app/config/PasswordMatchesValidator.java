package com.qanyn.app.config;

import com.qanyn.app.model.Admin;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PasswordMatchesValidator implements ConstraintValidator<PasswordMatches, Object> {
    @Override
    public void initialize(PasswordMatches constraintAnnotation) {
    }
    @Override
    public boolean isValid(Object obj, ConstraintValidatorContext context){
        Admin admin = (Admin) obj;
        return admin.getPassword().equals(admin.getMatchingPassword());
    }

}
