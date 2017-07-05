package com.github.satoshun.example.algorithm.sort

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.Test

class InsertionSortKtTest {
  @Test fun insertionSort() {
    MatcherAssert.assertThat(insertionSort(listOf()), CoreMatchers.`is`(listOf()))
  }

  @Test fun insertionSort2() {
    MatcherAssert.assertThat(insertionSort(listOf(
        1, 10, 2, 11, 3, 0
    )), CoreMatchers.`is`(listOf(
        0, 1, 2, 3, 10, 11
    )))
  }
}
