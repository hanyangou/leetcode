package leetcode

//268 missing number
class MissingNumber {
  def solution(nums : Array[Int]) : Int = {
    val n = nums.length
    val exp = ( 1 + n ) * n / 2
    val act = nums.sum
    return exp - act
  }
}
