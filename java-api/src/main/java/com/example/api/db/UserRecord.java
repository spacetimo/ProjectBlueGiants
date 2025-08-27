package com.example.api.db;

import jakarta.persistence.*;

/**
 * user_loginテーブルに対応するエンティティクラス
 */
@Entity
@Table(name = "user_login")
public class UserRecord {
    /**
     * ユーザー名（主キー）
     */
    @Id
    @Column(length = 50)
    private String username;

    /**
     * メールアドレス
     */
    @Column(length = 100)
    private String email;

    /**
     * パスワードハッシュ
     */
    @Column(name = "password_hash", length = 255, nullable = false)
    private String passwordHash;

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getPasswordHash() { return passwordHash; }
    public void setPasswordHash(String passwordHash) { this.passwordHash = passwordHash; }
}
