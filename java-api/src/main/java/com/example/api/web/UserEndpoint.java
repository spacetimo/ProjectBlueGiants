package com.example.api.web;

import org.springframework.web.bind.annotation.*;
import com.example.api.repo.UserDataAccess;
import com.example.api.db.UserRecord;
import java.util.List;


/**
 * /api/bluegiant_api_testエンドポイントコントローラー
 * いったんテーブルから取得するだけ
 */
@RestController
@RequestMapping("/api/bluegiant_api_test")
public class UserEndpoint {
    private final UserDataAccess repo;

    /**
     * DIコンストラクタ
     * @param repo UserDataAccessリポジトリ
     */
    public UserEndpoint(UserDataAccess repo) { this.repo = repo; }

    /**
     * ユーザー一覧を取得するGET API
     * @return 全ユーザーのリスト
     */
    @GetMapping
    public List<UserRecord> getAll() {
        return repo.findAll();
    }
}
