package com.wireguard.android.widget;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0013B\u001d\b\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\bH\u0016J\u000e\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\bJ\u0010\u0010\u0012\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\nR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/wireguard/android/widget/ToggleSwitch;", "Landroid/widget/Switch;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "isRestoringState", "", "listener", "Lcom/wireguard/android/widget/ToggleSwitch$OnBeforeCheckedChangeListener;", "onRestoreInstanceState", "", "state", "Landroid/os/Parcelable;", "setChecked", "checked", "setCheckedInternal", "setOnBeforeCheckedChangeListener", "OnBeforeCheckedChangeListener", "ui_debug"})
public final class ToggleSwitch extends android.widget.Switch {
    private boolean isRestoringState = false;
    private com.wireguard.android.widget.ToggleSwitch.OnBeforeCheckedChangeListener listener;
    
    @java.lang.Override()
    public void onRestoreInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Parcelable state) {
    }
    
    @java.lang.Override()
    public void setChecked(boolean checked) {
    }
    
    public final void setCheckedInternal(boolean checked) {
    }
    
    public final void setOnBeforeCheckedChangeListener(@org.jetbrains.annotations.Nullable()
    com.wireguard.android.widget.ToggleSwitch.OnBeforeCheckedChangeListener listener) {
    }
    
    public ToggleSwitch(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public ToggleSwitch(@org.jetbrains.annotations.Nullable()
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/wireguard/android/widget/ToggleSwitch$OnBeforeCheckedChangeListener;", "", "onBeforeCheckedChanged", "", "toggleSwitch", "Lcom/wireguard/android/widget/ToggleSwitch;", "checked", "", "ui_debug"})
    public static abstract interface OnBeforeCheckedChangeListener {
        
        public abstract void onBeforeCheckedChanged(@org.jetbrains.annotations.Nullable()
        com.wireguard.android.widget.ToggleSwitch toggleSwitch, boolean checked);
    }
}