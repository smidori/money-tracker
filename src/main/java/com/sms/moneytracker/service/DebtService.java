package com.sms.moneytracker.service;

import com.sms.moneytracker.models.Debt;
import com.sms.moneytracker.repositories.DebtRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class DebtService {

    @Autowired
    private DebtRepository debtRepository;
    public Debt save(Debt debt){
        return this.debtRepository.save(debt);
    }

    public List<Debt> getDebts() {
        return this.debtRepository.findAll();
    }
}
