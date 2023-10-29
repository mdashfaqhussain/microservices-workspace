package com.eazybytes.accounts.dto;

import java.util.Map;


import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

@ConfigurationProperties(prefix = "accounts")
public record AccountsContactInfoDto(String message, Map<String,String> contactDetails , List<String> onCallSupport) {
}