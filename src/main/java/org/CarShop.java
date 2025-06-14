package org;

import java.util.ArrayList;
import java.util.List;

// Car's Shop 類別
public class CarShop {
  // Car's Shop 的名稱
  String carShopName;

  // Car's Shop 擁有的車子
  List<Car> carList;

  // Car's Shop 的建構子
  public CarShop(String name) {
    this.carShopName = name;
    this.carList = new ArrayList<>();
  }

  // 加入 Car 到 CarShop
  public void addCar(Car car) {
    carList.add(car);
  }

  // 獲取 Car's Shop 擁有的 Cars
  public List<Car> getCarList() {
    return carList;
  }
}