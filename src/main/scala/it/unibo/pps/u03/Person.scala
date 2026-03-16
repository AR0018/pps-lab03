package it.unibo.pps.u03

import it.unibo.pps.u03.Person.Person.Teacher

object Person:
  import u03.Sequences.*
  import u03.Sequences.Sequence.*
  // An ADT : type + module
  enum Person :
    case Student ( name : String , year : Int )
    case Teacher ( name : String , course : String )

  def name (p : Person ): String = p match
    case Person.Student (n , _) => n
    case Person.Teacher (n , _) => n

  // a method outside the Person module
  def isStudent (p : Person ): Boolean = p match
    case Person.Student (_ , _) => true
    case _ => false

  def extractCourses (s: Sequence[Person]): Sequence[String] =
    map(filter(s)(x => !isStudent(x)))(p => p match
      case Person.Teacher(n, c) => c
    )