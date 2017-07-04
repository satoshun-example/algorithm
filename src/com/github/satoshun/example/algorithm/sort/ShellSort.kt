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
    for (i in g until o.size step gap) {
      var m = i
      for (j in i until o.size step gap) {
        if (o[m] > o[j]) {
          m = j
        }
      }
      o.swap(m, i)
    }
  }
}
