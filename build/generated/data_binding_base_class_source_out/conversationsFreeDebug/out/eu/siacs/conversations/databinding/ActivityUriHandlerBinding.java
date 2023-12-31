// Generated by data binding compiler. Do not edit!
package eu.siacs.conversations.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import eu.siacs.conversations.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityUriHandlerBinding extends ViewDataBinding {
  @NonNull
  public final TextView error;

  @NonNull
  public final ProgressBar progress;

  protected ActivityUriHandlerBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView error, ProgressBar progress) {
    super(_bindingComponent, _root, _localFieldCount);
    this.error = error;
    this.progress = progress;
  }

  @NonNull
  public static ActivityUriHandlerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_uri_handler, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityUriHandlerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityUriHandlerBinding>inflateInternal(inflater, R.layout.activity_uri_handler, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityUriHandlerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_uri_handler, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityUriHandlerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityUriHandlerBinding>inflateInternal(inflater, R.layout.activity_uri_handler, null, false, component);
  }

  public static ActivityUriHandlerBinding bind(@NonNull View view) {
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
  public static ActivityUriHandlerBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityUriHandlerBinding)bind(component, view, R.layout.activity_uri_handler);
  }
}
