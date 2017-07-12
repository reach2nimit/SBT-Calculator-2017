package edu.knoldus

import org.scalatest.FunSuite


class CalculatorTest extends FunSuite {


  test("Get Addition of Two Numbers") {
    val sum: Calculator = new Calculator()
    assert(sum.add(3, 5) === 8)
  }

  test("Get Subtraction of Two Numbers") {
    val sub: Calculator = new Calculator()
    assert(sub.subtract(10, 5) === 5)

    val sub1: Calculator = new Calculator()
    assert(sub1.subtract(10, 15) === -5)
  }

  test("Get Multiplication of Two Numbers") {
    val sub: Calculator = new Calculator()
    assert(sub.multiply(10, 5) === 50)
  }

  test("Get Division of Two Numbers") {
    val div: Calculator = new Calculator()
    assert(div.divide(10, 5) === 2)
  }

  test("Get Division By Zero") {
    intercept[java.lang.IllegalArgumentException] {
      val div1: Calculator = new Calculator()
      div1.divide(10, 0)
    }
  }


  test("Get Modulus of Two Numbers") {
    val mod: Calculator = new Calculator()
    assert(mod.modulus(13, 5) === 3)

    val mod1: Calculator = new Calculator()
    assert(mod1.modulus(110, 5) === 0)
  }

  test("Get Modulus With Zero") {
    intercept[java.lang.IllegalArgumentException] {}
    val mod1: Calculator = new Calculator()
    mod1.modulus(13, 0)

  }

  test("Get Absolute of a Numbers") {
    val abs: Calculator = new Calculator()
    assert(abs.absolute(-5) === 5)

    val abs1: Calculator = new Calculator()
    assert(abs1.absolute(55) === 55)
  }


  test("Get Power of a Number") {
    val power1: Calculator = new Calculator()
    assert(power1.power(10, 2) === 100)

    val power: Calculator = new Calculator()
    assert(power.power(3, 0) === 1)
  }

  test("Get Maximum of Two Numbers") {
    val maximum: Calculator = new Calculator()
    assert(maximum.max(100, 55) === 100)

    val maximum1: Calculator = new Calculator()
    assert(maximum1.max(300, 500) === 500)
  }


  test("Get Minimum of Two Numbers") {
    val minimum: Calculator = new Calculator()
    assert(minimum.min(10, 5) === 5)

    val minimum1: Calculator = new Calculator()
    assert(minimum1.min(3, 5) === 3)
  }
}
