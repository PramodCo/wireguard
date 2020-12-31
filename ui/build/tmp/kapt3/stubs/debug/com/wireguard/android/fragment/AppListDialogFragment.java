package com.wireguard.android.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\u0012\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u0012\u0010\u0014\u001a\u00020\u00152\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u0016\u001a\u00020\u0010H\u0002J\b\u0010\u0017\u001a\u00020\u0010H\u0002R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/wireguard/android/fragment/AppListDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "()V", "appData", "Lcom/wireguard/android/databinding/ObservableKeyedArrayList;", "", "Lcom/wireguard/android/model/ApplicationData;", "button", "Landroid/widget/Button;", "currentlySelectedApps", "", "initiallyExcluded", "", "tabs", "Lcom/google/android/material/tabs/TabLayout;", "loadData", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateDialog", "Landroid/app/Dialog;", "setButtonText", "setSelectionAndDismiss", "Companion", "ui_debug"})
public final class AppListDialogFragment extends androidx.fragment.app.DialogFragment {
    private final com.wireguard.android.databinding.ObservableKeyedArrayList<java.lang.String, com.wireguard.android.model.ApplicationData> appData = null;
    private java.util.List<java.lang.String> currentlySelectedApps;
    private boolean initiallyExcluded = false;
    private android.widget.Button button;
    private com.google.android.material.tabs.TabLayout tabs;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_SELECTED_APPS = "selected_apps";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_IS_EXCLUDED = "is_excluded";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String REQUEST_SELECTION = "request_selection";
    @org.jetbrains.annotations.NotNull()
    public static final com.wireguard.android.fragment.AppListDialogFragment.Companion Companion = null;
    
    private final void loadData() {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setButtonText() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.app.Dialog onCreateDialog(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void setSelectionAndDismiss() {
    }
    
    public AppListDialogFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J.\u0010\u0007\u001a\u00020\b2\u001e\u0010\t\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\nj\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u0001`\u000b2\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/wireguard/android/fragment/AppListDialogFragment$Companion;", "", "()V", "KEY_IS_EXCLUDED", "", "KEY_SELECTED_APPS", "REQUEST_SELECTION", "newInstance", "Lcom/wireguard/android/fragment/AppListDialogFragment;", "selectedApps", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "isExcluded", "", "ui_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.wireguard.android.fragment.AppListDialogFragment newInstance(@org.jetbrains.annotations.Nullable()
        java.util.ArrayList<java.lang.String> selectedApps, boolean isExcluded) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}