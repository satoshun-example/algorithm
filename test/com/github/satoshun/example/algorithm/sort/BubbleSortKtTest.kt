package com.github.satoshun.example.algorithm.sort

import org.hamcrest.CoreMatchers.`is` as _is
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Test

class BubbleSortKtTest {

  @Test fun bubbleSort() {
    assertThat(bubbleSort(listOf()), _is(listOf()))
  }

  @Test fun bubbleSort2() {
    assertThat(bubbleSort(listOf(
        1, 10, 2, 11, 3, 0
    )), _is(listOf(
        0, 1, 2, 3, 10, 11
    )))
  }
}