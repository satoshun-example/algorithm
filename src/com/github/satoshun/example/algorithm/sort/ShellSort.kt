package com.github.satoshun.example.algorithm.sort

import com.github.satoshun.example.algorithm.swap

private val GAPS = arrayOf(5, 3, 1)

fun shellSort(o: List<Int>): List<Int> {
  val m = o.toMutableList()
  for (gap in GAPS) {
    shellSort(m, gap)
  }
  return m
}

fun shellSort(o: MutableList<Int>, gap: Int) {
  for (g in 0 until gap) {
    for (i in gap + g until o.size step gap) {
      for (j in i downTo gap + g step gap) {
        if (o[j] < o[j - gap]) o.swap(j, j - gap)
      }
    }
  }
}
