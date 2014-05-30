/**
 * ScalaTest, JUnit tests for Knuth, Morris, Pratt
 * @see http://algs4.cs.princeton.edu/53substring/KMP.java.html
 */
package org.gs.search

import org.junit.runner.RunWith
import org.scalatest.FlatSpec
import org.scalatest.junit.JUnitRunner
import org.gs.fixtures.WordArrayBuilder

/**
 * @author Gary Struthers
 *
 */
@RunWith(classOf[JUnitRunner])
class KMPSuite extends FlatSpec {
  behavior of "a KMP"

  it should "search for the pattern in the text using the KMP algorithm" in {
    val pattern = "abracadabra".toCharArray
    val kmp = new KMP(pattern)
    val text = "abacadabrabracabracadabrabrabracad".toCharArray
    val offset = kmp.search(text)
    assert(offset < text.length, "pattern not found")
    assert(offset === 14, s"wrong offset:$offset")
  }
}