package workshop

import org.scalacheck._, Prop._

object WorkshopProp extends Properties("Workshop") {
  import Workshop._

  property("Addition commutes") = forAll(
    (x: Int, y: Int) => addition(x, y) == addition(y, x))
}
