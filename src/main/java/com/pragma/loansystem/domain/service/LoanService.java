package com.pragma.loansystem.domain.service;

import com.pragma.loansystem.domain.model.Loan;
import com.pragma.loansystem.infrastructure.repository.LoanRepository;
import org.springframework.stereotype.Service;

@Service
public class LoanService {

    private final LoanRepository loanRepository;

    public LoanService(LoanRepository loanRepository) {
        this.loanRepository = loanRepository;
    }

    public Loan applyLoan(Loan loan) {
        // Lógica de negocio para aplicar el préstamo
        return loanRepository.save(loan);
    }
}