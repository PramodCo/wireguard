package com.wireguard.android.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0086\u0002J\u0018\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0018\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0010\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0014H\u0002R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\"\u0010\r\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000e\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/wireguard/android/util/ErrorMessages;", "", "()V", "BCE_REASON_MAP", "", "Lcom/wireguard/config/BadConfigException$Reason;", "", "BE_REASON_MAP", "Lcom/wireguard/android/backend/BackendException$Reason;", "KFE_FORMAT_MAP", "Lcom/wireguard/crypto/Key$Format;", "KFE_TYPE_MAP", "Lcom/wireguard/crypto/KeyFormatException$Type;", "PE_CLASS_MAP", "Ljava/lang/Class;", "RSE_REASON_MAP", "Lcom/wireguard/android/util/RootShell$RootShellException$Reason;", "get", "", "throwable", "", "getBadConfigExceptionExplanation", "resources", "Landroid/content/res/Resources;", "bce", "Lcom/wireguard/config/BadConfigException;", "getBadConfigExceptionReason", "rootCause", "ui_debug"})
public final class ErrorMessages {
    private static final java.util.Map<com.wireguard.config.BadConfigException.Reason, java.lang.Integer> BCE_REASON_MAP = null;
    private static final java.util.Map<com.wireguard.android.backend.BackendException.Reason, java.lang.Integer> BE_REASON_MAP = null;
    private static final java.util.Map<com.wireguard.crypto.Key.Format, java.lang.Integer> KFE_FORMAT_MAP = null;
    private static final java.util.Map<com.wireguard.crypto.KeyFormatException.Type, java.lang.Integer> KFE_TYPE_MAP = null;
    private static final java.util.Map<java.lang.Class<? extends java.lang.Object>, java.lang.Integer> PE_CLASS_MAP = null;
    private static final java.util.Map<com.wireguard.android.util.RootShell.RootShellException.Reason, java.lang.Integer> RSE_REASON_MAP = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.wireguard.android.util.ErrorMessages INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String get(@org.jetbrains.annotations.Nullable()
    java.lang.Throwable throwable) {
        return null;
    }
    
    private final java.lang.String getBadConfigExceptionExplanation(android.content.res.Resources resources, com.wireguard.config.BadConfigException bce) {
        return null;
    }
    
    private final java.lang.String getBadConfigExceptionReason(android.content.res.Resources resources, com.wireguard.config.BadConfigException bce) {
        return null;
    }
    
    private final java.lang.Throwable rootCause(java.lang.Throwable throwable) {
        return null;
    }
    
    private ErrorMessages() {
        super();
    }
}