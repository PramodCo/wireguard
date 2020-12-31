package com.wireguard.android.databinding;

import java.lang.System;

/**
 * Interface for objects that have a identifying key of the given type.
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002R\u0012\u0010\u0003\u001a\u00028\u0000X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/wireguard/android/databinding/Keyed;", "K", "", "key", "getKey", "()Ljava/lang/Object;", "ui_debug"})
public abstract interface Keyed<K extends java.lang.Object> {
    
    public abstract K getKey();
}