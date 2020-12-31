package com.wireguard.android.fragment;

import java.lang.System;

/**
 * Fragment for editing a WireGuard configuration.
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 82\u00020\u0001:\u00018B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u001a\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0002J\u0012\u0010\u0013\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u0018\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J&\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0019\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010 \u001a\u00020\u000bH\u0016J\b\u0010!\u001a\u00020\u000bH\u0002J\u000e\u0010\"\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\u001cJ\u0016\u0010$\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020\u0006J\u0010\u0010&\u001a\u00020\u00062\u0006\u0010\'\u001a\u00020(H\u0016J\u0010\u0010)\u001a\u00020\u000b2\b\u0010#\u001a\u0004\u0018\u00010\u001cJ\u0010\u0010*\u001a\u00020\u000b2\u0006\u0010+\u001a\u00020\u0015H\u0016J\u001c\u0010,\u001a\u00020\u000b2\b\u0010-\u001a\u0004\u0018\u00010\t2\b\u0010.\u001a\u0004\u0018\u00010\tH\u0016J\u001c\u0010/\u001a\u00020\u000b2\b\u0010.\u001a\u0004\u0018\u00010\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0002J+\u00100\u001a\u00020\u000b2\u0006\u00101\u001a\u00020\t2\u0006\u00102\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00103J\u0012\u00104\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u0010\u00105\u001a\u00020\u000b2\u0006\u00106\u001a\u000207H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u00069"}, d2 = {"Lcom/wireguard/android/fragment/TunnelEditorFragment;", "Lcom/wireguard/android/fragment/BaseFragment;", "()V", "binding", "Lcom/wireguard/android/databinding/TunnelEditorFragmentBinding;", "haveShownKeys", "", "showingAuthenticator", "tunnel", "Lcom/wireguard/android/model/ObservableTunnel;", "onConfigLoaded", "", "config", "Lcom/wireguard/config/Config;", "onConfigSaved", "savedTunnel", "Lcom/wireguard/android/backend/Tunnel;", "throwable", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/View;", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "onFinished", "onKeyClick", "view", "onKeyFocusChange", "isFocused", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onRequestSetExcludedIncludedApplications", "onSaveInstanceState", "outState", "onSelectedTunnelChanged", "oldTunnel", "newTunnel", "onTunnelCreated", "onTunnelRenamed", "renamedTunnel", "newConfig", "(Lcom/wireguard/android/model/ObservableTunnel;Lcom/wireguard/config/Config;Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onViewStateRestored", "showPrivateKey", "edit", "Landroid/widget/EditText;", "Companion", "ui_debug"})
public final class TunnelEditorFragment extends com.wireguard.android.fragment.BaseFragment {
    private boolean haveShownKeys = false;
    private com.wireguard.android.databinding.TunnelEditorFragmentBinding binding;
    private com.wireguard.android.model.ObservableTunnel tunnel;
    private boolean showingAuthenticator = false;
    private static final java.lang.String KEY_LOCAL_CONFIG = "local_config";
    private static final java.lang.String KEY_ORIGINAL_NAME = "original_name";
    private static final java.lang.String TAG = "WireGuard/TunnelEditorFragment";
    @org.jetbrains.annotations.NotNull()
    public static final com.wireguard.android.fragment.TunnelEditorFragment.Companion Companion = null;
    
    private final void onConfigLoaded(com.wireguard.config.Config config) {
    }
    
    private final void onConfigSaved(com.wireguard.android.backend.Tunnel savedTunnel, java.lang.Throwable throwable) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu, @org.jetbrains.annotations.NotNull()
    android.view.MenuInflater inflater) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    private final void onFinished() {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @kotlin.Suppress(names = {"UNUSED_PARAMETER"})
    public final void onRequestSetExcludedIncludedApplications(@org.jetbrains.annotations.Nullable()
    android.view.View view) {
    }
    
    @java.lang.Override()
    public void onSaveInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle outState) {
    }
    
    @java.lang.Override()
    public void onSelectedTunnelChanged(@org.jetbrains.annotations.Nullable()
    com.wireguard.android.model.ObservableTunnel oldTunnel, @org.jetbrains.annotations.Nullable()
    com.wireguard.android.model.ObservableTunnel newTunnel) {
    }
    
    private final void onTunnelCreated(com.wireguard.android.model.ObservableTunnel newTunnel, java.lang.Throwable throwable) {
    }
    
    @java.lang.Override()
    public void onViewStateRestored(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void onKeyClick(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    public final void onKeyFocusChange(@org.jetbrains.annotations.NotNull()
    android.view.View view, boolean isFocused) {
    }
    
    private final void showPrivateKey(android.widget.EditText edit) {
    }
    
    public TunnelEditorFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/wireguard/android/fragment/TunnelEditorFragment$Companion;", "", "()V", "KEY_LOCAL_CONFIG", "", "KEY_ORIGINAL_NAME", "TAG", "ui_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}