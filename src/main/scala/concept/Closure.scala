package concept

class Closure {
    var greeting = "hello"

    def sayHello( name : String): Unit = {
        println(s"$greeting, $name")
    }
}
