package com.wireguard.android.databinding;

import java.lang.System;

/**
 * Static methods for use by generated code in the Android data binding library.
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\"\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\n2\u0010\u0010\u000e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u000fH\u0007J\"\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\n2\u0010\u0010\u0012\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0018\u00010\u000fH\u0007JZ\u0010\u0014\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00152\u0006\u0010\u0005\u001a\u00020\u00162\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u0002H\u0015\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u0002H\u0015\u0018\u00010\u00182\u0006\u0010\u001e\u001a\u00020\u001a2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001cH\u0007JF\u0010\u0014\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00152\u0006\u0010\u0005\u001a\u00020\u00162\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u0002H\u0015\u0018\u00010\u000f2\u0006\u0010\u0019\u001a\u00020\u001a2\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u0002H\u0015\u0018\u00010\u000f2\u0006\u0010\u001e\u001a\u00020\u001aH\u0007J\u0088\u0001\u0010\u0014\u001a\u00020\u0004\"\u0004\b\u0000\u0010 \"\u0010\b\u0001\u0010\u0015*\n\u0012\u0006\b\u0001\u0012\u0002H 0!2\u0006\u0010\u0005\u001a\u00020\"2\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u0002H \u0012\u0004\u0012\u0002H\u0015\u0018\u00010#2\u0006\u0010\u0019\u001a\u00020\u001a2\u0010\u0010$\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010%2\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u0002H \u0012\u0004\u0012\u0002H\u0015\u0018\u00010#2\u0006\u0010\u001e\u001a\u00020\u001a2\u0010\u0010&\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010%H\u0007J\u001a\u0010\'\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010(\u001a\u0004\u0018\u00010)H\u0007J\u001a\u0010*\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020+2\b\u0010(\u001a\u0004\u0018\u00010,H\u0007J\u001e\u0010-\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\n2\f\u0010.\u001a\b\u0012\u0002\b\u0003\u0018\u00010/H\u0007J\u0012\u00100\u001a\u00020\u001a2\b\u00101\u001a\u0004\u0018\u000102H\u0007\u00a8\u00063"}, d2 = {"Lcom/wireguard/android/databinding/BindingAdapters;", "", "()V", "setChecked", "", "view", "Lcom/wireguard/android/widget/ToggleSwitch;", "checked", "", "setFilter", "Landroid/widget/TextView;", "filter", "Landroid/text/InputFilter;", "setInetAddressSetText", "addresses", "", "Ljava/net/InetAddress;", "setInetNetworkSetText", "networks", "Lcom/wireguard/config/InetNetwork;", "setItems", "E", "Landroid/widget/LinearLayout;", "oldList", "Landroidx/databinding/ObservableList;", "oldLayoutId", "", "oldFragment", "Landroidx/fragment/app/Fragment;", "newList", "newLayoutId", "newFragment", "K", "Lcom/wireguard/android/databinding/Keyed;", "Landroidx/recyclerview/widget/RecyclerView;", "Lcom/wireguard/android/databinding/ObservableKeyedArrayList;", "oldRowConfigurationHandler", "Lcom/wireguard/android/databinding/ObservableKeyedRecyclerViewAdapter$RowConfigurationHandler;", "newRowConfigurationHandler", "setOnBeforeCheckedChanged", "listener", "Lcom/wireguard/android/widget/ToggleSwitch$OnBeforeCheckedChangeListener;", "setOnFocusChange", "Landroid/widget/EditText;", "Landroid/view/View$OnFocusChangeListener;", "setOptionalText", "text", "Ljava/util/Optional;", "tryParseInt", "s", "", "ui_debug"})
public final class BindingAdapters {
    @org.jetbrains.annotations.NotNull()
    public static final com.wireguard.android.databinding.BindingAdapters INSTANCE = null;
    
    @androidx.databinding.BindingAdapter(value = {"checked"})
    public static final void setChecked(@org.jetbrains.annotations.NotNull()
    com.wireguard.android.widget.ToggleSwitch view, boolean checked) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"filter"})
    public static final void setFilter(@org.jetbrains.annotations.NotNull()
    android.widget.TextView view, @org.jetbrains.annotations.NotNull()
    android.text.InputFilter filter) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"items", "layout", "fragment"})
    public static final <E extends java.lang.Object>void setItems(@org.jetbrains.annotations.NotNull()
    android.widget.LinearLayout view, @org.jetbrains.annotations.Nullable()
    androidx.databinding.ObservableList<E> oldList, int oldLayoutId, @org.jetbrains.annotations.Nullable()
    @kotlin.Suppress(names = {"UNUSED_PARAMETER"})
    androidx.fragment.app.Fragment oldFragment, @org.jetbrains.annotations.Nullable()
    androidx.databinding.ObservableList<E> newList, int newLayoutId, @org.jetbrains.annotations.Nullable()
    androidx.fragment.app.Fragment newFragment) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"items", "layout"})
    public static final <E extends java.lang.Object>void setItems(@org.jetbrains.annotations.NotNull()
    android.widget.LinearLayout view, @org.jetbrains.annotations.Nullable()
    java.lang.Iterable<? extends E> oldList, int oldLayoutId, @org.jetbrains.annotations.Nullable()
    java.lang.Iterable<? extends E> newList, int newLayoutId) {
    }
    
    @androidx.databinding.BindingAdapter(requireAll = false, value = {"items", "layout", "configurationHandler"})
    public static final <K extends java.lang.Object, E extends com.wireguard.android.databinding.Keyed<? extends K>>void setItems(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView view, @org.jetbrains.annotations.Nullable()
    com.wireguard.android.databinding.ObservableKeyedArrayList<K, E> oldList, int oldLayoutId, @org.jetbrains.annotations.Nullable()
    @kotlin.Suppress(names = {"UNUSED_PARAMETER"})
    com.wireguard.android.databinding.ObservableKeyedRecyclerViewAdapter.RowConfigurationHandler<?, ?> oldRowConfigurationHandler, @org.jetbrains.annotations.Nullable()
    com.wireguard.android.databinding.ObservableKeyedArrayList<K, E> newList, int newLayoutId, @org.jetbrains.annotations.Nullable()
    com.wireguard.android.databinding.ObservableKeyedRecyclerViewAdapter.RowConfigurationHandler<?, ?> newRowConfigurationHandler) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"onBeforeCheckedChanged"})
    public static final void setOnBeforeCheckedChanged(@org.jetbrains.annotations.NotNull()
    com.wireguard.android.widget.ToggleSwitch view, @org.jetbrains.annotations.Nullable()
    com.wireguard.android.widget.ToggleSwitch.OnBeforeCheckedChangeListener listener) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"onFocusChange"})
    public static final void setOnFocusChange(@org.jetbrains.annotations.NotNull()
    android.widget.EditText view, @org.jetbrains.annotations.Nullable()
    android.view.View.OnFocusChangeListener listener) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"android:text"})
    public static final void setOptionalText(@org.jetbrains.annotations.NotNull()
    android.widget.TextView view, @org.jetbrains.annotations.Nullable()
    java.util.Optional<?> text) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"android:text"})
    public static final void setInetNetworkSetText(@org.jetbrains.annotations.NotNull()
    android.widget.TextView view, @org.jetbrains.annotations.Nullable()
    java.lang.Iterable<com.wireguard.config.InetNetwork> networks) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"android:text"})
    public static final void setInetAddressSetText(@org.jetbrains.annotations.NotNull()
    android.widget.TextView view, @org.jetbrains.annotations.Nullable()
    java.lang.Iterable<? extends java.net.InetAddress> addresses) {
    }
    
    public static final int tryParseInt(@org.jetbrains.annotations.Nullable()
    java.lang.String s) {
        return 0;
    }
    
    private BindingAdapters() {
        super();
    }
}