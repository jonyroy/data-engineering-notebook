package com.playground.roy

import scala.collection.mutable
import scala.collection.mutable.ListBuffer

object Main extends App {

  case class Tree(value: Int, var left: Option[Tree], var right: Option[Tree])
  case class TreeNode(value: Int, var left: TreeNode, var right: TreeNode)

  def constructBinaryTree(arr: Array[Int], currentIndex: Int, numOfNodes: Int): Option[Tree] = {
    if (currentIndex < numOfNodes) {
      val tree = Tree(arr(currentIndex), None, None)
      tree.left = constructBinaryTree(arr, 2 * currentIndex + 1, numOfNodes)
      tree.right = constructBinaryTree(arr, 2 * currentIndex + 2, numOfNodes)
      Some(tree)
    } else {
      None
    }
  }

  def constructBinaryTreeV2(arr: Array[Option[Int]], currentIndex: Int, numOfNodes: Int): TreeNode = {
    if (currentIndex < numOfNodes) {
      if (arr(currentIndex).isEmpty) {
        null
      } else {
        val tree = TreeNode(arr(currentIndex).get, null, null)
        tree.left = constructBinaryTreeV2(arr, 2 * currentIndex + 1, numOfNodes)
        tree.right = constructBinaryTreeV2(arr, 2 * currentIndex + 2, numOfNodes)
        tree
      }
    } else {
      null
    }
  }

  def convertTreeToArray(root: Option[Tree]): Array[Int] = {
    val queue = new mutable.Queue[Option[Tree]]()
    val acc = mutable.MutableList[Int]()
    queue.enqueue(root)
    while (queue.nonEmpty) {
      val currentNode = queue.dequeue()
      acc ++= currentNode.map(_.value).toList
      if (currentNode.flatMap(_.left).nonEmpty) queue.enqueue(currentNode.flatMap(_.left))
      if (currentNode.flatMap(_.right).nonEmpty) queue.enqueue(currentNode.flatMap(_.right))
    }
    acc.toArray
  }

  def convertTreeToArrayV2(root: TreeNode): Array[Option[Int]] = {
    import scala.collection.mutable
    val queue = new mutable.Queue[TreeNode]()
    val acc = mutable.MutableList[Option[Int]]()
    queue.enqueue(root)
    while (queue.nonEmpty) {
      val currentNode = queue.dequeue()
      if (currentNode != null) {
        acc += Some(currentNode.value)
        queue.enqueue(currentNode.left)
        queue.enqueue(currentNode.right)
      } else {
        acc += None
      }
    }
    acc.toArray
  }

  def sumTwoArray(arr1: Array[Option[Int]], arr2: Array[Option[Int]]): Array[Option[Int]] = {
    if(arr1.length > arr2.length) {
      arr1.zipWithIndex.map { case (elem, index) ⇒
        if(index < arr2.length) {
         if(elem.nonEmpty || arr2(index).nonEmpty) Some(elem.getOrElse(0) + arr2(index).getOrElse(0)) else None
        } else {
          elem
        }
      }
    } else {
      arr2.zipWithIndex.map { case (elem, index) ⇒
        if(index < arr1.length) {
          if(elem.nonEmpty || arr1(index).nonEmpty) Some(elem.getOrElse(0) + arr1(index).getOrElse(0)) else None
        } else {
          elem
        }
      }
    }
  }

  implicit class ToOption[T](v: T) {
    def toOption: Option[T] = Option(v)
  }

  def findMaxTreeHeight(root: Option[Tree]) = {}

  def traverseBinaryTree(root: Option[Tree], acc: List[Int]): List[Int] = {
    if (root.isEmpty) return acc
    val a = traverseBinaryTree(root.flatMap(_.left), acc ++ root.map(_.value).toList)
    val b = traverseBinaryTree(root.flatMap(_.right), acc ++ root.map(_.value).toList)

    a ++ b
  }

