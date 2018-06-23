package com.example.domain.coffeebean;

import java.util.List;

/**
 * コーヒー豆のリポジトリクラス。
 */
public interface CoffeeBeanRepository {

    /**
     * 全てのコーヒー豆を取得します。
     */
    List getAllCoffeeBean();

}
