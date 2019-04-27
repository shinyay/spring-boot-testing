package io.pivotal.shinyay.test;

import com.github.springtestdbunit.dataset.ReplacementDataSetLoader;

public class ReplacementCsvDataSetLoader extends ReplacementDataSetLoader {
    public ReplacementCsvDataSetLoader() {
        super(new CsvDataSetLoader());
    }
}