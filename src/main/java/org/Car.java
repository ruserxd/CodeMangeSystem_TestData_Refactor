package org;

// Car 類別
public class Car {
  // Car 的名稱
  String name;

  // Car 的建構子
  public Car(String name) {
    setName(name);
  }

  // 獲取 Car 的名稱
  public String getName() {
    return this.name;
  }

  // 設定 Car 的名稱
  public void setName(String name) {
    this.name = name;
  }
}