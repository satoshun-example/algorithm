package com.github.satoshun.example.algorithm.sort

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.Test

class ShellSortKtTest {

  @Test fun shellSort() {
    MatcherAssert.assertThat(shellSort(listOf()), CoreMatchers.`is`(listOf()))
  }

  @Test fun shellSort2() {
    MatcherAssert.assertThat(shellSort(listOf(
        1, 8, 9, 10, 2, 11, 3, 0, 4, 6, 7, 5
    )), CoreMatchers.`is`(listOf(
        0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11
    )))
  }
}
