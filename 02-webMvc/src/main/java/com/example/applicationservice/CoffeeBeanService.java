package com.example.applicationservice;

import com.example.domain.coffeebean.CoffeeBean;
import com.example.persistence.H2SQLCoffeeBeanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * コーヒー豆のアプリケーションサービスクラス。
 */
@Service
public class CoffeeBeanService {

    private final H2SQLCoffeeBeanRepository coffeeBeanRepository;

    @Autowired
    public CoffeeBeanService(H2SQLCoffeeBeanRepository coffeeBeanRepository) {
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
