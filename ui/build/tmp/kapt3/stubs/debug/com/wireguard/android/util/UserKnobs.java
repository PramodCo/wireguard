package com.wireguard.android.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001b\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0005H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010!J\u001b\u0010\"\u001a\u00020\u001f2\b\u0010\u0016\u001a\u0004\u0018\u00010\tH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010#J\u001f\u0010$\u001a\u00020\u001f2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\t0\rH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010%R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\r0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0011R\u0019\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0011R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u0011R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u0011R\u001d\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\r0\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u001d\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006&"}, d2 = {"Lcom/wireguard/android/util/UserKnobs;", "", "()V", "ALLOW_REMOTE_CONTROL_INTENTS", "Landroidx/datastore/preferences/Preferences$Key;", "", "DARK_THEME", "DISABLE_KERNEL_MODULE", "LAST_USED_TUNNEL", "", "MULTIPLE_TUNNELS", "RESTORE_ON_BOOT", "RUNNING_TUNNELS", "", "allowRemoteControlIntents", "Lkotlinx/coroutines/flow/Flow;", "getAllowRemoteControlIntents", "()Lkotlinx/coroutines/flow/Flow;", "darkTheme", "getDarkTheme", "disableKernelModule", "getDisableKernelModule", "lastUsedTunnel", "getLastUsedTunnel", "multipleTunnels", "getMultipleTunnels", "restoreOnBoot", "getRestoreOnBoot", "runningTunnels", "getRunningTunnels", "setDisableKernelModule", "", "disable", "(Ljava/lang/Boolean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setLastUsedTunnel", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setRunningTunnels", "(Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ui_debug"})
public final class UserKnobs {
    private static final androidx.datastore.preferences.Preferences.Key<java.lang.Boolean> DISABLE_KERNEL_MODULE = null;
    private static final androidx.datastore.preferences.Preferences.Key<java.lang.Boolean> MULTIPLE_TUNNELS = null;
    private static final androidx.datastore.preferences.Preferences.Key<java.lang.Boolean> DARK_THEME = null;
    private static final androidx.datastore.preferences.Preferences.Key<java.lang.Boolean> ALLOW_REMOTE_CONTROL_INTENTS = null;
    private static final androidx.datastore.preferences.Preferences.Key<java.lang.Boolean> RESTORE_ON_BOOT = null;
    private static final androidx.datastore.preferences.Preferences.Key<java.lang.String> LAST_USED_TUNNEL = null;
    private static final androidx.datastore.preferences.Preferences.Key<java.util.Set<java.lang.String>> RUNNING_TUNNELS = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.wireguard.android.util.UserKnobs INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.lang.Boolean> getDisableKernelModule() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object setDisableKernelModule(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean disable, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.lang.Boolean> getMultipleTunnels() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.lang.Boolean> getDarkTheme() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.lang.Boolean> getAllowRemoteControlIntents() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.lang.Boolean> getRestoreOnBoot() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.lang.String> getLastUsedTunnel() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object setLastUsedTunnel(@org.jetbrains.annotations.Nullable()
    java.lang.String lastUsedTunnel, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.Set<java.lang.String>> getRunningTunnels() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object setRunningTunnels(@org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> runningTunnels, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    private UserKnobs() {
        super();
    }
}