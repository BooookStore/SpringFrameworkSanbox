package com.example.domain.coffeebean;

import com.example.domain.common.ValueObject;

/**
 * コーヒ豆の名前を表す値オブジェクト。
 */
public class CoffeeBeanName implements ValueObject<CoffeeBeanName> {

    /**
     * 名前
     */
    private String name;

    /**
     * 必要な値を初期化するコンストラクタ。
     *
     * @param name 名前
     */
    public CoffeeBeanName(String name) {
        this.name = name;
    }

    public String fullName() {
        return this.name;
    }

    /**
     * {@inheritDoc}
     *
     * @param otherValueObject 比較対象の値オブジェクト
     */
    @Override
    public boolean isSameValueAs(CoffeeBeanName otherValueObject) {
        return this.name.equals(otherValueObject.name);
    }

}
