package com.example.domain.common;

/**
 * エンティティのレイヤースーパータイプ
 *
 * @param <T> 実装するクラスの型
 */
public interface Entity<T> {

    /**
     * 同一性において、同じであるかを判定する。
     *
     * @param otherEntity 比較対象のエンティティ
     * @return 比較結果
     */
    boolean identifiedBy(T otherEntity);

}
