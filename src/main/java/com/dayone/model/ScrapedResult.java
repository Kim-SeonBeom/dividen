package com.dayone.model;

import com.dayone.model.Company;
import com.dayone.model.Dividend;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class ScrapedResult {

    private Company company;
    private List<Dividend> dividends;

    public ScrapedResult(){this.dividends = new ArrayList<>();
    }
}
