package com.jonyroy.leetcode.tree

import com.jonyroy.leetcode.common.TreeNode

/**
 * Definition for a binary tree node.
 * class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
 *   var value: Int = _value
 *   var left: TreeNode = _left
 *   var right: TreeNode = _right
 * }
 *
 * https://leetcode.com/problems/deepest-leaves-sum/
 */
object LCP1302 {
  def deepestLeavesSum(root: TreeNode): Int = {

    def bfs(root: TreeNode): Int = {

      case class NodeInfo(height: Int, node: TreeNode)

      val q = scala.collection.mutable.Queue[NodeInfo]()
      q.enqueue(NodeInfo(1, root))
      val acc = scala.collection.mutable.SortedMap[Int, Int]()

      while (q.nonEmpty) {
        val currentNode = q.dequeue()
        if (currentNode.node.left != null) q.enqueue(NodeInfo(currentNode.height + 1, currentNode.node.left))
        if (currentNode.node.right != null) q.enqueue(NodeInfo(currentNode.height + 1, currentNode.node.right))
        if (currentNode.node.left == null && currentNode.node.right == null) {
          val c = acc.get(currentNode.height)
          if (c.isEmpty) acc.update(currentNode.height, currentNode.node.value)
          else c.foreach(elem => acc.update(currentNode.height, elem + currentNode.node.value))
        }
      }

      acc.last._2
    }

    bfs(root)
  }
}
