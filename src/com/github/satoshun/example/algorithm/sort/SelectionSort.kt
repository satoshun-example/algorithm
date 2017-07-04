package com.github.satoshun.example.algorithm.sort

import com.github.satoshun.example.algorithm.swap

fun selectionSort(s: List<Int>): List<Int> {
  val ss = s.toMutableList()
  for (i in 1 until ss.size) {
    var v = ss.size - i
    for (j in ss.size - i downTo 0) {
      if (ss[j] > ss[v]) {
        v = j
      }
    }
    ss.swap(v, ss.size - i)
  }
  return ss
}
