package com.wireguard.android.databinding;

import java.lang.System;

/**
 * A generic `RecyclerView.Adapter` backed by a `ObservableKeyedArrayList`.
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0010\b\u0001\u0010\u0002*\n\u0012\u0006\b\u0001\u0012\u0002H\u00010\u00032\b\u0012\u0004\u0012\u00020\u00050\u0004:\u0003\'()B-\b\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000b\u00a2\u0006\u0002\u0010\fJ\u0017\u0010\u0015\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0016\u001a\u00020\tH\u0002\u00a2\u0006\u0002\u0010\u0017J\b\u0010\u0018\u001a\u00020\tH\u0016J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\tH\u0016J\u0017\u0010\u001b\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0016\u001a\u00020\tH\u0002\u00a2\u0006\u0002\u0010\u001cJ\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\tH\u0016J\u0018\u0010 \u001a\u00020\u00052\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\tH\u0016J\u001c\u0010$\u001a\u00020\u001e2\u0014\u0010%\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000bJ\u0018\u0010&\u001a\u00020\u001e2\u0010\u0010\u0011\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u0012R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006*"}, d2 = {"Lcom/wireguard/android/databinding/ObservableKeyedRecyclerViewAdapter;", "K", "E", "Lcom/wireguard/android/databinding/Keyed;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/wireguard/android/databinding/ObservableKeyedRecyclerViewAdapter$ViewHolder;", "context", "Landroid/content/Context;", "layoutId", "", "list", "Lcom/wireguard/android/databinding/ObservableKeyedArrayList;", "(Landroid/content/Context;ILcom/wireguard/android/databinding/ObservableKeyedArrayList;)V", "callback", "Lcom/wireguard/android/databinding/ObservableKeyedRecyclerViewAdapter$OnListChangedCallback;", "layoutInflater", "Landroid/view/LayoutInflater;", "rowConfigurationHandler", "Lcom/wireguard/android/databinding/ObservableKeyedRecyclerViewAdapter$RowConfigurationHandler;", "Landroidx/databinding/ViewDataBinding;", "", "getItem", "position", "(I)Lcom/wireguard/android/databinding/Keyed;", "getItemCount", "getItemId", "", "getKey", "(I)Ljava/lang/Object;", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setList", "newList", "setRowConfigurationHandler", "OnListChangedCallback", "RowConfigurationHandler", "ViewHolder", "ui_debug"})
public final class ObservableKeyedRecyclerViewAdapter<K extends java.lang.Object, E extends com.wireguard.android.databinding.Keyed<? extends K>> extends androidx.recyclerview.widget.RecyclerView.Adapter<com.wireguard.android.databinding.ObservableKeyedRecyclerViewAdapter.ViewHolder> {
    private final com.wireguard.android.databinding.ObservableKeyedRecyclerViewAdapter.OnListChangedCallback<E> callback = null;
    private final android.view.LayoutInflater layoutInflater = null;
    private com.wireguard.android.databinding.ObservableKeyedArrayList<K, E> list;
    private com.wireguard.android.databinding.ObservableKeyedRecyclerViewAdapter.RowConfigurationHandler<androidx.databinding.ViewDataBinding, java.lang.Object> rowConfigurationHandler;
    private final int layoutId = 0;
    
    private final E getItem(int position) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public long getItemId(int position) {
        return 0L;
    }
    
    private final K getKey(int position) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.wireguard.android.databinding.ObservableKeyedRecyclerViewAdapter.ViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.wireguard.android.databinding.ObservableKeyedRecyclerViewAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    public final void setList(@org.jetbrains.annotations.Nullable()
    com.wireguard.android.databinding.ObservableKeyedArrayList<K, E> newList) {
    }
    
    public final void setRowConfigurationHandler(@org.jetbrains.annotations.Nullable()
    com.wireguard.android.databinding.ObservableKeyedRecyclerViewAdapter.RowConfigurationHandler<?, ?> rowConfigurationHandler) {
    }
    
    public ObservableKeyedRecyclerViewAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int layoutId, @org.jetbrains.annotations.Nullable()
    com.wireguard.android.databinding.ObservableKeyedArrayList<K, E> list) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u0000*\b\b\u0002\u0010\u0001*\u00020\u0002*\u0004\b\u0003\u0010\u00032\u00020\u0004J%\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00028\u00022\u0006\u0010\b\u001a\u00028\u00032\u0006\u0010\t\u001a\u00020\nH&\u00a2\u0006\u0002\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lcom/wireguard/android/databinding/ObservableKeyedRecyclerViewAdapter$RowConfigurationHandler;", "B", "Landroidx/databinding/ViewDataBinding;", "T", "", "onConfigureRow", "", "binding", "item", "position", "", "(Landroidx/databinding/ViewDataBinding;Ljava/lang/Object;I)V", "ui_debug"})
    public static abstract interface RowConfigurationHandler<B extends androidx.databinding.ViewDataBinding, T extends java.lang.Object> {
        
        public abstract void onConfigureRow(@org.jetbrains.annotations.NotNull()
        B binding, T item, int position);
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0002\u0018\u0000*\f\b\u0002\u0010\u0001*\u0006\u0012\u0002\b\u00030\u00022\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00040\u0003B\u0017\u0012\u0010\u0010\u0005\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0016\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00020\u0004H\u0016J&\u0010\r\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J&\u0010\u0011\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J.\u0010\u0012\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J&\u0010\u0015\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016R\u001e\u0010\b\u001a\u0012\u0012\u000e\u0012\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00020\u00060\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/wireguard/android/databinding/ObservableKeyedRecyclerViewAdapter$OnListChangedCallback;", "E", "Lcom/wireguard/android/databinding/Keyed;", "Landroidx/databinding/ObservableList$OnListChangedCallback;", "Landroidx/databinding/ObservableList;", "adapter", "Lcom/wireguard/android/databinding/ObservableKeyedRecyclerViewAdapter;", "(Lcom/wireguard/android/databinding/ObservableKeyedRecyclerViewAdapter;)V", "weakAdapter", "Ljava/lang/ref/WeakReference;", "onChanged", "", "sender", "onItemRangeChanged", "positionStart", "", "itemCount", "onItemRangeInserted", "onItemRangeMoved", "fromPosition", "toPosition", "onItemRangeRemoved", "ui_debug"})
    static final class OnListChangedCallback<E extends com.wireguard.android.databinding.Keyed<?>> extends androidx.databinding.ObservableList.OnListChangedCallback<androidx.databinding.ObservableList<E>> {
        private final java.lang.ref.WeakReference<com.wireguard.android.databinding.ObservableKeyedRecyclerViewAdapter<?, E>> weakAdapter = null;
        
        @java.lang.Override()
        public void onChanged(@org.jetbrains.annotations.NotNull()
        androidx.databinding.ObservableList<E> sender) {
        }
        
        @java.lang.Override()
        public void onItemRangeChanged(@org.jetbrains.annotations.NotNull()
        androidx.databinding.ObservableList<E> sender, int positionStart, int itemCount) {
        }
        
        @java.lang.Override()
        public void onItemRangeInserted(@org.jetbrains.annotations.NotNull()
        androidx.databinding.ObservableList<E> sender, int positionStart, int itemCount) {
        }
        
        @java.lang.Override()
        public void onItemRangeMoved(@org.jetbrains.annotations.NotNull()
        androidx.databinding.ObservableList<E> sender, int fromPosition, int toPosition, int itemCount) {
        }
        
        @java.lang.Override()
        public void onItemRangeRemoved(@org.jetbrains.annotations.NotNull()
        androidx.databinding.ObservableList<E> sender, int positionStart, int itemCount) {
        }
        
        public OnListChangedCallback(@org.jetbrains.annotations.NotNull()
        com.wireguard.android.databinding.ObservableKeyedRecyclerViewAdapter<?, E> adapter) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/wireguard/android/databinding/ObservableKeyedRecyclerViewAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Landroidx/databinding/ViewDataBinding;", "(Landroidx/databinding/ViewDataBinding;)V", "getBinding", "()Landroidx/databinding/ViewDataBinding;", "ui_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final androidx.databinding.ViewDataBinding binding = null;
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.databinding.ViewDataBinding getBinding() {
            return null;
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        androidx.databinding.ViewDataBinding binding) {
            super(null);
        }
    }
}