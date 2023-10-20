package eu.siacs.conversations.databinding;
import eu.siacs.conversations.R;
import eu.siacs.conversations.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityRtpSessionBindingImpl extends ActivityRtpSessionBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.pip_placeholder, 1);
        sViewsWithIds.put(R.id.pip_waiting, 2);
        sViewsWithIds.put(R.id.pip_warning, 3);
        sViewsWithIds.put(R.id.app_bar_layout, 4);
        sViewsWithIds.put(R.id.toolbar, 5);
        sViewsWithIds.put(R.id.with, 6);
        sViewsWithIds.put(R.id.with_jid, 7);
        sViewsWithIds.put(R.id.duration, 8);
        sViewsWithIds.put(R.id.contact_photo, 9);
        sViewsWithIds.put(R.id.remote_video_wrapper, 10);
        sViewsWithIds.put(R.id.remote_video, 11);
        sViewsWithIds.put(R.id.local_video, 12);
        sViewsWithIds.put(R.id.verified, 13);
        sViewsWithIds.put(R.id.pip_local_mic_off_indicator, 14);
        sViewsWithIds.put(R.id.button_row, 15);
        sViewsWithIds.put(R.id.reject_call, 16);
        sViewsWithIds.put(R.id.accept_call, 17);
        sViewsWithIds.put(R.id.in_call_action_left, 18);
        sViewsWithIds.put(R.id.end_call, 19);
        sViewsWithIds.put(R.id.in_call_action_right, 20);
        sViewsWithIds.put(R.id.in_call_action_far_right, 21);
        sViewsWithIds.put(R.id.using_account, 22);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityRtpSessionBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 23, sIncludes, sViewsWithIds));
    }
    private ActivityRtpSessionBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[17]
            , (com.google.android.material.appbar.AppBarLayout) bindings[4]
            , (android.widget.RelativeLayout) bindings[15]
            , (com.makeramen.roundedimageview.RoundedImageView) bindings[9]
            , (android.widget.TextView) bindings[8]
            , (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[19]
            , (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[21]
            , (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[18]
            , (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[20]
            , (eu.siacs.conversations.ui.widget.SurfaceViewRenderer) bindings[12]
            , (android.widget.ImageView) bindings[14]
            , (android.widget.LinearLayout) bindings[1]
            , (android.widget.ProgressBar) bindings[2]
            , (android.widget.ImageView) bindings[3]
            , (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[16]
            , (eu.siacs.conversations.ui.widget.SurfaceViewRenderer) bindings[11]
            , (android.widget.LinearLayout) bindings[10]
            , (androidx.appcompat.widget.Toolbar) bindings[5]
            , (android.widget.TextView) bindings[22]
            , (android.widget.ImageView) bindings[13]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[7]
            );
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
            return variableSet;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}