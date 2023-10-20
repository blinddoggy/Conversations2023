package eu.siacs.conversations.databinding;
import eu.siacs.conversations.R;
import eu.siacs.conversations.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityEditAccountBindingImpl extends ActivityEditAccountBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.toolbar, 1);
        sViewsWithIds.put(R.id.account_main_layout, 2);
        sViewsWithIds.put(R.id.editor, 3);
        sViewsWithIds.put(R.id.avater, 4);
        sViewsWithIds.put(R.id.account_jid_layout, 5);
        sViewsWithIds.put(R.id.account_jid, 6);
        sViewsWithIds.put(R.id.account_password_layout, 7);
        sViewsWithIds.put(R.id.account_password, 8);
        sViewsWithIds.put(R.id.name_port, 9);
        sViewsWithIds.put(R.id.hostname_layout, 10);
        sViewsWithIds.put(R.id.hostname, 11);
        sViewsWithIds.put(R.id.port_layout, 12);
        sViewsWithIds.put(R.id.port, 13);
        sViewsWithIds.put(R.id.account_register_new, 14);
        sViewsWithIds.put(R.id.os_optimization, 15);
        sViewsWithIds.put(R.id.os_optimization_headline, 16);
        sViewsWithIds.put(R.id.os_optimization_body, 17);
        sViewsWithIds.put(R.id.os_optimization_disable, 18);
        sViewsWithIds.put(R.id.stats, 19);
        sViewsWithIds.put(R.id.session_est, 20);
        sViewsWithIds.put(R.id.server_info_more, 21);
        sViewsWithIds.put(R.id.server_info_pep, 22);
        sViewsWithIds.put(R.id.server_info_blocking, 23);
        sViewsWithIds.put(R.id.server_info_sm, 24);
        sViewsWithIds.put(R.id.server_info_external_service, 25);
        sViewsWithIds.put(R.id.server_info_roster_version, 26);
        sViewsWithIds.put(R.id.server_info_carbons, 27);
        sViewsWithIds.put(R.id.server_info_mam, 28);
        sViewsWithIds.put(R.id.server_info_csi, 29);
        sViewsWithIds.put(R.id.push_row, 30);
        sViewsWithIds.put(R.id.server_info_push, 31);
        sViewsWithIds.put(R.id.server_info_http_upload_description, 32);
        sViewsWithIds.put(R.id.server_info_http_upload, 33);
        sViewsWithIds.put(R.id.your_name_box, 34);
        sViewsWithIds.put(R.id.your_name, 35);
        sViewsWithIds.put(R.id.your_name_desc, 36);
        sViewsWithIds.put(R.id.action_edit_your_name, 37);
        sViewsWithIds.put(R.id.pgp_fingerprint_box, 38);
        sViewsWithIds.put(R.id.pgp_fingerprint, 39);
        sViewsWithIds.put(R.id.pgp_fingerprint_desc, 40);
        sViewsWithIds.put(R.id.action_delete_pgp, 41);
        sViewsWithIds.put(R.id.axolotl_fingerprint_box, 42);
        sViewsWithIds.put(R.id.axolotl_fingerprint, 43);
        sViewsWithIds.put(R.id.own_fingerprint_desc, 44);
        sViewsWithIds.put(R.id.axolotl_actions, 45);
        sViewsWithIds.put(R.id.action_copy_axolotl_to_clipboard, 46);
        sViewsWithIds.put(R.id.action_regenerate_axolotl_key, 47);
        sViewsWithIds.put(R.id.other_device_keys_card, 48);
        sViewsWithIds.put(R.id.other_device_keys_title, 49);
        sViewsWithIds.put(R.id.other_device_keys, 50);
        sViewsWithIds.put(R.id.clear_devices, 51);
        sViewsWithIds.put(R.id.button_bar, 52);
        sViewsWithIds.put(R.id.cancel_button, 53);
        sViewsWithIds.put(R.id.save_button, 54);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityEditAccountBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 55, sIncludes, sViewsWithIds));
    }
    private ActivityEditAccountBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.AutoCompleteTextView) bindings[6]
            , (com.google.android.material.textfield.TextInputLayout) bindings[5]
            , (android.widget.LinearLayout) bindings[2]
            , (eu.siacs.conversations.ui.widget.TextInputEditText) bindings[8]
            , (com.google.android.material.textfield.TextInputLayout) bindings[7]
            , (android.widget.CheckBox) bindings[14]
            , (android.widget.ImageButton) bindings[46]
            , (android.widget.ImageButton) bindings[41]
            , (android.widget.ImageButton) bindings[37]
            , (android.widget.ImageButton) bindings[47]
            , (com.makeramen.roundedimageview.RoundedImageView) bindings[4]
            , (android.widget.LinearLayout) bindings[45]
            , (android.widget.TextView) bindings[43]
            , (android.widget.RelativeLayout) bindings[42]
            , (android.widget.LinearLayout) bindings[52]
            , (android.widget.Button) bindings[53]
            , (android.widget.Button) bindings[51]
            , (androidx.cardview.widget.CardView) bindings[3]
            , (android.widget.EditText) bindings[11]
            , (com.google.android.material.textfield.TextInputLayout) bindings[10]
            , (android.widget.LinearLayout) bindings[9]
            , (androidx.cardview.widget.CardView) bindings[15]
            , (android.widget.TextView) bindings[17]
            , (android.widget.Button) bindings[18]
            , (android.widget.TextView) bindings[16]
            , (android.widget.LinearLayout) bindings[50]
            , (androidx.cardview.widget.CardView) bindings[48]
            , (android.widget.TextView) bindings[49]
            , (android.widget.TextView) bindings[44]
            , (android.widget.TextView) bindings[39]
            , (android.widget.RelativeLayout) bindings[38]
            , (android.widget.TextView) bindings[40]
            , (android.widget.EditText) bindings[13]
            , (com.google.android.material.textfield.TextInputLayout) bindings[12]
            , (android.widget.TableRow) bindings[30]
            , (android.widget.Button) bindings[54]
            , (android.widget.TextView) bindings[23]
            , (android.widget.TextView) bindings[27]
            , (android.widget.TextView) bindings[29]
            , (android.widget.TextView) bindings[25]
            , (android.widget.TextView) bindings[33]
            , (android.widget.TextView) bindings[32]
            , (android.widget.TextView) bindings[28]
            , (android.widget.TableLayout) bindings[21]
            , (android.widget.TextView) bindings[22]
            , (android.widget.TextView) bindings[31]
            , (android.widget.TextView) bindings[26]
            , (android.widget.TextView) bindings[24]
            , (android.widget.TextView) bindings[20]
            , (androidx.cardview.widget.CardView) bindings[19]
            , (android.view.View) bindings[1]
            , (android.widget.TextView) bindings[35]
            , (android.widget.RelativeLayout) bindings[34]
            , (android.widget.TextView) bindings[36]
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