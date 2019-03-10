package lectures.part1basics

object ValueVariableTypes extends App {
  /**
    * immutables = val
    */
  val int: Int = 10
  val str: String = "Foo Bar"
  val double: Double = 0.2
  val float: Float = 2f
  val long: Long = 1L
  val bigInt: BigInt = 1000000000

  /**
    * mutables = var (side effects)
    */
  var x = "test"
  x = "foo"
}
