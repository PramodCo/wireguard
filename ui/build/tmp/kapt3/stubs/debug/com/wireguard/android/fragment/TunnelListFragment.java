package com.wireguard.android.fragment;

import java.lang.System;

/**
 * Fragment containing a list of known WireGuard tunnels. It allows creating and deleting tunnels.
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\u0018\u0000 02\u00020\u0001:\u0002/0B\u0005\u00a2\u0006\u0002\u0010\u0002J&\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0016H\u0016J\u001c\u0010\u001b\u001a\u00020\u00182\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016J\u001a\u0010\u001f\u001a\u00020\u00182\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0002J\u001a\u0010$\u001a\u00020\u00182\u0006\u0010%\u001a\u00020\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u0012\u0010&\u001a\u00020\u00182\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u0010\u0010\'\u001a\u00020\u00182\u0006\u0010(\u001a\u00020)H\u0002J\u001e\u0010*\u001a\u0004\u0018\u00010+2\u0006\u0010,\u001a\u00020\u001d2\n\u0010-\u001a\u0006\u0012\u0002\b\u00030.H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u00060\u0006R\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000e0\u000e0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00061"}, d2 = {"Lcom/wireguard/android/fragment/TunnelListFragment;", "Lcom/wireguard/android/fragment/BaseFragment;", "()V", "actionMode", "Landroidx/appcompat/view/ActionMode;", "actionModeListener", "Lcom/wireguard/android/fragment/TunnelListFragment$ActionModeListener;", "binding", "Lcom/wireguard/android/databinding/TunnelListFragmentBinding;", "qrImportResultLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "tunnelFileImportResultLauncher", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "", "onSaveInstanceState", "outState", "onSelectedTunnelChanged", "oldTunnel", "Lcom/wireguard/android/model/ObservableTunnel;", "newTunnel", "onTunnelDeletionFinished", "count", "", "throwable", "", "onViewCreated", "view", "onViewStateRestored", "showSnackbar", "message", "", "viewForTunnel", "Lcom/wireguard/android/widget/MultiselectableRelativeLayout;", "tunnel", "tunnels", "", "ActionModeListener", "Companion", "ui_debug"})
public final class TunnelListFragment extends com.wireguard.android.fragment.BaseFragment {
    private final com.wireguard.android.fragment.TunnelListFragment.ActionModeListener actionModeListener = null;
    private androidx.appcompat.view.ActionMode actionMode;
    private com.wireguard.android.databinding.TunnelListFragmentBinding binding;
    private final androidx.activity.result.ActivityResultLauncher<java.lang.String> tunnelFileImportResultLauncher = null;
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> qrImportResultLauncher = null;
    private static final java.lang.String CHECKED_ITEMS = "CHECKED_ITEMS";
    private static final java.lang.String TAG = "WireGuard/TunnelListFragment";
    @org.jetbrains.annotations.NotNull()
    public static final com.wireguard.android.fragment.TunnelListFragment.Companion Companion = null;
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
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
    
    @java.lang.Override()
    public void onSaveInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle outState) {
    }
    
    @java.lang.Override()
    public void onSelectedTunnelChanged(@org.jetbrains.annotations.Nullable()
    com.wireguard.android.model.ObservableTunnel oldTunnel, @org.jetbrains.annotations.Nullable()
    com.wireguard.android.model.ObservableTunnel newTunnel) {
    }
    
    private final void onTunnelDeletionFinished(int count, java.lang.Throwable throwable) {
    }
    
    @java.lang.Override()
    public void onViewStateRestored(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void showSnackbar(java.lang.CharSequence message) {
    }
    
    private final com.wireguard.android.widget.MultiselectableRelativeLayout viewForTunnel(com.wireguard.android.model.ObservableTunnel tunnel, java.util.List<?> tunnels) {
        return null;
    }
    
    public TunnelListFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0010J\u0018\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0018\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0018\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0016\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u000fJ\u000e\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u0005J\u0012\u0010\u001f\u001a\u00020\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lcom/wireguard/android/fragment/TunnelListFragment$ActionModeListener;", "Landroidx/appcompat/view/ActionMode$Callback;", "(Lcom/wireguard/android/fragment/TunnelListFragment;)V", "checkedItems", "", "", "getCheckedItems", "()Ljava/util/Collection;", "resources", "Landroid/content/res/Resources;", "animateFab", "", "view", "Landroid/view/View;", "show", "", "Ljava/util/ArrayList;", "onActionItemClicked", "mode", "Landroidx/appcompat/view/ActionMode;", "item", "Landroid/view/MenuItem;", "onCreateActionMode", "menu", "Landroid/view/Menu;", "onDestroyActionMode", "onPrepareActionMode", "setItemChecked", "position", "checked", "toggleItemChecked", "updateTitle", "ui_debug"})
    final class ActionModeListener implements androidx.appcompat.view.ActionMode.Callback {
        @org.jetbrains.annotations.NotNull()
        private final java.util.Collection<java.lang.Integer> checkedItems = null;
        private android.content.res.Resources resources;
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.Collection<java.lang.Integer> getCheckedItems() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.ArrayList<java.lang.Integer> getCheckedItems() {
            return null;
        }
        
        @java.lang.Override()
        public boolean onActionItemClicked(@org.jetbrains.annotations.NotNull()
        androidx.appcompat.view.ActionMode mode, @org.jetbrains.annotations.NotNull()
        android.view.MenuItem item) {
            return false;
        }
        
        @java.lang.Override()
        public boolean onCreateActionMode(@org.jetbrains.annotations.NotNull()
        androidx.appcompat.view.ActionMode mode, @org.jetbrains.annotations.NotNull()
        android.view.Menu menu) {
            return false;
        }
        
        @java.lang.Override()
        public void onDestroyActionMode(@org.jetbrains.annotations.NotNull()
        androidx.appcompat.view.ActionMode mode) {
        }
        
        @java.lang.Override()
        public boolean onPrepareActionMode(@org.jetbrains.annotations.NotNull()
        androidx.appcompat.view.ActionMode mode, @org.jetbrains.annotations.NotNull()
        android.view.Menu menu) {
            return false;
        }
        
        public final void setItemChecked(int position, boolean checked) {
        }
        
        public final void toggleItemChecked(int position) {
        }
        
        private final void updateTitle(androidx.appcompat.view.ActionMode mode) {
        }
        
        private final void animateFab(android.view.View view, boolean show) {
        }
        
        public ActionModeListener() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0006\u001a\u00020\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/wireguard/android/fragment/TunnelListFragment$Companion;", "", "()V", "CHECKED_ITEMS", "", "TAG", "newInstance", "Lcom/wireguard/android/fragment/TunnelListFragment;", "ui_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.wireguard.android.fragment.TunnelListFragment newInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}