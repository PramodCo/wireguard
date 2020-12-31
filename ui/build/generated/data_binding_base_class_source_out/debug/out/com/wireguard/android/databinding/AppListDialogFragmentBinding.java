// Generated by data binding compiler. Do not edit!
package com.wireguard.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.tabs.TabLayout;
import com.wireguard.android.R;
import com.wireguard.android.fragment.AppListDialogFragment;
import com.wireguard.android.model.ApplicationData;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class AppListDialogFragmentBinding extends ViewDataBinding {
  @NonNull
  public final RecyclerView appList;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final TabLayout tabs;

  @Bindable
  protected AppListDialogFragment mFragment;

  @Bindable
  protected ObservableKeyedArrayList<String, ApplicationData> mAppData;

  protected AppListDialogFragmentBinding(Object _bindingComponent, View _root, int _localFieldCount,
      RecyclerView appList, ProgressBar progressBar, TabLayout tabs) {
    super(_bindingComponent, _root, _localFieldCount);
    this.appList = appList;
    this.progressBar = progressBar;
    this.tabs = tabs;
  }

  public abstract void setFragment(@Nullable AppListDialogFragment fragment);

  @Nullable
  public AppListDialogFragment getFragment() {
    return mFragment;
  }

  public abstract void setAppData(
      @Nullable ObservableKeyedArrayList<String, ApplicationData> appData);

  @Nullable
  public ObservableKeyedArrayList<String, ApplicationData> getAppData() {
    return mAppData;
  }

  @NonNull
  public static AppListDialogFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.app_list_dialog_fragment, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static AppListDialogFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<AppListDialogFragmentBinding>inflateInternal(inflater, R.layout.app_list_dialog_fragment, root, attachToRoot, component);
  }

  @NonNull
  public static AppListDialogFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.app_list_dialog_fragment, null, false, component)
   */
  @NonNull
  @Deprecated
  public static AppListDialogFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<AppListDialogFragmentBinding>inflateInternal(inflater, R.layout.app_list_dialog_fragment, null, false, component);
  }

  public static AppListDialogFragmentBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static AppListDialogFragmentBinding bind(@NonNull View view, @Nullable Object component) {
    return (AppListDialogFragmentBinding)bind(component, view, R.layout.app_list_dialog_fragment);
  }
}