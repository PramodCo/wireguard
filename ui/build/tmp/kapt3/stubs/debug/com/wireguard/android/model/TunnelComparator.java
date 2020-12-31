package com.wireguard.android.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u0001\tB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016\u00a8\u0006\n"}, d2 = {"Lcom/wireguard/android/model/TunnelComparator;", "Ljava/util/Comparator;", "", "Lkotlin/Comparator;", "()V", "compare", "", "a", "b", "NaturalSortString", "ui_debug"})
public final class TunnelComparator implements java.util.Comparator<java.lang.String> {
    @org.jetbrains.annotations.NotNull()
    public static final com.wireguard.android.model.TunnelComparator INSTANCE = null;
    
    @java.lang.Override()
    public int compare(@org.jetbrains.annotations.NotNull()
    java.lang.String a, @org.jetbrains.annotations.NotNull()
    java.lang.String b) {
        return 0;
    }
    
    private TunnelComparator() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000 \n2\u00020\u0001:\u0002\n\u000bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\f"}, d2 = {"Lcom/wireguard/android/model/TunnelComparator$NaturalSortString;", "", "originalString", "", "(Ljava/lang/String;)V", "tokens", "", "Lcom/wireguard/android/model/TunnelComparator$NaturalSortString$NaturalSortToken;", "getTokens", "()Ljava/util/List;", "Companion", "NaturalSortToken", "ui_debug"})
    static final class NaturalSortString {
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<com.wireguard.android.model.TunnelComparator.NaturalSortString.NaturalSortToken> tokens = null;
        private static final kotlin.text.Regex NATURAL_SORT_DIGIT_FINDER = null;
        private static final kotlin.text.Regex WHITESPACE_FINDER = null;
        @org.jetbrains.annotations.NotNull()
        private static final com.wireguard.android.model.TunnelComparator.NaturalSortString.Companion Companion = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.wireguard.android.model.TunnelComparator.NaturalSortString.NaturalSortToken> getTokens() {
            return null;
        }
        
        public NaturalSortString(@org.jetbrains.annotations.NotNull()
        java.lang.String originalString) {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u0011\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0000H\u0096\u0002R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u000e"}, d2 = {"Lcom/wireguard/android/model/TunnelComparator$NaturalSortString$NaturalSortToken;", "", "maybeString", "", "maybeNumber", "", "(Ljava/lang/String;Ljava/lang/Integer;)V", "getMaybeNumber", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMaybeString", "()Ljava/lang/String;", "compareTo", "other", "ui_debug"})
        public static final class NaturalSortToken implements java.lang.Comparable<com.wireguard.android.model.TunnelComparator.NaturalSortString.NaturalSortToken> {
            @org.jetbrains.annotations.Nullable()
            private final java.lang.String maybeString = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.Integer maybeNumber = null;
            
            @java.lang.Override()
            public int compareTo(@org.jetbrains.annotations.NotNull()
            com.wireguard.android.model.TunnelComparator.NaturalSortString.NaturalSortToken other) {
                return 0;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getMaybeString() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer getMaybeNumber() {
                return null;
            }
            
            public NaturalSortToken(@org.jetbrains.annotations.Nullable()
            java.lang.String maybeString, @org.jetbrains.annotations.Nullable()
            java.lang.Integer maybeNumber) {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/wireguard/android/model/TunnelComparator$NaturalSortString$Companion;", "", "()V", "NATURAL_SORT_DIGIT_FINDER", "Lkotlin/text/Regex;", "WHITESPACE_FINDER", "ui_debug"})
        static final class Companion {
            
            private Companion() {
                super();
            }
        }
    }
}