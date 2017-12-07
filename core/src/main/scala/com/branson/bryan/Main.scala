package com.branson.bryan

import com.branson.bryan.typeclasses.{Json, Person}
import com.branson.bryan.typeclasses.JsonWriterInstances._
import com.branson.bryan.typeclasses.JsonSyntax._


object Main {
  def main(args: Array[String]): Unit = {
    println("Type Class Examples")

    println(Json.toJson(Person("Foo", "bar@email.com")))

    println(Person("Blah Dee Blah", "blah@email.com").toJson)
  }
}
