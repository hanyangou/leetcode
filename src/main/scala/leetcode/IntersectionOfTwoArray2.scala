package leetcode

import scala.collection.mutable.ListBuffer
//350 Intersection of Two Arrays II
class IntersectionOfTwoArray2 {
  def intersect(nums1: Array[Int], nums2: Array[Int]): Array[Int] = {
    // mapping all the elements with their occurance in the map
    var num1Map : Map[Int, Int] = nums1.groupBy(identity).mapValues(_.length)
    val mutableMap = collection.mutable.Map(num1Map.toSeq: _*)
    var r = new ListBuffer[Int]()
    nums2.foreach( n => {
      if(mutableMap.contains(n) && mutableMap(n) != 0){
        r += n
        //num1Map = num1Map.updated(n,num1Map(n) - 1)
        mutableMap.update(n, mutableMap(n) - 1)
      }
    })
    r.toArray
  }
}
