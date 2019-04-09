import leetcode.IntersectionOfTwoArray2

object Main {
  def main(args: Array[String]) : Unit = {
    val arr = List("apple", "orange", "apple", "dog", "dog", "dog", "dog")
    val solution = new IntersectionOfTwoArray2()
    val ans = solution.intersect( Array(1,2,2,1), Array(2,2,1))
    ans.foreach(println(_))
//    val map1 = collection.mutable.Map[Int, Int]()
//    map1 += (1 -> 1, 2 -> 1)
//    var map2 : collection.mutable.Map[Int, Int] = collection.mutable.Map.empty
//    map2 ++= map1
  }
}
