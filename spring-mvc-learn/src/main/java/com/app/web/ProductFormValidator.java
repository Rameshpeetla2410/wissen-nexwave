package com.app.web;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class ProductFormValidator implements Validator {
	@Override
	public boolean supports(Class<?> clazz) {
		return clazz.equals(ProductForm.class);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmpty(errors, "name", "Product Name shud not be blank");
	}
}
