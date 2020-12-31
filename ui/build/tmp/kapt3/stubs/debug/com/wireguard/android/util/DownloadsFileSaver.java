package com.wireguard.android.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0011B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J-\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000f\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082.\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lcom/wireguard/android/util/DownloadsFileSaver;", "", "context", "Landroidx/activity/ComponentActivity;", "(Landroidx/activity/ComponentActivity;)V", "activityResult", "Landroidx/activity/result/ActivityResultLauncher;", "", "futureGrant", "Lkotlinx/coroutines/CompletableDeferred;", "", "save", "Lcom/wireguard/android/util/DownloadsFileSaver$DownloadsFile;", "name", "mimeType", "overwriteExisting", "(Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "DownloadsFile", "ui_debug"})
public final class DownloadsFileSaver {
    private androidx.activity.result.ActivityResultLauncher<java.lang.String> activityResult;
    private kotlinx.coroutines.CompletableDeferred<java.lang.Boolean> futureGrant;
    private final androidx.activity.ComponentActivity context = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object save(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.String mimeType, boolean overwriteExisting, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.wireguard.android.util.DownloadsFileSaver.DownloadsFile> p3) {
        return null;
    }
    
    public DownloadsFileSaver(@org.jetbrains.annotations.NotNull()
    androidx.activity.ComponentActivity context) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\nJ\u0011\u0010\u000f\u001a\u00020\u0001H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/wireguard/android/util/DownloadsFileSaver$DownloadsFile;", "", "context", "Landroid/content/Context;", "outputStream", "Ljava/io/OutputStream;", "fileName", "", "uri", "Landroid/net/Uri;", "(Landroid/content/Context;Ljava/io/OutputStream;Ljava/lang/String;Landroid/net/Uri;)V", "getFileName", "()Ljava/lang/String;", "getOutputStream", "()Ljava/io/OutputStream;", "delete", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ui_debug"})
    public static final class DownloadsFile {
        private final android.content.Context context = null;
        @org.jetbrains.annotations.NotNull()
        private final java.io.OutputStream outputStream = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String fileName = null;
        private final android.net.Uri uri = null;
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object delete(@org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<java.lang.Object> p0) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.io.OutputStream getOutputStream() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getFileName() {
            return null;
        }
        
        public DownloadsFile(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        java.io.OutputStream outputStream, @org.jetbrains.annotations.NotNull()
        java.lang.String fileName, @org.jetbrains.annotations.Nullable()
        android.net.Uri uri) {
            super();
        }
    }
}