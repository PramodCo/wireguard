package com.wireguard.android.model;

import java.lang.System;

/**
 * Maintains and mediates changes to the set of available WireGuard tunnels,
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u000e\u0018\u0000 82\u00020\u0001:\u000289B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\"\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00122\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J#\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00122\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cJ\u0019\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010 J\u0019\u0010!\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010 J\u0019\u0010\"\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010 J\u0019\u0010#\u001a\u00020$2\u0006\u0010\u001f\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010 J\u001d\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\n0\u0011H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010&J\u0006\u0010\'\u001a\u00020\u001eJ$\u0010(\u001a\u00020\u001e2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00120*2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00120,H\u0002J\b\u0010-\u001a\u00020\u001eH\u0002J\u0019\u0010.\u001a\u00020\u001e2\u0006\u0010/\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00100J\u0011\u00101\u001a\u00020\u001eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010&J!\u00102\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0018H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00103J!\u00104\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0012H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00105J!\u00106\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u001aH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00107R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R*\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\n8G@BX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\n0\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\n0\u00110\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006:"}, d2 = {"Lcom/wireguard/android/model/TunnelManager;", "Landroidx/databinding/BaseObservable;", "configStore", "Lcom/wireguard/android/configStore/ConfigStore;", "(Lcom/wireguard/android/configStore/ConfigStore;)V", "context", "Landroid/content/Context;", "haveLoaded", "", "value", "Lcom/wireguard/android/model/ObservableTunnel;", "lastUsedTunnel", "getLastUsedTunnel", "()Lcom/wireguard/android/model/ObservableTunnel;", "setLastUsedTunnel", "(Lcom/wireguard/android/model/ObservableTunnel;)V", "tunnelMap", "Lcom/wireguard/android/databinding/ObservableSortedKeyedArrayList;", "", "tunnels", "Lkotlinx/coroutines/CompletableDeferred;", "addToList", "name", "config", "Lcom/wireguard/config/Config;", "state", "Lcom/wireguard/android/backend/Tunnel$State;", "create", "(Ljava/lang/String;Lcom/wireguard/config/Config;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delete", "", "tunnel", "(Lcom/wireguard/android/model/ObservableTunnel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTunnelConfig", "getTunnelState", "getTunnelStatistics", "Lcom/wireguard/android/backend/Statistics;", "getTunnels", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onCreate", "onTunnelsLoaded", "present", "", "running", "", "refreshTunnelStates", "restoreState", "force", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveState", "setTunnelConfig", "(Lcom/wireguard/android/model/ObservableTunnel;Lcom/wireguard/config/Config;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setTunnelName", "(Lcom/wireguard/android/model/ObservableTunnel;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setTunnelState", "(Lcom/wireguard/android/model/ObservableTunnel;Lcom/wireguard/android/backend/Tunnel$State;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "IntentReceiver", "ui_debug"})
public final class TunnelManager extends androidx.databinding.BaseObservable {
    private final kotlinx.coroutines.CompletableDeferred<com.wireguard.android.databinding.ObservableSortedKeyedArrayList<java.lang.String, com.wireguard.android.model.ObservableTunnel>> tunnels = null;
    private final android.content.Context context = null;
    private final com.wireguard.android.databinding.ObservableSortedKeyedArrayList<java.lang.String, com.wireguard.android.model.ObservableTunnel> tunnelMap = null;
    private boolean haveLoaded = false;
    @org.jetbrains.annotations.Nullable()
    private com.wireguard.android.model.ObservableTunnel lastUsedTunnel;
    private final com.wireguard.android.configStore.ConfigStore configStore = null;
    private static final java.lang.String TAG = "WireGuard/TunnelManager";
    @org.jetbrains.annotations.NotNull()
    public static final com.wireguard.android.model.TunnelManager.Companion Companion = null;
    
    private final com.wireguard.android.model.ObservableTunnel addToList(java.lang.String name, com.wireguard.config.Config config, com.wireguard.android.backend.Tunnel.State state) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getTunnels(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.wireguard.android.databinding.ObservableSortedKeyedArrayList<java.lang.String, com.wireguard.android.model.ObservableTunnel>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object create(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    com.wireguard.config.Config config, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.wireguard.android.model.ObservableTunnel> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object delete(@org.jetbrains.annotations.NotNull()
    com.wireguard.android.model.ObservableTunnel tunnel, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.databinding.Bindable()
    public final com.wireguard.android.model.ObservableTunnel getLastUsedTunnel() {
        return null;
    }
    
    private final void setLastUsedTunnel(com.wireguard.android.model.ObservableTunnel value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getTunnelConfig(@org.jetbrains.annotations.NotNull()
    com.wireguard.android.model.ObservableTunnel tunnel, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.wireguard.config.Config> p1) {
        return null;
    }
    
    public final void onCreate() {
    }
    
    private final void onTunnelsLoaded(java.lang.Iterable<java.lang.String> present, java.util.Collection<java.lang.String> running) {
    }
    
    private final void refreshTunnelStates() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object restoreState(boolean force, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object saveState(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object setTunnelConfig(@org.jetbrains.annotations.NotNull()
    com.wireguard.android.model.ObservableTunnel tunnel, @org.jetbrains.annotations.NotNull()
    com.wireguard.config.Config config, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.wireguard.config.Config> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object setTunnelName(@org.jetbrains.annotations.NotNull()
    com.wireguard.android.model.ObservableTunnel tunnel, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object setTunnelState(@org.jetbrains.annotations.NotNull()
    com.wireguard.android.model.ObservableTunnel tunnel, @org.jetbrains.annotations.NotNull()
    com.wireguard.android.backend.Tunnel.State state, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.wireguard.android.backend.Tunnel.State> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getTunnelState(@org.jetbrains.annotations.NotNull()
    com.wireguard.android.model.ObservableTunnel tunnel, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.wireguard.android.backend.Tunnel.State> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getTunnelStatistics(@org.jetbrains.annotations.NotNull()
    com.wireguard.android.model.ObservableTunnel tunnel, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.wireguard.android.backend.Statistics> p1) {
        return null;
    }
    
    public TunnelManager(@org.jetbrains.annotations.NotNull()
    com.wireguard.android.configStore.ConfigStore configStore) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016\u00a8\u0006\t"}, d2 = {"Lcom/wireguard/android/model/TunnelManager$IntentReceiver;", "Landroid/content/BroadcastReceiver;", "()V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "ui_debug"})
    public static final class IntentReceiver extends android.content.BroadcastReceiver {
        
        @java.lang.Override()
        public void onReceive(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.Nullable()
        android.content.Intent intent) {
        }
        
        public IntentReceiver() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/wireguard/android/model/TunnelManager$Companion;", "", "()V", "TAG", "", "ui_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}