package com.wireguard.android.preference;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u000f2\u00020\u0001:\u0002\u000f\u0010B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\rH\u0014J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\bH\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/wireguard/android/preference/KernelModuleDisablerPreference;", "Landroidx/preference/Preference;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "state", "Lcom/wireguard/android/preference/KernelModuleDisablerPreference$State;", "getSummary", "", "getTitle", "onClick", "", "setState", "Companion", "State", "ui_debug"})
public final class KernelModuleDisablerPreference extends androidx.preference.Preference {
    private com.wireguard.android.preference.KernelModuleDisablerPreference.State state = com.wireguard.android.preference.KernelModuleDisablerPreference.State.UNKNOWN;
    private static final java.lang.String TAG = "WireGuard/KernelModuleDisablerPreference";
    @org.jetbrains.annotations.NotNull()
    public static final com.wireguard.android.preference.KernelModuleDisablerPreference.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getSummary() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getTitle() {
        return null;
    }
    
    @java.lang.Override()
    protected void onClick() {
    }
    
    private final void setState(com.wireguard.android.preference.KernelModuleDisablerPreference.State state) {
    }
    
    public KernelModuleDisablerPreference(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null, null, 0, 0);
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\'\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\nj\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013\u00a8\u0006\u0014"}, d2 = {"Lcom/wireguard/android/preference/KernelModuleDisablerPreference$State;", "", "titleResourceId", "", "summaryResourceId", "shouldEnableView", "", "visible", "(Ljava/lang/String;IIIZZ)V", "getShouldEnableView", "()Z", "getSummaryResourceId", "()I", "getTitleResourceId", "getVisible", "UNKNOWN", "ENABLED", "DISABLED", "ENABLING", "DISABLING", "ui_debug"})
    static enum State {
        /*public static final*/ UNKNOWN /* = new UNKNOWN(0, 0, false, false) */,
        /*public static final*/ ENABLED /* = new ENABLED(0, 0, false, false) */,
        /*public static final*/ DISABLED /* = new DISABLED(0, 0, false, false) */,
        /*public static final*/ ENABLING /* = new ENABLING(0, 0, false, false) */,
        /*public static final*/ DISABLING /* = new DISABLING(0, 0, false, false) */;
        private final int titleResourceId = 0;
        private final int summaryResourceId = 0;
        private final boolean shouldEnableView = false;
        private final boolean visible = false;
        
        public final int getTitleResourceId() {
            return 0;
        }
        
        public final int getSummaryResourceId() {
            return 0;
        }
        
        public final boolean getShouldEnableView() {
            return false;
        }
        
        public final boolean getVisible() {
            return false;
        }
        
        State(int titleResourceId, int summaryResourceId, boolean shouldEnableView, boolean visible) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/wireguard/android/preference/KernelModuleDisablerPreference$Companion;", "", "()V", "TAG", "", "ui_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}