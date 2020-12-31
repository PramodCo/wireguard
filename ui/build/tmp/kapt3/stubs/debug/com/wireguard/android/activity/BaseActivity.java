package com.wireguard.android.activity;

import java.lang.System;

/**
 * Base class for activities that need to remember the currently-selected tunnel.
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b&\u0018\u0000 \u00192\u00020\u0001:\u0004\u0019\u001a\u001b\u001cB\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0012\u0010\u0010\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014J\u0010\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0012H\u0014J\u001c\u0010\u0015\u001a\u00020\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0004H$J\u000e\u0010\u0018\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR(\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/wireguard/android/activity/BaseActivity;", "Lcom/wireguard/android/activity/ThemeChangeAwareActivity;", "()V", "value", "Lcom/wireguard/android/model/ObservableTunnel;", "selectedTunnel", "getSelectedTunnel", "()Lcom/wireguard/android/model/ObservableTunnel;", "setSelectedTunnel", "(Lcom/wireguard/android/model/ObservableTunnel;)V", "selectionChangeRegistry", "Lcom/wireguard/android/activity/BaseActivity$SelectionChangeRegistry;", "addOnSelectedTunnelChangedListener", "", "listener", "Lcom/wireguard/android/activity/BaseActivity$OnSelectedTunnelChangedListener;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onSaveInstanceState", "outState", "onSelectedTunnelChanged", "oldTunnel", "newTunnel", "removeOnSelectedTunnelChangedListener", "Companion", "OnSelectedTunnelChangedListener", "SelectionChangeNotifier", "SelectionChangeRegistry", "ui_debug"})
public abstract class BaseActivity extends com.wireguard.android.activity.ThemeChangeAwareActivity {
    private final com.wireguard.android.activity.BaseActivity.SelectionChangeRegistry selectionChangeRegistry = null;
    @org.jetbrains.annotations.Nullable()
    private com.wireguard.android.model.ObservableTunnel selectedTunnel;
    private static final java.lang.String KEY_SELECTED_TUNNEL = "selected_tunnel";
    @org.jetbrains.annotations.NotNull()
    public static final com.wireguard.android.activity.BaseActivity.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable()
    public final com.wireguard.android.model.ObservableTunnel getSelectedTunnel() {
        return null;
    }
    
    public final void setSelectedTunnel(@org.jetbrains.annotations.Nullable()
    com.wireguard.android.model.ObservableTunnel value) {
    }
    
    public final void addOnSelectedTunnelChangedListener(@org.jetbrains.annotations.NotNull()
    com.wireguard.android.activity.BaseActivity.OnSelectedTunnelChangedListener listener) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onSaveInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle outState) {
    }
    
    protected abstract void onSelectedTunnelChanged(@org.jetbrains.annotations.Nullable()
    com.wireguard.android.model.ObservableTunnel oldTunnel, @org.jetbrains.annotations.Nullable()
    com.wireguard.android.model.ObservableTunnel newTunnel);
    
    public final void removeOnSelectedTunnelChangedListener(@org.jetbrains.annotations.NotNull()
    com.wireguard.android.activity.BaseActivity.OnSelectedTunnelChangedListener listener) {
    }
    
    public BaseActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/wireguard/android/activity/BaseActivity$OnSelectedTunnelChangedListener;", "", "onSelectedTunnelChanged", "", "oldTunnel", "Lcom/wireguard/android/model/ObservableTunnel;", "newTunnel", "ui_debug"})
    public static abstract interface OnSelectedTunnelChangedListener {
        
        public abstract void onSelectedTunnelChanged(@org.jetbrains.annotations.Nullable()
        com.wireguard.android.model.ObservableTunnel oldTunnel, @org.jetbrains.annotations.Nullable()
        com.wireguard.android.model.ObservableTunnel newTunnel);
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J,\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u0016\u00a8\u0006\f"}, d2 = {"Lcom/wireguard/android/activity/BaseActivity$SelectionChangeNotifier;", "Landroidx/databinding/CallbackRegistry$NotifierCallback;", "Lcom/wireguard/android/activity/BaseActivity$OnSelectedTunnelChangedListener;", "Lcom/wireguard/android/model/ObservableTunnel;", "()V", "onNotifyCallback", "", "listener", "oldTunnel", "ignored", "", "newTunnel", "ui_debug"})
    static final class SelectionChangeNotifier extends androidx.databinding.CallbackRegistry.NotifierCallback<com.wireguard.android.activity.BaseActivity.OnSelectedTunnelChangedListener, com.wireguard.android.model.ObservableTunnel, com.wireguard.android.model.ObservableTunnel> {
        
        @java.lang.Override()
        public void onNotifyCallback(@org.jetbrains.annotations.NotNull()
        com.wireguard.android.activity.BaseActivity.OnSelectedTunnelChangedListener listener, @org.jetbrains.annotations.Nullable()
        com.wireguard.android.model.ObservableTunnel oldTunnel, int ignored, @org.jetbrains.annotations.Nullable()
        com.wireguard.android.model.ObservableTunnel newTunnel) {
        }
        
        public SelectionChangeNotifier() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/wireguard/android/activity/BaseActivity$SelectionChangeRegistry;", "Landroidx/databinding/CallbackRegistry;", "Lcom/wireguard/android/activity/BaseActivity$OnSelectedTunnelChangedListener;", "Lcom/wireguard/android/model/ObservableTunnel;", "()V", "ui_debug"})
    static final class SelectionChangeRegistry extends androidx.databinding.CallbackRegistry<com.wireguard.android.activity.BaseActivity.OnSelectedTunnelChangedListener, com.wireguard.android.model.ObservableTunnel, com.wireguard.android.model.ObservableTunnel> {
        
        public SelectionChangeRegistry() {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/wireguard/android/activity/BaseActivity$Companion;", "", "()V", "KEY_SELECTED_TUNNEL", "", "ui_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}