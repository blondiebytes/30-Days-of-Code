/*
 * Copyright 2015 blondiebytes
 */
package binarysearchtree;

/**
 *
 * @author kathrynhodge
 */
public interface Tree<D extends Comparable> {
    public boolean isEmpty();
    public int cardinality();
    public boolean member(D elt);
    public NonEmptyBST<D> add(D elt);
}
