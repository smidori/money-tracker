package com.sms.moneytracker.controllers;

import com.sms.moneytracker.models.Debt;
import com.sms.moneytracker.models.User;
import com.sms.moneytracker.service.DebtService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(DebtController.class)
public class DebtControllerTest {


    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private DebtService debtService;
    @Test
    public void getDebts() throws Exception {
        User user = new User(1, "Silvia");
        when(debtService.getDebts()).thenReturn(Arrays.asList(
                new Debt(1,"description",new BigDecimal(10), Debt.TypeDebt.BORROW,user, LocalDate.of(2023,8,9))));

        RequestBuilder request = MockMvcRequestBuilders
                .get("/debts")
                .accept(MediaType.APPLICATION_JSON);

        MvcResult result = mockMvc.perform(request)
                .andExpect(status().isOk())
                .andExpect((ResultMatcher) content().json("[{id:1,description:description, amount:10," +
                        "type:BORROW, date:2023-08-09}]"))
                .andReturn();

    }
}
