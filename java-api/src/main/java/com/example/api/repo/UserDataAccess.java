package com.example.api.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.api.db.UserRecord;


/**
 * UserRecordエンティティのデータアクセス用リポジトリ
 * JpaRepositoryを継承->基本的なCRUDができるっぽい
 */
public interface UserDataAccess extends JpaRepository<UserRecord, Long> {}
