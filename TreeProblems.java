/*
 * *** Evan Polk - Section 002 ***
 *
 * This java file contains several simple tree problems that need to be
 * codified. These routines  must use the TreeMap and TreeSet library
 * classes from the Java Collection Framework.
 *
 */

import java.util.*;

public class TreeProblems {

  /**
   * Method different()
   *
   * Given two TreeSets of integers, return a TreeSet containing all elements
   * that are NOT in both sets. In other words, return a TreeSet of all the
   * elements that are in one set but not the other.
   */

  public static Set<Integer> different(Set<Integer> setA, Set<Integer> setB) {
    TreeSet<Integer> result = new TreeSet<>();
    for (int num : setA) {
      if (!setB.contains(num)) {
        result.add(num);
      }
    }
    for (int num : setB) {
      if (!setA.contains(num)) {
        result.add(num);
      }
    }
    return result;
  }

  /**
   * Method removeEven()
   *
   * Given a treeMap with the key as an integer, and the value as a String,
   * remove all <key, value> pairs where the key is even.
   */

  public static void removeEven(Map<Integer, String> treeMap) {
    Iterator<Integer> iter = treeMap.keySet().iterator();
    while (iter.hasNext()) {
      int val = iter.next();
      if (val % 2 == 0) {
        iter.remove();
      }
    }
    return;
  }

  /**
   * Method treesEqual()
   *
   * Given two treeMaps, each with the key as an integer, and the value as a
   * String,
   * return a boolean value indicating if the two trees are equal or not.
   */

  public boolean treesEqual(Map<Integer, String> tree1, Map<Integer, String> tree2) {
    Set<Integer> keySet1 = tree1.keySet();
    Set<Integer> keySet2 = tree2.keySet();
    for (int key : keySet1) {
      if (!tree2.containsKey(key) || !tree1.get(key).equals(tree2.get(key))) {
        return false;
      }
    }
    for (int key : keySet2) {
      if (!tree1.containsKey(key) || !tree2.get(key).equals(tree1.get(key))) {
        return false;
      }
    }
    return true;
  }

} // end treeProblems class
