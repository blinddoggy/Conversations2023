package eu.siacs.conversations.databinding;
import eu.siacs.conversations.R;
import eu.siacs.conversations.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentConversationBindingImpl extends FragmentConversationBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.messages_view, 1);
        sViewsWithIds.put(R.id.scroll_to_bottom_button, 2);
        sViewsWithIds.put(R.id.unread_count_custom_view, 3);
        sViewsWithIds.put(R.id.textsend, 4);
        sViewsWithIds.put(R.id.text_input_hint, 5);
        sViewsWithIds.put(R.id.media_preview, 6);
        sViewsWithIds.put(R.id.textinput, 7);
        sViewsWithIds.put(R.id.textSendButton, 8);
        sViewsWithIds.put(R.id.snackbar, 9);
        sViewsWithIds.put(R.id.snackbar_message, 10);
        sViewsWithIds.put(R.id.snackbar_action, 11);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentConversationBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private FragmentConversationBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.recyclerview.widget.RecyclerView) bindings[6]
            , (android.widget.ListView) bindings[1]
            , (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[2]
            , (android.widget.RelativeLayout) bindings[9]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[5]
            , (android.widget.ImageButton) bindings[8]
            , (eu.siacs.conversations.ui.widget.EditMessage) bindings[7]
            , (android.widget.RelativeLayout) bindings[4]
            , (eu.siacs.conversations.ui.widget.UnreadCountCustomView) bindings[3]
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