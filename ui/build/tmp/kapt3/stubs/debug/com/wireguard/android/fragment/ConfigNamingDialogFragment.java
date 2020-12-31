package com.wireguard.android.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016J\u0012\u0010\f\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\b\u0010\u0011\u001a\u00020\nH\u0016J\u0010\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/wireguard/android/fragment/ConfigNamingDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "()V", "binding", "Lcom/wireguard/android/databinding/ConfigNamingDialogFragmentBinding;", "config", "Lcom/wireguard/config/Config;", "imm", "Landroid/view/inputmethod/InputMethodManager;", "createTunnelAndDismiss", "", "dismiss", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateDialog", "Landroid/app/Dialog;", "onResume", "setKeyboardVisible", "visible", "", "Companion", "ui_debug"})
public final class ConfigNamingDialogFragment extends androidx.fragment.app.DialogFragment {
    private com.wireguard.android.databinding.ConfigNamingDialogFragmentBinding binding;
    private com.wireguard.config.Config config;
    private android.view.inputmethod.InputMethodManager imm;
    private static final java.lang.String KEY_CONFIG_TEXT = "config_text";
    @org.jetbrains.annotations.NotNull()
    public static final com.wireguard.android.fragment.ConfigNamingDialogFragment.Companion Companion = null;
    
    private final void createTunnelAndDismiss() {
    }
    
    @java.lang.Override()
    public void dismiss() {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.app.Dialog onCreateDialog(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    private final void setKeyboardVisible(boolean visible) {
    }
    
    public ConfigNamingDialogFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.wireguard.android.fragment.ConfigNamingDialogFragment newInstance(@org.jetbrains.annotations.Nullable()
    java.lang.String configText) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/wireguard/android/fragment/ConfigNamingDialogFragment$Companion;", "", "()V", "KEY_CONFIG_TEXT", "", "newInstance", "Lcom/wireguard/android/fragment/ConfigNamingDialogFragment;", "configText", "ui_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.wireguard.android.fragment.ConfigNamingDialogFragment newInstance(@org.jetbrains.annotations.Nullable()
        java.lang.String configText) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}