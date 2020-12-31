package com.wireguard.android.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 ?2\u00020\u0001:\u0004?@ABB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/H\u0014J\u0012\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u000103H\u0016J\u0010\u00104\u001a\u0002012\u0006\u00105\u001a\u00020\"H\u0016J\u0012\u00106\u001a\u0004\u0018\u00010\u001c2\u0006\u00107\u001a\u00020\'H\u0002J\u0012\u00108\u001a\u0004\u0018\u0001092\u0006\u0010:\u001a\u00020\'H\u0002J\b\u0010;\u001a\u00020-H\u0002J\u0011\u0010<\u001a\u00020-H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010=J\u0011\u0010>\u001a\u00020-H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010=R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\f\u0010\bR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0010\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\n\u001a\u0004\b\u0011\u0010\bR\u001b\u0010\u0013\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0015\u0010\n\u001a\u0004\b\u0014\u0010\bR\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0018\u001a\u00060\u0019R\u00020\u0000X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010#\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b%\u0010\n\u001a\u0004\b$\u0010\bR#\u0010&\u001a\n (*\u0004\u0018\u00010\'0\'8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b+\u0010\n\u001a\u0004\b)\u0010*\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006C"}, d2 = {"Lcom/wireguard/android/activity/LogViewerActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/wireguard/android/databinding/LogViewerActivityBinding;", "debugColor", "", "getDebugColor", "()I", "debugColor$delegate", "Lkotlin/Lazy;", "defaultColor", "getDefaultColor", "defaultColor$delegate", "downloadsFileSaver", "Lcom/wireguard/android/util/DownloadsFileSaver;", "errorColor", "getErrorColor", "errorColor$delegate", "infoColor", "getInfoColor", "infoColor$delegate", "lastUri", "Landroid/net/Uri;", "logAdapter", "Lcom/wireguard/android/activity/LogViewerActivity$LogEntryAdapter;", "logLines", "Ljava/util/ArrayList;", "Lcom/wireguard/android/activity/LogViewerActivity$LogLine;", "rawLogLines", "Ljava/lang/StringBuffer;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "saveButton", "Landroid/view/MenuItem;", "warningColor", "getWarningColor", "warningColor$delegate", "year", "", "kotlin.jvm.PlatformType", "getYear", "()Ljava/lang/String;", "year$delegate", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "", "menu", "Landroid/view/Menu;", "onOptionsItemSelected", "item", "parseLine", "line", "parseTime", "Ljava/util/Date;", "timeStr", "revokeLastUri", "saveLog", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "streamingLog", "Companion", "ExportedLogContentProvider", "LogEntryAdapter", "LogLine", "ui_debug"})
public final class LogViewerActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.wireguard.android.databinding.LogViewerActivityBinding binding;
    private com.wireguard.android.activity.LogViewerActivity.LogEntryAdapter logAdapter;
    private java.util.ArrayList<com.wireguard.android.activity.LogViewerActivity.LogLine> logLines;
    private java.lang.StringBuffer rawLogLines;
    private androidx.recyclerview.widget.RecyclerView recyclerView;
    private android.view.MenuItem saveButton;
    private final kotlin.Lazy year$delegate = null;
    private final kotlin.Lazy defaultColor$delegate = null;
    private final kotlin.Lazy debugColor$delegate = null;
    private final kotlin.Lazy errorColor$delegate = null;
    private final kotlin.Lazy infoColor$delegate = null;
    private final kotlin.Lazy warningColor$delegate = null;
    private android.net.Uri lastUri;
    private final com.wireguard.android.util.DownloadsFileSaver downloadsFileSaver = null;
    
    /**
     * Match a single line of `logcat -v threadtime`, such as:
     *
     * <pre>05-26 11:02:36.886 5689 5689 D AndroidRuntime: CheckJNI is OFF.</pre>
     */
    private static final java.util.regex.Pattern THREADTIME_LINE = null;
    private static final java.util.Map<java.lang.String, byte[]> LOGS = null;
    private static final java.lang.String TAG = "WireGuard/LogViewerActivity";
    @org.jetbrains.annotations.NotNull()
    public static final com.wireguard.android.activity.LogViewerActivity.Companion Companion = null;
    
    private final java.lang.String getYear() {
        return null;
    }
    
    private final int getDefaultColor() {
        return 0;
    }
    
    private final int getDebugColor() {
        return 0;
    }
    
    private final int getErrorColor() {
        return 0;
    }
    
    private final int getInfoColor() {
        return 0;
    }
    
    private final int getWarningColor() {
        return 0;
    }
    
    private final void revokeLastUri() {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.Nullable()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    private final java.util.Date parseTime(java.lang.String timeStr) {
        return null;
    }
    
    private final com.wireguard.android.activity.LogViewerActivity.LogLine parseLine(java.lang.String line) {
        return null;
    }
    
    public LogViewerActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\bH\u00c6\u0003J\t\u0010\u001b\u001a\u00020\bH\u00c6\u0003J\t\u0010\u001c\u001a\u00020\bH\u00c6\u0003JG\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\bH\u00c6\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010!\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\"\u001a\u00020\bH\u00d6\u0001R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\n\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\r\"\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006#"}, d2 = {"Lcom/wireguard/android/activity/LogViewerActivity$LogLine;", "", "pid", "", "tid", "time", "Ljava/util/Date;", "level", "", "tag", "msg", "(IILjava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getLevel", "()Ljava/lang/String;", "getMsg", "setMsg", "(Ljava/lang/String;)V", "getPid", "()I", "getTag", "getTid", "getTime", "()Ljava/util/Date;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "ui_debug"})
    static final class LogLine {
        private final int pid = 0;
        private final int tid = 0;
        @org.jetbrains.annotations.Nullable()
        private final java.util.Date time = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String level = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String tag = null;
        @org.jetbrains.annotations.NotNull()
        private java.lang.String msg;
        
        public final int getPid() {
            return 0;
        }
        
        public final int getTid() {
            return 0;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.Date getTime() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getLevel() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTag() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getMsg() {
            return null;
        }
        
        public final void setMsg(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        public LogLine(int pid, int tid, @org.jetbrains.annotations.Nullable()
        java.util.Date time, @org.jetbrains.annotations.NotNull()
        java.lang.String level, @org.jetbrains.annotations.NotNull()
        java.lang.String tag, @org.jetbrains.annotations.NotNull()
        java.lang.String msg) {
            super();
        }
        
        public final int component1() {
            return 0;
        }
        
        public final int component2() {
            return 0;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.Date component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component4() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component5() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component6() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.wireguard.android.activity.LogViewerActivity.LogLine copy(int pid, int tid, @org.jetbrains.annotations.Nullable()
        java.util.Date time, @org.jetbrains.annotations.NotNull()
        java.lang.String level, @org.jetbrains.annotations.NotNull()
        java.lang.String tag, @org.jetbrains.annotations.NotNull()
        java.lang.String msg) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u0010\u0012\f\u0012\n0\u0002R\u00060\u0000R\u00020\u00030\u0001:\u0001\u0012B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0002J \u0010\n\u001a\u00020\u000b2\u000e\u0010\f\u001a\n0\u0002R\u00060\u0000R\u00020\u00032\u0006\u0010\r\u001a\u00020\u0006H\u0016J \u0010\u000e\u001a\n0\u0002R\u00060\u0000R\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0006H\u0016\u00a8\u0006\u0013"}, d2 = {"Lcom/wireguard/android/activity/LogViewerActivity$LogEntryAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/wireguard/android/activity/LogViewerActivity$LogEntryAdapter$ViewHolder;", "Lcom/wireguard/android/activity/LogViewerActivity;", "(Lcom/wireguard/android/activity/LogViewerActivity;)V", "getItemCount", "", "levelToColor", "level", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "ui_debug"})
    final class LogEntryAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.wireguard.android.activity.LogViewerActivity.LogEntryAdapter.ViewHolder> {
        
        private final int levelToColor(java.lang.String level) {
            return 0;
        }
        
        @java.lang.Override()
        public int getItemCount() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.wireguard.android.activity.LogViewerActivity.LogEntryAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent, int viewType) {
            return null;
        }
        
        @java.lang.Override()
        public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
        com.wireguard.android.activity.LogViewerActivity.LogEntryAdapter.ViewHolder holder, int position) {
        }
        
        public LogEntryAdapter() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0007\"\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lcom/wireguard/android/activity/LogViewerActivity$LogEntryAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "layout", "Landroid/view/View;", "isSingleLine", "", "(Lcom/wireguard/android/activity/LogViewerActivity$LogEntryAdapter;Landroid/view/View;Z)V", "()Z", "setSingleLine", "(Z)V", "getLayout", "()Landroid/view/View;", "ui_debug"})
        final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
            @org.jetbrains.annotations.NotNull()
            private final android.view.View layout = null;
            private boolean isSingleLine;
            
            @org.jetbrains.annotations.NotNull()
            public final android.view.View getLayout() {
                return null;
            }
            
            public final boolean isSingleLine() {
                return false;
            }
            
            public final void setSingleLine(boolean p0) {
            }
            
            public ViewHolder(@org.jetbrains.annotations.NotNull()
            android.view.View layout, boolean isSingleLine) {
                super(null);
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J1\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0010\u0010\t\u001a\f\u0012\u0006\b\u0001\u0012\u00020\b\u0018\u00010\nH\u0016\u00a2\u0006\u0002\u0010\u000bJ%\u0010\f\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\bH\u0016\u00a2\u0006\u0002\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\bH\u0016JO\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0005\u001a\u00020\u00062\u0010\u0010\u001c\u001a\f\u0012\u0006\b\u0001\u0012\u00020\b\u0018\u00010\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0010\u0010\t\u001a\f\u0012\u0006\b\u0001\u0012\u00020\b\u0018\u00010\n2\b\u0010\u001d\u001a\u0004\u0018\u00010\bH\u0016\u00a2\u0006\u0002\u0010\u001eJ;\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0010\u0010\t\u001a\f\u0012\u0006\b\u0001\u0012\u00020\b\u0018\u00010\nH\u0016\u00a2\u0006\u0002\u0010 \u00a8\u0006!"}, d2 = {"Lcom/wireguard/android/activity/LogViewerActivity$ExportedLogContentProvider;", "Landroid/content/ContentProvider;", "()V", "delete", "", "uri", "Landroid/net/Uri;", "selection", "", "selectionArgs", "", "(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I", "getStreamTypes", "mimeTypeFilter", "(Landroid/net/Uri;Ljava/lang/String;)[Ljava/lang/String;", "getType", "insert", "values", "Landroid/content/ContentValues;", "logForUri", "", "onCreate", "", "openFile", "Landroid/os/ParcelFileDescriptor;", "mode", "query", "Landroid/database/Cursor;", "projection", "sortOrder", "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "update", "(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I", "ui_debug"})
    public static final class ExportedLogContentProvider extends android.content.ContentProvider {
        
        private final byte[] logForUri(android.net.Uri uri) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        public android.net.Uri insert(@org.jetbrains.annotations.NotNull()
        android.net.Uri uri, @org.jetbrains.annotations.Nullable()
        android.content.ContentValues values) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        public android.database.Cursor query(@org.jetbrains.annotations.NotNull()
        android.net.Uri uri, @org.jetbrains.annotations.Nullable()
        java.lang.String[] projection, @org.jetbrains.annotations.Nullable()
        java.lang.String selection, @org.jetbrains.annotations.Nullable()
        java.lang.String[] selectionArgs, @org.jetbrains.annotations.Nullable()
        java.lang.String sortOrder) {
            return null;
        }
        
        @java.lang.Override()
        public boolean onCreate() {
            return false;
        }
        
        @java.lang.Override()
        public int update(@org.jetbrains.annotations.NotNull()
        android.net.Uri uri, @org.jetbrains.annotations.Nullable()
        android.content.ContentValues values, @org.jetbrains.annotations.Nullable()
        java.lang.String selection, @org.jetbrains.annotations.Nullable()
        java.lang.String[] selectionArgs) {
            return 0;
        }
        
        @java.lang.Override()
        public int delete(@org.jetbrains.annotations.NotNull()
        android.net.Uri uri, @org.jetbrains.annotations.Nullable()
        java.lang.String selection, @org.jetbrains.annotations.Nullable()
        java.lang.String[] selectionArgs) {
            return 0;
        }
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        public java.lang.String getType(@org.jetbrains.annotations.NotNull()
        android.net.Uri uri) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        public java.lang.String[] getStreamTypes(@org.jetbrains.annotations.NotNull()
        android.net.Uri uri, @org.jetbrains.annotations.NotNull()
        java.lang.String mimeTypeFilter) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        public android.os.ParcelFileDescriptor openFile(@org.jetbrains.annotations.NotNull()
        android.net.Uri uri, @org.jetbrains.annotations.NotNull()
        java.lang.String mode) {
            return null;
        }
        
        public ExportedLogContentProvider() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/wireguard/android/activity/LogViewerActivity$Companion;", "", "()V", "LOGS", "", "", "", "TAG", "THREADTIME_LINE", "Ljava/util/regex/Pattern;", "ui_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}