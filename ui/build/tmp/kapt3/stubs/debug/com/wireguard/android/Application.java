package com.wireguard.android;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0014J\u0011\u0010\u0018\u001a\u00020\u0004H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019J\b\u0010\u001a\u001a\u00020\u0015H\u0016J\b\u0010\u001b\u001a\u00020\u0015H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001d"}, d2 = {"Lcom/wireguard/android/Application;", "Landroid/app/Application;", "()V", "backend", "Lcom/wireguard/android/backend/Backend;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "futureBackend", "Lkotlinx/coroutines/CompletableDeferred;", "moduleLoader", "Lcom/wireguard/android/util/ModuleLoader;", "preferencesDataStore", "Landroidx/datastore/DataStore;", "Landroidx/datastore/preferences/Preferences;", "rootShell", "Lcom/wireguard/android/util/RootShell;", "toolsInstaller", "Lcom/wireguard/android/util/ToolsInstaller;", "tunnelManager", "Lcom/wireguard/android/model/TunnelManager;", "attachBaseContext", "", "context", "Landroid/content/Context;", "determineBackend", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onCreate", "onTerminate", "Companion", "ui_debug"})
public final class Application extends android.app.Application {
    private final kotlinx.coroutines.CompletableDeferred<com.wireguard.android.backend.Backend> futureBackend = null;
    private final kotlinx.coroutines.CoroutineScope coroutineScope = null;
    private com.wireguard.android.backend.Backend backend;
    private com.wireguard.android.util.ModuleLoader moduleLoader;
    private com.wireguard.android.util.RootShell rootShell;
    private androidx.datastore.DataStore<androidx.datastore.preferences.Preferences> preferencesDataStore;
    private com.wireguard.android.util.ToolsInstaller toolsInstaller;
    private com.wireguard.android.model.TunnelManager tunnelManager;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String USER_AGENT = null;
    private static final java.lang.String TAG = "WireGuard/Application";
    private static java.lang.ref.WeakReference<com.wireguard.android.Application> weakSelf;
    @org.jetbrains.annotations.NotNull()
    public static final com.wireguard.android.Application.Companion Companion = null;
    
    @java.lang.Override()
    protected void attachBaseContext(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @java.lang.Override()
    public void onTerminate() {
    }
    
    public Application() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.wireguard.android.Application get() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.Object getBackend(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.wireguard.android.backend.Backend> p0_1779535) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.wireguard.android.util.ModuleLoader getModuleLoader() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.wireguard.android.util.RootShell getRootShell() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final androidx.datastore.DataStore<androidx.datastore.preferences.Preferences> getPreferencesDataStore() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.wireguard.android.util.ToolsInstaller getToolsInstaller() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.wireguard.android.model.TunnelManager getTunnelManager() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final kotlinx.coroutines.CoroutineScope getCoroutineScope() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\nH\u0007J\u0011\u0010\f\u001a\u00020\rH\u0087@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\b\u0010\u000f\u001a\u00020\u0010H\u0007J\b\u0010\u0011\u001a\u00020\u0012H\u0007J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0007J\b\u0010\u0016\u001a\u00020\u0017H\u0007J\b\u0010\u0018\u001a\u00020\u0019H\u0007J\b\u0010\u001a\u001a\u00020\u001bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082.\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001c"}, d2 = {"Lcom/wireguard/android/Application$Companion;", "", "()V", "TAG", "", "USER_AGENT", "getUSER_AGENT", "()Ljava/lang/String;", "weakSelf", "Ljava/lang/ref/WeakReference;", "Lcom/wireguard/android/Application;", "get", "getBackend", "Lcom/wireguard/android/backend/Backend;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCoroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "getModuleLoader", "Lcom/wireguard/android/util/ModuleLoader;", "getPreferencesDataStore", "Landroidx/datastore/DataStore;", "Landroidx/datastore/preferences/Preferences;", "getRootShell", "Lcom/wireguard/android/util/RootShell;", "getToolsInstaller", "Lcom/wireguard/android/util/ToolsInstaller;", "getTunnelManager", "Lcom/wireguard/android/model/TunnelManager;", "ui_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getUSER_AGENT() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.wireguard.android.Application get() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getBackend(@org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super com.wireguard.android.backend.Backend> p0) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.wireguard.android.util.ModuleLoader getModuleLoader() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.wireguard.android.util.RootShell getRootShell() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.datastore.DataStore<androidx.datastore.preferences.Preferences> getPreferencesDataStore() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.wireguard.android.util.ToolsInstaller getToolsInstaller() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.wireguard.android.model.TunnelManager getTunnelManager() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlinx.coroutines.CoroutineScope getCoroutineScope() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}