package com.wireguard.android.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u000b\u0018\u0000 @2\u00020\u00012\u00020\u0002:\u0005?@ABCB\u000f\b\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005B\u000f\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bB\u0007\b\u0016\u00a2\u0006\u0002\u0010\tJ\u000e\u0010-\u001a\u00020.2\u0006\u0010\u001e\u001a\u00020\u001fJ\b\u0010/\u001a\u00020.H\u0002J\b\u00100\u001a\u00020,H\u0016J\u0016\u00101\u001a\u0010\u0012\f\u0012\n 3*\u0004\u0018\u00010\u000b0\u000b02H\u0002J\u0006\u00104\u001a\u00020\u0007J\u000e\u00105\u001a\u00020.2\u0006\u00106\u001a\u00020\u001bJ\u0010\u00107\u001a\u00020.2\u0006\u00108\u001a\u000209H\u0002J\u0010\u0010:\u001a\u00020.2\u0006\u0010+\u001a\u00020,H\u0002J\u0006\u0010;\u001a\u00020.J\u0018\u0010<\u001a\u00020.2\u0006\u0010=\u001a\u00020\u00042\u0006\u0010>\u001a\u00020,H\u0016R&\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b8G@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R&\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b8G@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000e\"\u0004\b\u0017\u0010\u0010R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u001a\u001a\u00020\u001b8G\u00a2\u0006\u0006\u001a\u0004\b\u001a\u0010\u001cR\u0011\u0010\u001d\u001a\u00020\u001b8G\u00a2\u0006\u0006\u001a\u0004\b\u001d\u0010\u001cR\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010!X\u0082\u000e\u00a2\u0006\u0002\n\u0000R&\u0010\"\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b8G@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u000e\"\u0004\b$\u0010\u0010R&\u0010%\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b8G@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u000e\"\u0004\b\'\u0010\u0010R&\u0010(\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b8G@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u000e\"\u0004\b*\u0010\u0010R\u000e\u0010+\u001a\u00020,X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006D"}, d2 = {"Lcom/wireguard/android/viewmodel/PeerProxy;", "Landroidx/databinding/BaseObservable;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "other", "Lcom/wireguard/config/Peer;", "(Lcom/wireguard/config/Peer;)V", "()V", "value", "", "allowedIps", "getAllowedIps", "()Ljava/lang/String;", "setAllowedIps", "(Ljava/lang/String;)V", "allowedIpsState", "Lcom/wireguard/android/viewmodel/PeerProxy$AllowedIpsState;", "dnsRoutes", "", "endpoint", "getEndpoint", "setEndpoint", "interfaceDnsListener", "Lcom/wireguard/android/viewmodel/PeerProxy$InterfaceDnsListener;", "isAbleToExcludePrivateIps", "", "()Z", "isExcludingPrivateIps", "owner", "Lcom/wireguard/android/viewmodel/ConfigProxy;", "peerListListener", "Lcom/wireguard/android/viewmodel/PeerProxy$PeerListListener;", "persistentKeepalive", "getPersistentKeepalive", "setPersistentKeepalive", "preSharedKey", "getPreSharedKey", "setPreSharedKey", "publicKey", "getPublicKey", "setPublicKey", "totalPeers", "", "bind", "", "calculateAllowedIpsState", "describeContents", "getAllowedIpsSet", "", "kotlin.jvm.PlatformType", "resolve", "setExcludingPrivateIps", "excludingPrivateIps", "setInterfaceDns", "dnsServers", "", "setTotalPeers", "unbind", "writeToParcel", "dest", "flags", "AllowedIpsState", "Companion", "InterfaceDnsListener", "PeerListListener", "PeerProxyCreator", "ui_debug"})
public final class PeerProxy extends androidx.databinding.BaseObservable implements android.os.Parcelable {
    private final java.util.List<java.lang.String> dnsRoutes = null;
    private com.wireguard.android.viewmodel.PeerProxy.AllowedIpsState allowedIpsState = com.wireguard.android.viewmodel.PeerProxy.AllowedIpsState.INVALID;
    private com.wireguard.android.viewmodel.PeerProxy.InterfaceDnsListener interfaceDnsListener;
    private com.wireguard.android.viewmodel.PeerProxy.PeerListListener peerListListener;
    private com.wireguard.android.viewmodel.ConfigProxy owner;
    private int totalPeers = 0;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String allowedIps = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String endpoint = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String persistentKeepalive = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String preSharedKey = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String publicKey = "";
    @org.jetbrains.annotations.NotNull()
    public static final android.os.Parcelable.Creator<com.wireguard.android.viewmodel.PeerProxy> CREATOR = null;
    private static final java.util.Set<java.lang.String> IPV4_PUBLIC_NETWORKS = null;
    private static final java.util.Set<java.lang.String> IPV4_WILDCARD = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.wireguard.android.viewmodel.PeerProxy.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @androidx.databinding.Bindable()
    public final java.lang.String getAllowedIps() {
        return null;
    }
    
    public final void setAllowedIps(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.databinding.Bindable()
    public final java.lang.String getEndpoint() {
        return null;
    }
    
    public final void setEndpoint(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.databinding.Bindable()
    public final java.lang.String getPersistentKeepalive() {
        return null;
    }
    
    public final void setPersistentKeepalive(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.databinding.Bindable()
    public final java.lang.String getPreSharedKey() {
        return null;
    }
    
    public final void setPreSharedKey(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.databinding.Bindable()
    public final java.lang.String getPublicKey() {
        return null;
    }
    
    public final void setPublicKey(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    @androidx.databinding.Bindable()
    public final boolean isAbleToExcludePrivateIps() {
        return false;
    }
    
    @androidx.databinding.Bindable()
    public final boolean isExcludingPrivateIps() {
        return false;
    }
    
    public final void bind(@org.jetbrains.annotations.NotNull()
    com.wireguard.android.viewmodel.ConfigProxy owner) {
    }
    
    private final void calculateAllowedIpsState() {
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    private final java.util.Set<java.lang.String> getAllowedIpsSet() {
        return null;
    }
    
    public final void setExcludingPrivateIps(boolean excludingPrivateIps) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.wireguard.config.Peer resolve() throws com.wireguard.config.BadConfigException {
        return null;
    }
    
    private final void setInterfaceDns(java.lang.CharSequence dnsServers) {
    }
    
    private final void setTotalPeers(int totalPeers) {
    }
    
    public final void unbind() {
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel dest, int flags) {
    }
    
    private PeerProxy(android.os.Parcel parcel) {
        super();
    }
    
    public PeerProxy(@org.jetbrains.annotations.NotNull()
    com.wireguard.config.Peer other) {
        super();
    }
    
    public PeerProxy() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/wireguard/android/viewmodel/PeerProxy$AllowedIpsState;", "", "(Ljava/lang/String;I)V", "CONTAINS_IPV4_PUBLIC_NETWORKS", "CONTAINS_IPV4_WILDCARD", "INVALID", "OTHER", "ui_debug"})
    static enum AllowedIpsState {
        /*public static final*/ CONTAINS_IPV4_PUBLIC_NETWORKS /* = new CONTAINS_IPV4_PUBLIC_NETWORKS() */,
        /*public static final*/ CONTAINS_IPV4_WILDCARD /* = new CONTAINS_IPV4_WILDCARD() */,
        /*public static final*/ INVALID /* = new INVALID() */,
        /*public static final*/ OTHER /* = new OTHER() */;
        
        AllowedIpsState() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/wireguard/android/viewmodel/PeerProxy$InterfaceDnsListener;", "Landroidx/databinding/Observable$OnPropertyChangedCallback;", "peerProxy", "Lcom/wireguard/android/viewmodel/PeerProxy;", "(Lcom/wireguard/android/viewmodel/PeerProxy;)V", "weakPeerProxy", "Ljava/lang/ref/WeakReference;", "onPropertyChanged", "", "sender", "Landroidx/databinding/Observable;", "propertyId", "", "ui_debug"})
    static final class InterfaceDnsListener extends androidx.databinding.Observable.OnPropertyChangedCallback {
        private final java.lang.ref.WeakReference<com.wireguard.android.viewmodel.PeerProxy> weakPeerProxy = null;
        
        @java.lang.Override()
        public void onPropertyChanged(@org.jetbrains.annotations.NotNull()
        androidx.databinding.Observable sender, int propertyId) {
        }
        
        public InterfaceDnsListener(@org.jetbrains.annotations.NotNull()
        com.wireguard.android.viewmodel.PeerProxy peerProxy) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0002\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\u0018\u0010\b\u001a\u00020\t2\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0016J(\u0010\u000b\u001a\u00020\t2\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016J(\u0010\u000f\u001a\u00020\t2\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016J0\u0010\u0010\u001a\u00020\t2\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016J(\u0010\u0013\u001a\u00020\t2\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/wireguard/android/viewmodel/PeerProxy$PeerListListener;", "Landroidx/databinding/ObservableList$OnListChangedCallback;", "Landroidx/databinding/ObservableList;", "Lcom/wireguard/android/viewmodel/PeerProxy;", "peerProxy", "(Lcom/wireguard/android/viewmodel/PeerProxy;)V", "weakPeerProxy", "Ljava/lang/ref/WeakReference;", "onChanged", "", "sender", "onItemRangeChanged", "positionStart", "", "itemCount", "onItemRangeInserted", "onItemRangeMoved", "fromPosition", "toPosition", "onItemRangeRemoved", "ui_debug"})
    static final class PeerListListener extends androidx.databinding.ObservableList.OnListChangedCallback<androidx.databinding.ObservableList<com.wireguard.android.viewmodel.PeerProxy>> {
        private final java.lang.ref.WeakReference<com.wireguard.android.viewmodel.PeerProxy> weakPeerProxy = null;
        
        @java.lang.Override()
        public void onChanged(@org.jetbrains.annotations.NotNull()
        androidx.databinding.ObservableList<com.wireguard.android.viewmodel.PeerProxy> sender) {
        }
        
        @java.lang.Override()
        public void onItemRangeChanged(@org.jetbrains.annotations.NotNull()
        androidx.databinding.ObservableList<com.wireguard.android.viewmodel.PeerProxy> sender, int positionStart, int itemCount) {
        }
        
        @java.lang.Override()
        public void onItemRangeInserted(@org.jetbrains.annotations.NotNull()
        androidx.databinding.ObservableList<com.wireguard.android.viewmodel.PeerProxy> sender, int positionStart, int itemCount) {
        }
        
        @java.lang.Override()
        public void onItemRangeMoved(@org.jetbrains.annotations.NotNull()
        androidx.databinding.ObservableList<com.wireguard.android.viewmodel.PeerProxy> sender, int fromPosition, int toPosition, int itemCount) {
        }
        
        @java.lang.Override()
        public void onItemRangeRemoved(@org.jetbrains.annotations.NotNull()
        androidx.databinding.ObservableList<com.wireguard.android.viewmodel.PeerProxy> sender, int positionStart, int itemCount) {
        }
        
        public PeerListListener(@org.jetbrains.annotations.NotNull()
        com.wireguard.android.viewmodel.PeerProxy peerProxy) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016\u00a2\u0006\u0002\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lcom/wireguard/android/viewmodel/PeerProxy$PeerProxyCreator;", "Landroid/os/Parcelable$Creator;", "Lcom/wireguard/android/viewmodel/PeerProxy;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/wireguard/android/viewmodel/PeerProxy;", "ui_debug"})
    static final class PeerProxyCreator implements android.os.Parcelable.Creator<com.wireguard.android.viewmodel.PeerProxy> {
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.wireguard.android.viewmodel.PeerProxy createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel parcel) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.wireguard.android.viewmodel.PeerProxy[] newArray(int size) {
            return null;
        }
        
        public PeerProxyCreator() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/wireguard/android/viewmodel/PeerProxy$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lcom/wireguard/android/viewmodel/PeerProxy;", "IPV4_PUBLIC_NETWORKS", "", "", "IPV4_WILDCARD", "ui_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}