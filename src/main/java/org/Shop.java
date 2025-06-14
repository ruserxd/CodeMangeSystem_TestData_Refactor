package org;

import java.util.ArrayList;
import java.util.List;

// Car's Shop 類別
public class Shop {
  // Car's Shop 的名稱
  String carShopName;

  // Car's Shop 擁有的車子
  List<Car> carList;

  // Car's Shop 的建構子
  public Shop(String name) {
    this.carShopName = name;
    this.carList = new ArrayList<>();
  }

  // 加入 Car 到 CarShop
  public void addCar(Car car) {
    carList.add(car);
    System.out.println("新增 " + car.carName + "到" + carShopName);
  }

  // 獲取 Car's Shop 擁有的 Cars
  public List<Car> getCarList() {

    // 輸出獲得的 Car Name
    System.out.println(carShopName + "有以下車款");
    for (Car car:carList) {
      System.out.println(car.carName);
    }

    return carList;
  }
}