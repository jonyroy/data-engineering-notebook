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
 * https://leetcode.com/problems/even-odd-tree/
 */
object LCP1609 {
  def isEvenOddTree(root: TreeNode): Boolean = {
    val q = scala.collection.mutable.Queue[TreeNode]()
    q.enqueue(root)

    var isLevelEven: Boolean = true

    while (q.nonEmpty) {
      val levelNodes = scala.collection.mutable.ArrayBuffer[Int]()
      val qSize = q.size
      for (_ <- 0 until qSize) {
        val node = q.dequeue()
        levelNodes += node.value
        if (node.left != null) q.enqueue(node.left)
        if (node.right != null) q.enqueue(node.right)
      }

      val levelNodeSize = levelNodes.size

      if (isLevelEven) {
        if (levelNodeSize == 1 && levelNodes(0) % 2 == 0) {
          return false
        }
        val isIncreasing = (1 until levelNodeSize).forall { elm =>
          levelNodes(elm - 1) % 2 == 1 && levelNodes(elm) % 2 == 1 && levelNodes(elm - 1) < levelNodes(elm)
        }
        if (!isIncreasing) return false
      } else {
        if (levelNodeSize == 1 && levelNodes(0) % 2 == 1) {
          return false
        }
        val isDecreasing = (1 until levelNodeSize).forall { elm =>
          levelNodes(elm - 1) % 2 == 0 && levelNodes(elm) % 2 == 0 && levelNodes(elm - 1) > levelNodes(elm)
        }
        if (!isDecreasing) return false
      }

      isLevelEven = !isLevelEven
    }
    true
  }
}
