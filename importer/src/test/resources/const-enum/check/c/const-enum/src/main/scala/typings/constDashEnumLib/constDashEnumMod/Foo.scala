package typings
package constDashEnumLib.constDashEnumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - constDashEnumLib.constDashEnumLibNumbers.`1`
  - constDashEnumLib.constDashEnumLibNumbers.`22`
  - constDashEnumLib.constDashEnumLibStrings.C
*/
trait Foo extends js.Object

object Foo {
  @scala.inline
  def A: constDashEnumLib.constDashEnumLibNumbers.`1` = this.cast(1)
  @scala.inline
  def B: constDashEnumLib.constDashEnumLibNumbers.`22` = this.cast(22)
  @scala.inline
  def C: constDashEnumLib.constDashEnumLibStrings.C = this.cast("C")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}
