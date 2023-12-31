package eu.siacs.conversations.databinding;
import eu.siacs.conversations.R;
import eu.siacs.conversations.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityTrustKeysBindingImpl extends ActivityTrustKeysBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.toolbar, 1);
        sViewsWithIds.put(R.id.key_error_message_card, 2);
        sViewsWithIds.put(R.id.key_error_message_title, 3);
        sViewsWithIds.put(R.id.key_error_message, 4);
        sViewsWithIds.put(R.id.key_error_general, 5);
        sViewsWithIds.put(R.id.key_error_hint_mutual, 6);
        sViewsWithIds.put(R.id.disable_button, 7);
        sViewsWithIds.put(R.id.own_keys_card, 8);
        sViewsWithIds.put(R.id.own_keys_title, 9);
        sViewsWithIds.put(R.id.own_keys_details, 10);
        sViewsWithIds.put(R.id.foreign_keys, 11);
        sViewsWithIds.put(R.id.button_bar, 12);
        sViewsWithIds.put(R.id.cancel_button, 13);
        sViewsWithIds.put(R.id.save_button, 14);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityTrustKeysBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 15, sIncludes, sViewsWithIds));
    }
    private ActivityTrustKeysBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.LinearLayout) bindings[12]
            , (android.widget.Button) bindings[13]
            , (android.widget.Button) bindings[7]
            , (android.widget.LinearLayout) bindings[11]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[4]
            , (androidx.cardview.widget.CardView) bindings[2]
            , (android.widget.TextView) bindings[3]
            , (androidx.cardview.widget.CardView) bindings[8]
            , (android.widget.LinearLayout) bindings[10]
            , (android.widget.TextView) bindings[9]
            , (android.widget.Button) bindings[14]
            , (android.view.View) bindings[1]
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