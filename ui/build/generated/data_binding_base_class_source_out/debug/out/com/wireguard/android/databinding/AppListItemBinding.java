// Generated by data binding compiler. Do not edit!
package com.wireguard.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.wireguard.android.R;
import com.wireguard.android.model.ApplicationData;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class AppListItemBinding extends ViewDataBinding {
  @NonNull
  public final ImageView appIcon;

  @NonNull
  public final TextView appName;

  @NonNull
  public final CheckBox selectedCheckbox;

  @Bindable
  protected ObservableKeyedArrayList<String, ApplicationData> mCollection;

  @Bindable
  protected String mKey;

  @Bindable
  protected ApplicationData mItem;

  protected AppListItemBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView appIcon, TextView appName, CheckBox selectedCheckbox) {
    super(_bindingComponent, _root, _localFieldCount);
    this.appIcon = appIcon;
    this.appName = appName;
    this.selectedCheckbox = selectedCheckbox;
  }

  public abstract void setCollection(
      @Nullable ObservableKeyedArrayList<String, ApplicationData> collection);

  @Nullable
  public ObservableKeyedArrayList<String, ApplicationData> getCollection() {
    return mCollection;
  }

  public abstract void setKey(@Nullable String key);

  @Nullable
  public String getKey() {
    return mKey;
  }

  public abstract void setItem(@Nullable ApplicationData item);

  @Nullable
  public ApplicationData getItem() {
    return mItem;
  }

  @NonNull
  public static AppListItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.app_list_item, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static AppListItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<AppListItemBinding>inflateInternal(inflater, R.layout.app_list_item, root, attachToRoot, component);
  }

  @NonNull
  public static AppListItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.app_list_item, null, false, component)
   */
  @NonNull
  @Deprecated
  public static AppListItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<AppListItemBinding>inflateInternal(inflater, R.layout.app_list_item, null, false, component);
  }

  public static AppListItemBinding bind(@NonNull View view) {
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
  public static AppListItemBinding bind(@NonNull View view, @Nullable Object component) {
    return (AppListItemBinding)bind(component, view, R.layout.app_list_item);
  }
}