package com.github.satoshun.example.algorithm.sort

import com.github.satoshun.example.algorithm.swap

fun insertionSort(o: List<Int>): List<Int> {
  val m = o.toMutableList()
  for (i in 1 until o.size) {
    for (j in i downTo 1) {
      if (m[j] < m[j - 1]) m.swap(j, j-1)
    }
  }
  return m
}
