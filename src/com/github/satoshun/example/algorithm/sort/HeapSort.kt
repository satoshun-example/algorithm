package com.github.satoshun.example.algorithm.sort

import com.github.satoshun.example.algorithm.swap


fun heapSort(o: List<Int>): List<Int> {
  val m = o.toMutableList()
  for (i in m.size - 1 downTo 1) {
    for (j in i downTo 1) {
      if (m[j] > m[(j / 2.0 + 0.5).toInt() - 1]) {
        m.swap(j, (j / 2.0 + 0.5).toInt() - 1)
      }
    }
    m.swap(0, i)
  }
  return m
}
