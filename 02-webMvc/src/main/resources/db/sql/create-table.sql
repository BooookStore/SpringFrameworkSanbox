-- データベースを初期化
DROP TABLE coffeebean IF EXISTS;

CREATE TABLE coffeebean (
  ID INTEGER PRIMARY KEY,
  NAME VARCHAR(50)
);