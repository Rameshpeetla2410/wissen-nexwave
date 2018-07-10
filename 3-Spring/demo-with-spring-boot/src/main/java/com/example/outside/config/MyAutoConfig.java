package com.example.outside.config;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import com.example.demo.repository.ProductRepository;

@Configuration
// @ConditionalOnClass(value= {ProductRepository.class})
// @ConditionalOnMissingClass(value = "com.YourClass")
// @ConditionalOnClass(name = { "com.YourClass" })
// @ConditionalOnBean(name="productRepo")
// @ConditionalOnMissingBean(name="dataSource")
@ConditionalOnProperty(name = "prop1", prefix = "my")
@ConfigurationProperties(prefix = "my")
public class MyAutoConfig {

	private boolean featureEnabled;
	@NotBlank
	private String requiredProp;

	public boolean isFeatureEnabled() {
		return featureEnabled;
	}

	public void setFeatureEnabled(boolean featureEnabled) {
		this.featureEnabled = featureEnabled;
	}

	public String getRequiredProp() {
		return requiredProp;
	}

	public void setRequiredProp(String requiredProp) {
		this.requiredProp = requiredProp;
	}

}
