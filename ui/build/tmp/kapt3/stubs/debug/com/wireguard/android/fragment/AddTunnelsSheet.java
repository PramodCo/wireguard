package com.wireguard.android.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J&\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u0014\u001a\u00020\tH\u0002J\b\u0010\u0015\u001a\u00020\tH\u0002J\b\u0010\u0016\u001a\u00020\tH\u0002J\u001a\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016R\u0016\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/wireguard/android/fragment/AddTunnelsSheet;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "()V", "behavior", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "Landroid/widget/FrameLayout;", "bottomSheetCallback", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$BottomSheetCallback;", "dismiss", "", "getTheme", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onRequestCreateConfig", "onRequestImportConfig", "onRequestScanQRCode", "onViewCreated", "view", "Companion", "ui_debug"})
public final class AddTunnelsSheet extends com.google.android.material.bottomsheet.BottomSheetDialogFragment {
    private com.google.android.material.bottomsheet.BottomSheetBehavior<android.widget.FrameLayout> behavior;
    private final com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback bottomSheetCallback = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String REQUEST_KEY_NEW_TUNNEL = "request_new_tunnel";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String REQUEST_METHOD = "request_method";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String REQUEST_CREATE = "request_create";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String REQUEST_IMPORT = "request_import";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String REQUEST_SCAN = "request_scan";
    @org.jetbrains.annotations.NotNull()
    public static final com.wireguard.android.fragment.AddTunnelsSheet.Companion Companion = null;
    
    @java.lang.Override()
    public int getTheme() {
        return 0;
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
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void dismiss() {
    }
    
    private final void onRequestCreateConfig() {
    }
    
    private final void onRequestImportConfig() {
    }
    
    private final void onRequestScanQRCode() {
    }
    
    public AddTunnelsSheet() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/wireguard/android/fragment/AddTunnelsSheet$Companion;", "", "()V", "REQUEST_CREATE", "", "REQUEST_IMPORT", "REQUEST_KEY_NEW_TUNNEL", "REQUEST_METHOD", "REQUEST_SCAN", "ui_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}