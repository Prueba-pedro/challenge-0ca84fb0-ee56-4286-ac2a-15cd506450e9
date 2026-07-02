package com.pragma.loansystem.application;

import com.pragma.loansystem.domain.model.Loan;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class LoanApplicationTest {

    @Autowired
    private LoanApplication loanApplication;

    @Test
    void testApplyLoan() {
        Loan loan = new Loan(null, "1", BigDecimal.valueOf(1000), LocalDate.now(), null, "PENDING");
        Loan appliedLoan = loanApplication.applyLoan(loan);
        assertNotNull(appliedLoan);
    }
}