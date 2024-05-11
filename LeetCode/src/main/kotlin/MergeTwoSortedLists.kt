fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
    var l1 = list1
    var l2 = list2
    var dummy: ListNode? = ListNode(0) // define dummy Listnode as empty ListNode
    var tail = dummy // pointer (it always hold reference to the last node of dummy nodes as a starting point)

    while (l1 != null && l2 != null) {
        if (l1.`val` <= l2.`val`) { // if value of the current pointer node of l1 is less than l2
            tail!!.next = ListNode(l1.`val`) // set tail
            l1 = l1.next // update pointer of l1 for next comparation
        } else {
            tail!!.next = ListNode(l2.`val`) // set tail
            l2 = l2.next // update pointer of l2
        }
        tail = tail!!.next // update pointer of tail to the last node of dummy nodes
    }

    // handle condition if one of the listnodes is empty, then merge into the tail
    if(l1 != null) {
        tail!!.next = ListNode(l1.`val`)
    } else if (l2 != null) {
        tail!!.next = ListNode(l2.`val`)
    }

    return dummy!!.next
}

/*
    Visualizer =


 */

fun main() {

}