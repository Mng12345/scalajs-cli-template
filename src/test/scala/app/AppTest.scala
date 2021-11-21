package app

import utest.{TestSuite, Tests, test}

object AppTest extends TestSuite {

  def tests = Tests {
    test("hello world") {
      assert(1 == 1)
    }
  }
}