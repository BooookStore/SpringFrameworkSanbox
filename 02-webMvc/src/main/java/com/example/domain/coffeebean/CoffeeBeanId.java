package com.example.domain.coffeebean;

import com.example.domain.common.ValueObject;

/**
 * コーヒー豆のIDを表す値オブジェクトクラス。
 */
public class CoffeeBeanId implements ValueObject<CoffeeBeanId> {

    /**
     * ID値
     */
    private final int id;

    /**
     * 必要な値を初期化するコンストラクタ
     *
     * @param id ID値
     */
    public CoffeeBeanId(int id) {
        this.id = id;
    }

    /**
     * IDの値を読みやすい様に表現したものを返します。
     */
    public String readable() {
        // fixme : あとで実装する
        return raw();
    }

    /**
     * IDの生の値を返します。
     *
     * @return IDの名前の値
     */
    public String raw() {
        return Integer.toString(this.id);
    }


    /**
     * {@inheritDoc}
     *
     * @param otherValueObject 比較対象の値オブジェクト
     */
    @Override
    public boolean isSameValueAs(CoffeeBeanId otherValueObject) {
        return this.id == otherValueObject.id;
    }
}
