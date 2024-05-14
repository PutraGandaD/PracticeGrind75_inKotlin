fun invertTree(root: TreeNode?): TreeNode? {
    root ?: return null

    val temp = root.left // save root left to temp
    root.left = invertTree(root.right) // recursive, invert right root and place it to root left
    root.right = invertTree(temp) // recursive, invert left root (we prev save on temp), and place it to root right

    return root // return root of the tree
}

fun main() {

}