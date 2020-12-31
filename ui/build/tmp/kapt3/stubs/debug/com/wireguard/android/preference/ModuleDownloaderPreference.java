package com.wireguard.android.preference;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u000fB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\rH\u0014J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\bH\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/wireguard/android/preference/ModuleDownloaderPreference;", "Landroidx/preference/Preference;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "state", "Lcom/wireguard/android/preference/ModuleDownloaderPreference$State;", "getSummary", "", "getTitle", "onClick", "", "setState", "State", "ui_debug"})
public final class ModuleDownloaderPreference extends androidx.preference.Preference {
    private com.wireguard.android.preference.ModuleDownloaderPreference.State state = com.wireguard.android.preference.ModuleDownloaderPreference.State.INITIAL;
    
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
    
    private final void setState(com.wireguard.android.preference.ModuleDownloaderPreference.State state) {
    }
    
    public ModuleDownloaderPreference(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null, null, 0, 0);
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f\u00a8\u0006\u0010"}, d2 = {"Lcom/wireguard/android/preference/ModuleDownloaderPreference$State;", "", "messageResourceId", "", "shouldEnableView", "", "(Ljava/lang/String;IIZ)V", "getMessageResourceId", "()I", "getShouldEnableView", "()Z", "INITIAL", "FAILURE", "WORKING", "SUCCESS", "NOTFOUND", "ui_debug"})
    static enum State {
        /*public static final*/ INITIAL /* = new INITIAL(0, false) */,
        /*public static final*/ FAILURE /* = new FAILURE(0, false) */,
        /*public static final*/ WORKING /* = new WORKING(0, false) */,
        /*public static final*/ SUCCESS /* = new SUCCESS(0, false) */,
        /*public static final*/ NOTFOUND /* = new NOTFOUND(0, false) */;
        private final int messageResourceId = 0;
        private final boolean shouldEnableView = false;
        
        public final int getMessageResourceId() {
            return 0;
        }
        
        public final boolean getShouldEnableView() {
            return false;
        }
        
        State(int messageResourceId, boolean shouldEnableView) {
        }
    }
}