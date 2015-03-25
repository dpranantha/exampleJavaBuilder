package builder

import org.scalatest._
import org.scalatest.mock._

class BuildPatternSpec extends FlatSpec with Matchers {

  "Cake builder" should "build cake with all their ingredients" in {
    val cake = new Cake.Builder().sugar(1).butter(0.5).eggs(2).vanila(2).flour(1.5).bakingpowder(0.75).milk(0.5).build()
    cake.toString() should be ("Cake{sugar=0.75, butter=0.5, eggs=2, vanila=2, flour=1.5, bakingpowder=0.0, milk=0.5, cherry=0}")
  }

  "Juice builder" should "build juice with all their ingredients" in {
    val names = Array("orange","banana","kiwi")
    val fruits = new NameRepository.Builder().names(names).build()
    val triple = new Juice.Builder().fruit(fruits).sugar(40).water(100).build()
    triple.toString() should be ("Juice{fruit=orange,banana,kiwi, sugar=40.0 gram, water=100.0 cc}")
  }
}
