package com.pragma.loansystem.domain.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public record Loan(Long id, String customerId, BigDecimal amount, LocalDate applicationDate, LocalDate approvalDate, String status) {
}