package com.rm

object CubeCalculator {
  def main(args: Array[String]): Unit = {
    print(cube(20))
  }
  def cube(x: Int) = {
    x * x * x
  }
}