  def sumOfLeftLeaves(root: TreeNode): Int = {
    def leftLeavesSum(root: TreeNode, isLeft: Boolean): Int = {
      if(root.left == null && root.right == null) {
        if(isLeft) return root.value else return 0
      }
      leftLeavesSum(root.left, isLeft = true) + leftLeavesSum(root.right, isLeft = false)
    }
    leftLeavesSum(root, isLeft = false)
  }

  def rangeSumBST(root: TreeNode, low: Int, high: Int): Int = {
    import scala.collection.mutable
    val queue = new mutable.Queue[Int]()
    def evaluateRangeSum(root: TreeNode): Int = {
      if(root == null) return 0
      if(root.left == null && root.right == null) {
        if(root.value >= low && root.value <= high) return root.value else return 0
      }
      val value = if(root.value >= low && root.value <= high) root.value else 0
      evaluateRangeSum(root.left) + value + evaluateRangeSum(root.right)
    }
    evaluateRangeSum(root)
  }

  def mergeTrees(root1: TreeNode, root2: TreeNode): TreeNode = {

    def constructBinaryTreeV2(arr: Array[Option[Int]], currentIndex: Int, numOfNodes: Int): TreeNode = {
      if (currentIndex < numOfNodes) {
        if (arr(currentIndex).isEmpty) {
          null
        } else {
          val tree = TreeNode(arr(currentIndex).get, null, null)
          tree.left = constructBinaryTreeV2(arr, 2 * currentIndex + 1, numOfNodes)
          tree.right = constructBinaryTreeV2(arr, 2 * currentIndex + 2, numOfNodes)
          tree
        }
      } else {
        null
      }
    }

    def sumTwoArray(arr1: Array[Option[Int]], arr2: Array[Option[Int]]): Array[Option[Int]] = {
      if(arr1.length > arr2.length) {
        arr1.zipWithIndex.map { case (elem, index) ⇒
          if(index < arr2.length) {
            if(elem.nonEmpty || arr2(index).nonEmpty) Some(elem.getOrElse(0) + arr2(index).getOrElse(0)) else None
          } else {
            elem
          }
        }
      } else {
        arr2.zipWithIndex.map { case (elem, index) ⇒
          if(index < arr1.length) {
            if(elem.nonEmpty || arr1(index).nonEmpty) Some(elem.getOrElse(0) + arr1(index).getOrElse(0)) else None
          } else {
            elem
          }
        }
      }
    }

    def convertTreeToArrayV2(root: TreeNode): Array[Option[Int]] = {
      import scala.collection.mutable.{Queue, ListBuffer}
      val queue = new Queue[TreeNode]()
      val acc = new ListBuffer[Option[Int]]()
      queue.enqueue(root)
      while (queue.nonEmpty) {
        val currentNode = queue.dequeue()
        if (currentNode != null) {
          acc += Some(currentNode.value)
          if(currentNode.left != null)
          queue.enqueue(currentNode.left)
          if(currentNode.right != null)
          queue.enqueue(currentNode.right)
        } else {
          acc += None
        }
      }
      acc.toArray
    }

    val arr1 = convertTreeToArrayV2(root1)
    val arr2 = convertTreeToArrayV2(root2)
    val arr3 = sumTwoArray(arr1, arr2)
    constructBinaryTreeV2(arr3, 0, arr3.length)

  }

  def leavesNode(root: TreeNode): Seq[Int] = {
    if (root.left == null && root.right == null) return Seq(root.value)
    leavesNode(root.left) ++ leavesNode(root.right)
  }

  val arr: Array[Option[Int]] =
    Array(3, 9, 20, null, null, 15, 7).map(elem => if (elem != null) Some(elem.asInstanceOf[Int]) else None)

  //val arr = Array[Option[Int]](Some(3), Some(9), Some(20), None, None, Some(15), Some(7))

  val tree = constructBinaryTreeV2(arr, 0, arr.length)
  println(tree)

  println(sumOfLeftLeaves(tree))

  //val tree = constructBinaryTree(arr, 0, arr.length)

  //println(traverseBinaryTree(tree, List.empty[Int]))
  //println(convertTreeToArray(tree))

}
