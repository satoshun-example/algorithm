package com.github.satoshun.example.algorithm.sort

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Test

class SelectionSortKtTest {

  @Test fun selectionSort() {
    assertThat(selectionSort(listOf()), CoreMatchers.`is`(listOf()))
  }

  @Test fun selectionSort2() {
    assertThat(selectionSort(listOf(
        1, 10, 2, 11, 3, 0
    )), CoreMatchers.`is`(listOf(
        0, 1, 2, 3, 10, 11
    )))
  }
}
