package com.sms.moneytracker.controllers;

import com.sms.moneytracker.models.Debt;
import com.sms.moneytracker.service.DebtService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/debts")
@AllArgsConstructor
@NoArgsConstructor
@Slf4j
public class DebtController {

    @Autowired
    private DebtService service;
    @PostMapping
    public Debt save(@RequestBody Debt debt){
        return this.service.save(debt);
    }
    @GetMapping
    public List<Debt> getDebts() {
        log.debug("getDebts");
        return this.service.getDebts();
    }
}

