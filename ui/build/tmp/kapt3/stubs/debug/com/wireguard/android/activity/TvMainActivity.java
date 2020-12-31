package com.wireguard.android.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 (2\u00020\u0001:\u0003()*B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0011H\u0002J\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0011H\u0002J\b\u0010!\u001a\u00020\u001fH\u0016J\u0012\u0010\"\u001a\u00020\u001f2\b\u0010#\u001a\u0004\u0018\u00010$H\u0014J\u0010\u0010%\u001a\u00020\u001f2\u0006\u0010&\u001a\u00020\u0013H\u0002J\u0011\u0010\'\u001a\u00020\u001fH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001dR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0010\u0012\f\u0012\n \r*\u0004\u0018\u00010\n0\n0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0014\u001a\u0010\u0012\f\u0012\n \r*\u0004\u0018\u00010\u00160\u00160\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0017\u001a\u0010\u0012\f\u0012\n \r*\u0004\u0018\u00010\n0\n0\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0018\u001a\u0010\u0012\f\u0012\n \r*\u0004\u0018\u00010\n0\n0\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006+"}, d2 = {"Lcom/wireguard/android/activity/TvMainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/wireguard/android/databinding/TvActivityBinding;", "cachedRoots", "", "Lcom/wireguard/android/activity/TvMainActivity$KeyedFile;", "files", "Lcom/wireguard/android/databinding/ObservableKeyedArrayList;", "", "filesRoot", "Landroidx/databinding/ObservableField;", "kotlin.jvm.PlatformType", "isDeleting", "Landroidx/databinding/ObservableBoolean;", "pendingNavigation", "Ljava/io/File;", "pendingTunnel", "Lcom/wireguard/android/model/ObservableTunnel;", "permissionActivityResultLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "permissionRequestPermissionLauncher", "tunnelFileImportResultLauncher", "isBelowCachedRoots", "", "maybeChild", "makeStorageRoots", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "navigateTo", "", "directory", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setTunnelStateWithPermissionsResult", "tunnel", "updateStats", "Companion", "KeyedFile", "SlatedSpanSizeLookup", "ui_debug"})
public final class TvMainActivity extends androidx.appcompat.app.AppCompatActivity {
    private final androidx.activity.result.ActivityResultLauncher<java.lang.String> tunnelFileImportResultLauncher = null;
    private com.wireguard.android.model.ObservableTunnel pendingTunnel;
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> permissionActivityResultLauncher = null;
    private com.wireguard.android.databinding.TvActivityBinding binding;
    private final androidx.databinding.ObservableBoolean isDeleting = null;
    private final com.wireguard.android.databinding.ObservableKeyedArrayList<java.lang.String, com.wireguard.android.activity.TvMainActivity.KeyedFile> files = null;
    private final androidx.databinding.ObservableField<java.lang.String> filesRoot = null;
    private java.io.File pendingNavigation;
    private final androidx.activity.result.ActivityResultLauncher<java.lang.String> permissionRequestPermissionLauncher = null;
    private java.util.Collection<com.wireguard.android.activity.TvMainActivity.KeyedFile> cachedRoots;
    private static final java.lang.String TAG = "WireGuard/TvMainActivity";
    @org.jetbrains.annotations.NotNull()
    public static final com.wireguard.android.activity.TvMainActivity.Companion Companion = null;
    
    private final void setTunnelStateWithPermissionsResult(com.wireguard.android.model.ObservableTunnel tunnel) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final boolean isBelowCachedRoots(java.io.File maybeChild) {
        return false;
    }
    
    private final void navigateTo(java.io.File directory) {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    public TvMainActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0002X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\u00028VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lcom/wireguard/android/activity/TvMainActivity$KeyedFile;", "Lcom/wireguard/android/databinding/Keyed;", "", "file", "Ljava/io/File;", "forcedKey", "(Ljava/io/File;Ljava/lang/String;)V", "getFile", "()Ljava/io/File;", "key", "getKey", "()Ljava/lang/String;", "ui_debug"})
    public static final class KeyedFile implements com.wireguard.android.databinding.Keyed<java.lang.String> {
        @org.jetbrains.annotations.NotNull()
        private final java.io.File file = null;
        private final java.lang.String forcedKey = null;
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String getKey() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.io.File getFile() {
            return null;
        }
        
        public KeyedFile(@org.jetbrains.annotations.NotNull()
        java.io.File file, @org.jetbrains.annotations.Nullable()
        java.lang.String forcedKey) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0015\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0002J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0018\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tX\u0082.\u00a2\u0006\u0004\n\u0002\u0010\u000b\u00a8\u0006\u0011"}, d2 = {"Lcom/wireguard/android/activity/TvMainActivity$SlatedSpanSizeLookup;", "Landroidx/recyclerview/widget/GridLayoutManager$SpanSizeLookup;", "gridManager", "Landroidx/recyclerview/widget/GridLayoutManager;", "(Landroidx/recyclerview/widget/GridLayoutManager;)V", "newWidth", "", "originalHeight", "sizeMap", "", "", "[[I", "emptyUnderIndex", "index", "size", "getSpanSize", "position", "ui_debug"})
    static final class SlatedSpanSizeLookup extends androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup {
        private final int originalHeight = 0;
        private int newWidth = 0;
        private int[][] sizeMap;
        private final androidx.recyclerview.widget.GridLayoutManager gridManager = null;
        
        private final int emptyUnderIndex(int index, int size) {
            return 0;
        }
        
        @java.lang.Override()
        public int getSpanSize(int position) {
            return 0;
        }
        
        public SlatedSpanSizeLookup(@org.jetbrains.annotations.NotNull()
        androidx.recyclerview.widget.GridLayoutManager gridManager) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/wireguard/android/activity/TvMainActivity$Companion;", "", "()V", "TAG", "", "ui_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}