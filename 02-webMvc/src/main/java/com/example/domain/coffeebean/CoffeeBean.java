package com.example.domain.coffeebean;

import com.example.domain.common.Entity;

/**
 * コーヒー豆を表すエンティティクラス。
 */
public class CoffeeBean implements Entity<CoffeeBean> {

    private CoffeeBeanId id;

    private CoffeeBeanName name;

    /**
     * 必要な値で初期化するファクトリコンストラクタ。
     *
     * @param id ID
     */
    public CoffeeBean(int id, String name) {
        this.id = new CoffeeBeanId(id);
        this.name = new CoffeeBeanName(name);
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
