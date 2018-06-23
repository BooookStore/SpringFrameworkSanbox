package com.example.domain.coffeebean;

import com.example.domain.common.Entity;

import java.util.Objects;

/**
 * コーヒー豆を表すエンティティクラス。
 */
public class CoffeeBean implements Entity<CoffeeBean> {

    private CoffeeBeanId id;

    private CoffeeBeanName name;

    /**
     * 必要な値で初期化するコンストラクタ。
     *
     * @param id ID
     */
    public CoffeeBean(CoffeeBeanId id, CoffeeBeanName name) {
        this.id = Objects.requireNonNull(id, "コーヒー豆のIDにnull値はセット出来ません。");
        this.name = Objects.requireNonNull(name, "コーヒー豆の名前にnull値はセット出来ません。");
    }

    public CoffeeBeanId id() {
        return this.id;
    }

    public CoffeeBeanName name() {
        return this.name;
    }

    /**
     * {@inheritDoc}
     *
     * @param otherEntity 比較対象のエンティティ
     */
    @Override
    public boolean identifiedBy(CoffeeBean otherEntity) {
        return this.id.isSameValueAs(otherEntity.id);
    }

}
