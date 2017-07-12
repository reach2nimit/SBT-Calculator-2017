package edu.knoldus

class Calculator {

  def add(a: Int, b: Int): Int = a + b

  def subtract(a: Int, b: Int): Int = a - b


  def multiply(a: Int, b: Int): Int = a * b

  def divide(a: Int, b: Int): Int = {
    require(b != 0)
    a / b
  }

  def power(base: Int, exp: Int): Int = {

    if (exp == 0) 1
    else base * power(base, exp - 1)
  }


  def modulus(a: Int, b: Int): Int = a % b

  def absolute(a: Int): Int = {
    if (a < 0) -a
    else a
  }

  def max(a: Int, b: Int): Int = {
    if (a > b) a
    else b
  }

  def min(a: Int, b: Int): Int = {
    if (a < b) a
    else b
  }

}
