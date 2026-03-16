package it.unibo.pps.u03

import Person.*
import org.junit.*
import org.junit.Assert.*
import u03.Optionals.Optional.{Empty, Just}

class PersonSequencesTest:
  import u03.Sequences.*
  import Sequence.*
  
  val people = Cons(
    Person.Student("Mario", 2023),
    Cons(
      Person.Teacher("Vittorio", "Sistemi Operativi"),
      Cons(Person.Teacher("Luigi", "Database"),
        Cons(Person.Student("Alessandro", 2025), Nil())))
  )

  @Test def testExtractCourses() =
    assertEquals(Cons("Sistemi Operativi", Cons("Database", Nil())), extractCourses(people))