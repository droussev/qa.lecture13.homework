package com.lecture13.homework;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
    public static void main(String[] args) {
        SoleProprietor sp = new SoleProprietor(
                "ЕТ Чугун99",
                "19.9.1999",
                "1028528710",
                "Желязко Каменов",
                10000,
                99999);
        log.info("Company profit is {}", sp.calculateProfit());
    }

}
