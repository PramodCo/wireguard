// Generated by data binding compiler. Do not edit!
package com.wireguard.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import com.wireguard.android.R;
import com.wireguard.android.fragment.TunnelEditorFragment;
import com.wireguard.android.viewmodel.ConfigProxy;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class TunnelEditorFragmentBinding extends ViewDataBinding {
  @NonNull
  public final MaterialButton addPeerButton;

  @NonNull
  public final TextInputLayout addressesLabelLayout;

  @NonNull
  public final TextInputEditText addressesLabelText;

  @NonNull
  public final TextInputLayout dnsServersLabelLayout;

  @NonNull
  public final TextInputEditText dnsServersText;

  @NonNull
  public final TextInputLayout interfaceNameLayout;

  @NonNull
  public final TextInputEditText interfaceNameText;

  @NonNull
  public final MaterialTextView interfaceTitle;

  @NonNull
  public final TextInputLayout listenPortLabelLayout;

  @NonNull
  public final TextInputEditText listenPortText;

  @NonNull
  public final CoordinatorLayout mainContainer;

  @NonNull
  public final TextInputLayout mtuLabelLayout;

  @NonNull
  public final TextInputEditText mtuText;

  @NonNull
  public final LinearLayout peersLayout;

  @NonNull
  public final TextInputEditText privateKeyText;

  @NonNull
  public final TextInputLayout privateKeyTextLayout;

  @NonNull
  public final TextInputLayout publicKeyLabelLayout;

  @NonNull
  public final TextInputEditText publicKeyText;

  @NonNull
  public final MaterialButton setExcludedApplications;

  @Bindable
  protected TunnelEditorFragment mFragment;

  @Bindable
  protected ConfigProxy mConfig;

  @Bindable
  protected String mName;

  protected TunnelEditorFragmentBinding(Object _bindingComponent, View _root, int _localFieldCount,
      MaterialButton addPeerButton, TextInputLayout addressesLabelLayout,
      TextInputEditText addressesLabelText, TextInputLayout dnsServersLabelLayout,
      TextInputEditText dnsServersText, TextInputLayout interfaceNameLayout,
      TextInputEditText interfaceNameText, MaterialTextView interfaceTitle,
      TextInputLayout listenPortLabelLayout, TextInputEditText listenPortText,
      CoordinatorLayout mainContainer, TextInputLayout mtuLabelLayout, TextInputEditText mtuText,
      LinearLayout peersLayout, TextInputEditText privateKeyText,
      TextInputLayout privateKeyTextLayout, TextInputLayout publicKeyLabelLayout,
      TextInputEditText publicKeyText, MaterialButton setExcludedApplications) {
    super(_bindingComponent, _root, _localFieldCount);
    this.addPeerButton = addPeerButton;
    this.addressesLabelLayout = addressesLabelLayout;
    this.addressesLabelText = addressesLabelText;
    this.dnsServersLabelLayout = dnsServersLabelLayout;
    this.dnsServersText = dnsServersText;
    this.interfaceNameLayout = interfaceNameLayout;
    this.interfaceNameText = interfaceNameText;
    this.interfaceTitle = interfaceTitle;
    this.listenPortLabelLayout = listenPortLabelLayout;
    this.listenPortText = listenPortText;
    this.mainContainer = mainContainer;
    this.mtuLabelLayout = mtuLabelLayout;
    this.mtuText = mtuText;
    this.peersLayout = peersLayout;
    this.privateKeyText = privateKeyText;
    this.privateKeyTextLayout = privateKeyTextLayout;
    this.publicKeyLabelLayout = publicKeyLabelLayout;
    this.publicKeyText = publicKeyText;
    this.setExcludedApplications = setExcludedApplications;
  }

  public abstract void setFragment(@Nullable TunnelEditorFragment fragment);

  @Nullable
  public TunnelEditorFragment getFragment() {
    return mFragment;
  }

  public abstract void setConfig(@Nullable ConfigProxy config);

  @Nullable
  public ConfigProxy getConfig() {
    return mConfig;
  }

  public abstract void setName(@Nullable String name);

  @Nullable
  public String getName() {
    return mName;
  }

  @NonNull
  public static TunnelEditorFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.tunnel_editor_fragment, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static TunnelEditorFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<TunnelEditorFragmentBinding>inflateInternal(inflater, R.layout.tunnel_editor_fragment, root, attachToRoot, component);
  }

  @NonNull
  public static TunnelEditorFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.tunnel_editor_fragment, null, false, component)
   */
  @NonNull
  @Deprecated
  public static TunnelEditorFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<TunnelEditorFragmentBinding>inflateInternal(inflater, R.layout.tunnel_editor_fragment, null, false, component);
  }

  public static TunnelEditorFragmentBinding bind(@NonNull View view) {
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
  public static TunnelEditorFragmentBinding bind(@NonNull View view, @Nullable Object component) {
    return (TunnelEditorFragmentBinding)bind(component, view, R.layout.tunnel_editor_fragment);
  }
}
