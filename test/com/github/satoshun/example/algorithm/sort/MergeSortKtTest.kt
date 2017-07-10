package com.github.satoshun.example.algorithm.sort

import com.google.common.truth.Truth
import org.junit.Test

class MergeSortKtTest {

  @Test fun _mergeSort() {
    Truth.assertThat(
        mergeSort(
            listOf(1, 3, 4, 2, 15, 5, 8, 7, 6, 14, 11, 10, 9, 12, 13)
        )
    ).isEqualTo((1..15).toList())
  }
}
