package com.github.satoshun.example.algorithm.sort

fun _mergeSort(original: List<Int>, target: MutableList<Int>, start: Int, len: Int) {
  val leftEnd = start + len
  val rightEnd = Math.min(start + len + len, original.size)
  var i = 0
  var j = 0

  fun nextLeft() = start + i
  fun nextRight() = start + len + j
  fun nextIndex() = start + i + j

  while (true) {
    if (leftEnd <= nextLeft() && rightEnd <= nextRight()) break
    if (leftEnd <= nextLeft()) {
      target[nextIndex()] = original[nextRight()]
      j++
      continue
    }
    if (rightEnd <= nextRight()) {
      target[nextIndex()] = original[nextLeft()]
      i++
      continue
    }
    if (original[nextLeft()] >= original[nextRight()]) {
      target[nextIndex()] = original[nextRight()]
      j++
    } else {
      target[nextIndex()] = original[nextLeft()]
      i++
    }
  }
}

private fun _ranges(size: Int): List<Int> {
  var step = 1
  val range = mutableListOf<Int>()
  while (step <= size) {
    range += step
    step *= 2
  }
  return range
}

fun mergeSort(original: List<Int>): List<Int> {
  var target = original.toMutableList()
  val ranges = _ranges(original.size)
  for (step in ranges) {
    val m = target.toMutableList()
    for (i in 0..target.size step step * 2) {
      _mergeSort(target, m, i, step)
    }
    target = m
  }
  return target
}
