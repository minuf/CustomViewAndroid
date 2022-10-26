package com.example.uikit.databinding;
import com.example.uikit.R;
import com.example.uikit.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ViewCustomCardBindingImpl extends ViewCustomCardBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tv_card_name, 2);
        sViewsWithIds.put(R.id.ib_card_options, 3);
        sViewsWithIds.put(R.id.tv_card_type, 4);
        sViewsWithIds.put(R.id.tv_hidden_card_number, 5);
        sViewsWithIds.put(R.id.tv_titular, 6);
        sViewsWithIds.put(R.id.iv_card, 7);
        sViewsWithIds.put(R.id.tv_limit_title, 8);
        sViewsWithIds.put(R.id.tv_limit_value, 9);
        sViewsWithIds.put(R.id.pb_balance, 10);
        sViewsWithIds.put(R.id.tv_disposed_title, 11);
        sViewsWithIds.put(R.id.tv_available_title, 12);
        sViewsWithIds.put(R.id.tv_disposed_value, 13);
        sViewsWithIds.put(R.id.tv_available_value, 14);
        sViewsWithIds.put(R.id.tb_on_off, 15);
        sViewsWithIds.put(R.id.tv_card_control_title, 16);
        sViewsWithIds.put(R.id.ib_card_control, 17);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView1;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ViewCustomCardBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View[] root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 18, sIncludes, sViewsWithIds));
    }
    private ViewCustomCardBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View[] root, Object[] bindings) {
        super(bindingComponent, root[0], 0
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (androidx.appcompat.widget.AppCompatImageButton) bindings[17]
            , (androidx.appcompat.widget.AppCompatImageButton) bindings[3]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[7]
            , (android.widget.ProgressBar) bindings[10]
            , (androidx.appcompat.widget.SwitchCompat) bindings[15]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[16]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[6]
            );
        this.cardContent.setTag(null);
        this.mboundView1 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[1];
        this.mboundView1.setTag(null);
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