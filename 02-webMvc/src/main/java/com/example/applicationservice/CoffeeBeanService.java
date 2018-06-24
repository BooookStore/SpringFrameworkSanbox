package com.example.applicationservice;

import com.example.domain.coffeebean.CoffeeBean;
import com.example.persistence.PostgreSQLCoffeeBeanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * コーヒー豆のアプリケーションサービスクラス。
 */
@Service
public class CoffeeBeanService {

    private final PostgreSQLCoffeeBeanRepository coffeeBeanRepository;

    @Autowired
    public CoffeeBeanService(PostgreSQLCoffeeBeanRepository coffeeBeanRepository) {
        this.coffeeBeanRepository = coffeeBeanRepository;
    }

    /**
     * 全てのコーヒー豆を取得する。
     *
     * @return 全てのコーヒー豆
     */
    public List<CoffeeBean> getAllCoffeeBean() {
        return this.coffeeBeanRepository.getAllCoffeeBean();
    }

}
