package com.github.satoshun.example.algorithm.sort

fun bubbleSort(s: List<Int>): List<Int> {
  val ss = s.toMutableList()
  for (i in 0..ss.size - 2) {
    for (j in 0..ss.size - 2 - i) {
      if (ss[j] > ss[j + 1]) {
        ss.swap(j, j + 1)
      }
    }
  }
  return ss
}

fun <T> MutableList<T>.swap(index1: Int, index2: Int) {
  val tmp = this[index1]
  this[index1] = this[index2]
  this[index2] = tmp
}
