package com.example.Spring_EMS.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class ResorceNotFoundException extends RuntimeException {
public ResorceNotFoundException(String resourceName, String fieldName, Object fieldValue) {
		super(String.format("snot found with %s:'%s'",resourceName,fieldName,fieldValue));
		this.resourceName = resourceName;
		this.fieldName = fieldName;
		this.fieldValue = fieldValue;
	}
private String resourceName;
private String fieldName;
private Object fieldValue;
public String getResourceName() {
	return resourceName;
}

public String getFieldName() {
	return fieldName;
}

public Object getFieldValue() {
	return fieldValue;
}


}
