package com.github.satoshun.example.algorithm.sort

fun quickSort(o: List<Int>): List<Int> {
  val oo = o.toMutableList()
  quickSort(oo, 0, oo.size - 1)
  return oo
}

private fun quickSort(o: MutableList<Int>, left: Int, right: Int) {
  if (left >= right) return
  val pivot = (left + right) / 2
  val criteria = o[pivot]

  var i = left
  var j = right
  while (true) {
    try {
      while (o[i] > criteria) i++
      while (o[j] < criteria) j--
    } catch (ex: IndexOutOfBoundsException) {
      break
    }
    o.swap(i, j)
    i++
    j--
  }

  quickSort(o, left, pivot)
  quickSort(o, pivot + 1, right)
}
