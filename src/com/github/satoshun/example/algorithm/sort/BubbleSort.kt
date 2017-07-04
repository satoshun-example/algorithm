package com.github.satoshun.example.algorithm.sort

import com.github.satoshun.example.algorithm.swap

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
