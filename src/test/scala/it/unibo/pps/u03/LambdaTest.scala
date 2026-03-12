package it.unibo.pps.u03

abstract class LambdaTest:
  import it.unibo.pps.u03.Lambda.*

  def toBoolean(l: L): Boolean =
    val l1: L = x => x
    l(l)(l1) match
      case res if (res == l) => true
      case res if (res == l1) => false
      case _ => ??? // throws an Exception
