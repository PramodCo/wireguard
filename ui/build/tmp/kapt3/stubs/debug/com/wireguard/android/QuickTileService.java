package com.wireguard.android;

import java.lang.System;

/**
 * Service that maintains the application's custom Quick Settings tile. This service is bound by the
 * system framework as necessary to update the appearance of the tile in the system UI, and to
 * forward click events to the application.
 */
@androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.N)
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0003\u0016\u0017\u0018B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010\u0013\u001a\u00020\u0011H\u0016J\b\u0010\u0014\u001a\u00020\u0011H\u0016J\b\u0010\u0015\u001a\u00020\u0011H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u00060\u0007R\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u00060\tR\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/wireguard/android/QuickTileService;", "Landroid/service/quicksettings/TileService;", "()V", "iconOff", "Landroid/graphics/drawable/Icon;", "iconOn", "onStateChangedCallback", "Lcom/wireguard/android/QuickTileService$OnStateChangedCallback;", "onTunnelChangedCallback", "Lcom/wireguard/android/QuickTileService$OnTunnelChangedCallback;", "tunnel", "Lcom/wireguard/android/model/ObservableTunnel;", "onBind", "Landroid/os/IBinder;", "intent", "Landroid/content/Intent;", "onClick", "", "onCreate", "onStartListening", "onStopListening", "updateTile", "Companion", "OnStateChangedCallback", "OnTunnelChangedCallback", "ui_debug"})
public final class QuickTileService extends android.service.quicksettings.TileService {
    private final com.wireguard.android.QuickTileService.OnStateChangedCallback onStateChangedCallback = null;
    private final com.wireguard.android.QuickTileService.OnTunnelChangedCallback onTunnelChangedCallback = null;
    private android.graphics.drawable.Icon iconOff;
    private android.graphics.drawable.Icon iconOn;
    private com.wireguard.android.model.ObservableTunnel tunnel;
    private static final java.lang.String TAG = "WireGuard/QuickTileService";
    @org.jetbrains.annotations.NotNull()
    public static final com.wireguard.android.QuickTileService.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.os.IBinder onBind(@org.jetbrains.annotations.NotNull()
    android.content.Intent intent) {
        return null;
    }
    
    @java.lang.Override()
    public void onClick() {
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @java.lang.Override()
    public void onStartListening() {
    }
    
    @java.lang.Override()
    public void onStopListening() {
    }
    
    private final void updateTile() {
    }
    
    public QuickTileService() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016\u00a8\u0006\t"}, d2 = {"Lcom/wireguard/android/QuickTileService$OnStateChangedCallback;", "Landroidx/databinding/Observable$OnPropertyChangedCallback;", "(Lcom/wireguard/android/QuickTileService;)V", "onPropertyChanged", "", "sender", "Landroidx/databinding/Observable;", "propertyId", "", "ui_debug"})
    final class OnStateChangedCallback extends androidx.databinding.Observable.OnPropertyChangedCallback {
        
        @java.lang.Override()
        public void onPropertyChanged(@org.jetbrains.annotations.NotNull()
        androidx.databinding.Observable sender, int propertyId) {
        }
        
        public OnStateChangedCallback() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016\u00a8\u0006\t"}, d2 = {"Lcom/wireguard/android/QuickTileService$OnTunnelChangedCallback;", "Landroidx/databinding/Observable$OnPropertyChangedCallback;", "(Lcom/wireguard/android/QuickTileService;)V", "onPropertyChanged", "", "sender", "Landroidx/databinding/Observable;", "propertyId", "", "ui_debug"})
    final class OnTunnelChangedCallback extends androidx.databinding.Observable.OnPropertyChangedCallback {
        
        @java.lang.Override()
        public void onPropertyChanged(@org.jetbrains.annotations.NotNull()
        androidx.databinding.Observable sender, int propertyId) {
        }
        
        public OnTunnelChangedCallback() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/wireguard/android/QuickTileService$Companion;", "", "()V", "TAG", "", "ui_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}