package com.canaristar.backend.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Component
public class AdminConfig {

    @Value("${ADMIN_CREATION_PASSWORD}")
    private String adminCreationPassword;

}
