import datastructure.ListNode
import scala.annotation.tailrec
//21. Merge Two Sorted Lists
class MergeTwoSortedLists {
  def mergeTwoLists(l1: ListNode, l2: ListNode): ListNode = {
    if(l1 == null) return l2
    if(l2 == null) return l1
    helper(l1, l2, null, null)
  }

  @tailrec
  final def helper(l1 : ListNode, l2 : ListNode, head : ListNode = null, tail : ListNode = null) : ListNode = {
    if(l1 == null) {
      if(tail == null) l2
      else {
        tail.next = l2
        head
      }
    }
    else if(l2 == null){
      if(tail == null) l1
      else {
        tail.next = l1
        head
      }
    }
    else if (l1.x > l2.x){
      if(tail != null)
        tail.next = l2

      helper(l1, l2.next, if(head == null) l2 else head, l2)
    }
    else {
      if(tail != null)
        tail.next = l1

      helper(l1.next, l2, if(head == null) l1 else head, l1)
    }
  }
}
