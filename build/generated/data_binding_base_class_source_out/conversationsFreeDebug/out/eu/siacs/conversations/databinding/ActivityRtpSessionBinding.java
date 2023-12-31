// Generated by data binding compiler. Do not edit!
package eu.siacs.conversations.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.makeramen.roundedimageview.RoundedImageView;
import eu.siacs.conversations.R;
import eu.siacs.conversations.ui.widget.SurfaceViewRenderer;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityRtpSessionBinding extends ViewDataBinding {
  @NonNull
  public final FloatingActionButton acceptCall;

  @NonNull
  public final AppBarLayout appBarLayout;

  @NonNull
  public final RelativeLayout buttonRow;

  @NonNull
  public final RoundedImageView contactPhoto;

  @NonNull
  public final TextView duration;

  @NonNull
  public final FloatingActionButton endCall;

  @NonNull
  public final FloatingActionButton inCallActionFarRight;

  @NonNull
  public final FloatingActionButton inCallActionLeft;

  @NonNull
  public final FloatingActionButton inCallActionRight;

  @NonNull
  public final SurfaceViewRenderer localVideo;

  @NonNull
  public final ImageView pipLocalMicOffIndicator;

  @NonNull
  public final LinearLayout pipPlaceholder;

  @NonNull
  public final ProgressBar pipWaiting;

  @NonNull
  public final ImageView pipWarning;

  @NonNull
  public final FloatingActionButton rejectCall;

  @NonNull
  public final SurfaceViewRenderer remoteVideo;

  @NonNull
  public final LinearLayout remoteVideoWrapper;

  @NonNull
  public final Toolbar toolbar;

  @NonNull
  public final TextView usingAccount;

  @NonNull
  public final ImageView verified;

  @NonNull
  public final TextView with;

  @NonNull
  public final TextView withJid;

  protected ActivityRtpSessionBinding(Object _bindingComponent, View _root, int _localFieldCount,
      FloatingActionButton acceptCall, AppBarLayout appBarLayout, RelativeLayout buttonRow,
      RoundedImageView contactPhoto, TextView duration, FloatingActionButton endCall,
      FloatingActionButton inCallActionFarRight, FloatingActionButton inCallActionLeft,
      FloatingActionButton inCallActionRight, SurfaceViewRenderer localVideo,
      ImageView pipLocalMicOffIndicator, LinearLayout pipPlaceholder, ProgressBar pipWaiting,
      ImageView pipWarning, FloatingActionButton rejectCall, SurfaceViewRenderer remoteVideo,
      LinearLayout remoteVideoWrapper, Toolbar toolbar, TextView usingAccount, ImageView verified,
      TextView with, TextView withJid) {
    super(_bindingComponent, _root, _localFieldCount);
    this.acceptCall = acceptCall;
    this.appBarLayout = appBarLayout;
    this.buttonRow = buttonRow;
    this.contactPhoto = contactPhoto;
    this.duration = duration;
    this.endCall = endCall;
    this.inCallActionFarRight = inCallActionFarRight;
    this.inCallActionLeft = inCallActionLeft;
    this.inCallActionRight = inCallActionRight;
    this.localVideo = localVideo;
    this.pipLocalMicOffIndicator = pipLocalMicOffIndicator;
    this.pipPlaceholder = pipPlaceholder;
    this.pipWaiting = pipWaiting;
    this.pipWarning = pipWarning;
    this.rejectCall = rejectCall;
    this.remoteVideo = remoteVideo;
    this.remoteVideoWrapper = remoteVideoWrapper;
    this.toolbar = toolbar;
    this.usingAccount = usingAccount;
    this.verified = verified;
    this.with = with;
    this.withJid = withJid;
  }

  @NonNull
  public static ActivityRtpSessionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_rtp_session, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityRtpSessionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityRtpSessionBinding>inflateInternal(inflater, R.layout.activity_rtp_session, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityRtpSessionBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_rtp_session, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityRtpSessionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityRtpSessionBinding>inflateInternal(inflater, R.layout.activity_rtp_session, null, false, component);
  }

  public static ActivityRtpSessionBinding bind(@NonNull View view) {
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
  public static ActivityRtpSessionBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityRtpSessionBinding)bind(component, view, R.layout.activity_rtp_session);
  }
}
