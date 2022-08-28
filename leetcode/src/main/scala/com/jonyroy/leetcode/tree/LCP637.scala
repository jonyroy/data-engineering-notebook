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
 * https://leetcode.com/problems/average-of-levels-in-binary-tree/
 */
object LCP637 {

  def averageOfLevels(root: TreeNode): Array[Double] = {
    import scala.collection.mutable

    case class BfsNode(level: Int, node: TreeNode)
    case class LevelInfo(nodeValueSum: Long, numOfNodes: Int)

    def bfs(root: TreeNode): Array[Double] = {
      val queue = mutable.Queue[BfsNode]()
      val acc = mutable.SortedMap[Int, LevelInfo]()
      queue.enqueue(BfsNode(1, root))

      while (queue.nonEmpty) {
        val currentNode = queue.dequeue()
        val nodeInfo = acc.get(currentNode.level)
        if (nodeInfo.isEmpty) acc.update(currentNode.level, LevelInfo(currentNode.node.value, 1))
        else {
          nodeInfo.foreach { elem =>
            acc.update(currentNode.level, LevelInfo(elem.nodeValueSum + currentNode.node.value, elem.numOfNodes + 1))
          }
        }
        if (currentNode.node.left != null) queue.enqueue(BfsNode(currentNode.level + 1, currentNode.node.left))
        if (currentNode.node.right != null) queue.enqueue(BfsNode(currentNode.level + 1, currentNode.node.right))
      }

      acc.map { case (_, value) => value.nodeValueSum.toDouble / value.numOfNodes.toDouble }.toArray
    }

    bfs(root)
  }
}
