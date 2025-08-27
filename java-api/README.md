# Java API (Spring Boot + MySQL)

フロントからDBへAPIでリクエストするバック処理
レスポンスの処理も含む（レスポンス成型はフロントでやってもいい？ -> 岡部さんと相談）

## 構成
- Spring Boot
- MySQL
- REST API（/api/bluegiant_api_test）

## セットアップ
1. Java 17以上（最新が24っぽいいからそれ入れればOK）、Gradleをインストール（Mavenっていうのもあったけど今回はGradleを使ってみた）
2. APIテストするならPostmanかcurlが便利そう
2. `src`、`build.gradle`を追加（Mavenを使うときはbuild設定をpom.xmlで管理するっぽい）
3. `src/main/resources/application.properties` <- DB接続情報（テーブル定義はまだ用意できてないけどいったんREADMEに書こうと思ってる）
