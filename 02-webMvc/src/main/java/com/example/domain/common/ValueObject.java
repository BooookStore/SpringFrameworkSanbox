package com.example.domain.common;

/**
 * 値オブジェクトのレイヤースーパータイプ。
 */
public interface ValueObject<T> {

    /**
     * 値オブジェクト同士が同じ値であるかを判定する。
     *
     * @param otherValueObject 比較対象の値オブジェクト
     * @return 判定結果
     */
    boolean isSameValueAs(T otherValueObject);

}
