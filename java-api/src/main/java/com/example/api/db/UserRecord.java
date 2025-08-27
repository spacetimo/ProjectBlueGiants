package com.example.api.db;

import jakarta.persistence.*;


/**
 * テーブル対応エンティティクラス
 */
@Entity
@Table(name = "bluegiant_api_test")
public class UserRecord {
    /**
     * ユーザーID（主キー）
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * ユーザーのニックネーム（何に使うのかよくわからん）
     */
    private String nickname;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNickname() { return nickname; }
    public void setNickname(String nickname) { this.nickname = nickname; }
}
