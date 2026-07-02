package com.pragma.loansystem.application;

import com.pragma.loansystem.domain.model.Loan;
import com.pragma.loansystem.domain.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoanApplication {

    private final LoanService loanService;

    @Autowired
    public LoanApplication(LoanService loanService) {
        this.loanService = loanService;
    }

    public Loan applyLoan(Loan loan) {
        return loanService.applyLoan(loan);
    }
}