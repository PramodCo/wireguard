package com.wireguard.android.databinding;

import java.lang.System;

/**
 * KeyedArrayList that enforces uniqueness and sorted order across the set of keys. This class uses
 * binary search to improve lookup and replacement times to O(log(n)). However, due to the
 * array-based nature of this class, insertion and removal of elements with anything but the largest
 * key still require O(n) time.
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\n\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0010\b\u0001\u0010\u0002*\n\u0012\u0006\b\u0001\u0012\u0002H\u00010\u00032\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0004:\u0001\u001dB\u0015\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u0006\u00a2\u0006\u0002\u0010\u0007J\u0015\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00028\u0001H\u0016\u00a2\u0006\u0002\u0010\rJ\u001d\u0010\n\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\f\u001a\u00028\u0001H\u0016\u00a2\u0006\u0002\u0010\u0011J\u001e\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0014H\u0016J\u0016\u0010\u0012\u001a\u00020\u000b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0014H\u0016J\u0015\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00028\u0001H\u0002\u00a2\u0006\u0002\u0010\u0017J\u0015\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\u001aJ\u001e\u0010\u001b\u001a\u00028\u00012\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\f\u001a\u00028\u0001H\u0096\u0002\u00a2\u0006\u0002\u0010\u001cR\u0016\u0010\u0005\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lcom/wireguard/android/databinding/ObservableSortedKeyedArrayList;", "K", "E", "Lcom/wireguard/android/databinding/Keyed;", "Lcom/wireguard/android/databinding/ObservableKeyedArrayList;", "comparator", "Ljava/util/Comparator;", "(Ljava/util/Comparator;)V", "keyList", "Lcom/wireguard/android/databinding/ObservableSortedKeyedArrayList$KeyList;", "add", "", "element", "(Lcom/wireguard/android/databinding/Keyed;)Z", "", "index", "", "(ILcom/wireguard/android/databinding/Keyed;)V", "addAll", "elements", "", "getInsertionPoint", "e", "(Lcom/wireguard/android/databinding/Keyed;)I", "indexOfKey", "key", "(Ljava/lang/Object;)I", "set", "(ILcom/wireguard/android/databinding/Keyed;)Lcom/wireguard/android/databinding/Keyed;", "KeyList", "ui_debug"})
public final class ObservableSortedKeyedArrayList<K extends java.lang.Object, E extends com.wireguard.android.databinding.Keyed<? extends K>> extends com.wireguard.android.databinding.ObservableKeyedArrayList<K, E> {
    private final transient com.wireguard.android.databinding.ObservableSortedKeyedArrayList.KeyList<K, E> keyList = null;
    private final java.util.Comparator<? super K> comparator = null;
    
    @java.lang.Override()
    public boolean add(@org.jetbrains.annotations.NotNull()
    E element) {
        return false;
    }
    
    @java.lang.Override()
    public void add(int index, @org.jetbrains.annotations.NotNull()
    E element) {
    }
    
    @java.lang.Override()
    public boolean addAll(@org.jetbrains.annotations.NotNull()
    java.util.Collection<? extends E> elements) {
        return false;
    }
    
    @java.lang.Override()
    public boolean addAll(int index, @org.jetbrains.annotations.NotNull()
    java.util.Collection<? extends E> elements) {
        return false;
    }
    
    private final int getInsertionPoint(E e) {
        return 0;
    }
    
    @java.lang.Override()
    public int indexOfKey(K key) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public E set(int index, @org.jetbrains.annotations.NotNull()
    E element) {
        return null;
    }
    
    public ObservableSortedKeyedArrayList(@org.jetbrains.annotations.NotNull()
    java.util.Comparator<? super K> comparator) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0010\b\u0003\u0010\u0002*\n\u0012\u0006\b\u0001\u0012\u0002H\u00010\u00032\b\u0012\u0004\u0012\u0002H\u00010\u00042\b\u0012\u0004\u0012\u0002H\u00010\u0005B\u0019\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0007\u00a2\u0006\u0002\u0010\bJ\u0016\u0010\r\u001a\u00028\u00022\u0006\u0010\u000e\u001a\u00020\nH\u0096\u0002\u00a2\u0006\u0002\u0010\u000fJ\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00020\u0011H\u0016R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0012"}, d2 = {"Lcom/wireguard/android/databinding/ObservableSortedKeyedArrayList$KeyList;", "K", "E", "Lcom/wireguard/android/databinding/Keyed;", "Ljava/util/AbstractList;", "", "list", "Lcom/wireguard/android/databinding/ObservableSortedKeyedArrayList;", "(Lcom/wireguard/android/databinding/ObservableSortedKeyedArrayList;)V", "size", "", "getSize", "()I", "get", "index", "(I)Ljava/lang/Object;", "spliterator", "Ljava/util/Spliterator;", "ui_debug"})
    static final class KeyList<K extends java.lang.Object, E extends com.wireguard.android.databinding.Keyed<? extends K>> extends java.util.AbstractList<K> implements java.util.Set<K>, kotlin.jvm.internal.markers.KMappedMarker {
        private final com.wireguard.android.databinding.ObservableSortedKeyedArrayList<K, E> list = null;
        
        @java.lang.Override()
        public K get(int index) {
            return null;
        }
        
        @java.lang.Override()
        public int getSize() {
            return 0;
        }
        
        @java.lang.Override()
        public final int size() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.util.Spliterator<K> spliterator() {
            return null;
        }
        
        public KeyList(@org.jetbrains.annotations.NotNull()
        com.wireguard.android.databinding.ObservableSortedKeyedArrayList<K, E> list) {
            super();
        }
        
        @java.lang.Override()
        public java.lang.Object removeAt(int p0) {
            return null;
        }
        
        @java.lang.Override()
        public final K remove(int p0) {
            return null;
        }
    }
}