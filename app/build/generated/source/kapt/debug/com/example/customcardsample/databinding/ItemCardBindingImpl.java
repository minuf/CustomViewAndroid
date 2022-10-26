package com.example.customcardsample.databinding;
import com.example.customcardsample.R;
import com.example.customcardsample.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemCardBindingImpl extends ItemCardBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.cardview.widget.CardView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemCardBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 2, sIncludes, sViewsWithIds));
    }
    private ItemCardBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.example.uikit.customCard.CustomCard) bindings[1]
            );
        this.customCard.setTag(null);
        this.mboundView0 = (androidx.cardview.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
        if (BR.card == variableId) {
            setCard((com.example.customcardsample.ui.model.CustomCardData) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setCard(@Nullable com.example.customcardsample.ui.model.CustomCardData Card) {
        this.mCard = Card;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.card);
        super.requestRebind();
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
        java.lang.String cardHiddenNumber = null;
        com.example.customcardsample.ui.model.CustomCardData card = mCard;
        int cardCurrentBalance = 0;
        boolean cardTitular = false;
        java.lang.String cardLimit = null;
        kotlin.jvm.functions.Function1<java.lang.Boolean,kotlin.Unit> cardActivationToggleListener = null;
        java.lang.String cardName = null;
        java.lang.String cardType = null;
        kotlin.jvm.functions.Function0<kotlin.Unit> cardControlListener = null;
        java.lang.String cardAvailable = null;
        kotlin.jvm.functions.Function0<kotlin.Unit> cardOptionsListener = null;
        int cardMaxBalance = 0;
        java.lang.String cardDisposed = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (card != null) {
                    // read card.hiddenNumber
                    cardHiddenNumber = card.getHiddenNumber();
                    // read card.currentBalance
                    cardCurrentBalance = card.getCurrentBalance();
                    // read card.titular
                    cardTitular = card.getTitular();
                    // read card.limit
                    cardLimit = card.getLimit();
                    // read card.activationToggleListener
                    cardActivationToggleListener = card.getActivationToggleListener();
                    // read card.name
                    cardName = card.getName();
                    // read card.type
                    cardType = card.getType();
                    // read card.controlListener
                    cardControlListener = card.getControlListener();
                    // read card.available
                    cardAvailable = card.getAvailable();
                    // read card.optionsListener
                    cardOptionsListener = card.getOptionsListener();
                    // read card.maxBalance
                    cardMaxBalance = card.getMaxBalance();
                    // read card.disposed
                    cardDisposed = card.getDisposed();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.example.uikit.customCard.CustomCardKt.setName(this.customCard, cardName);
            com.example.uikit.customCard.CustomCardKt.setType(this.customCard, cardType);
            com.example.uikit.customCard.CustomCardKt.setHiddenNumber(this.customCard, cardHiddenNumber);
            com.example.uikit.customCard.CustomCardKt.setTitular(this.customCard, cardTitular);
            com.example.uikit.customCard.CustomCardKt.setLimit(this.customCard, cardLimit);
            com.example.uikit.customCard.CustomCardKt.setMaxBalance(this.customCard, cardMaxBalance);
            com.example.uikit.customCard.CustomCardKt.setCurrentBalance(this.customCard, cardCurrentBalance);
            com.example.uikit.customCard.CustomCardKt.setDisposed(this.customCard, cardDisposed);
            com.example.uikit.customCard.CustomCardKt.setAvailable(this.customCard, cardAvailable);
            com.example.uikit.customCard.CustomCardKt.onCardOptionsClick(this.customCard, cardOptionsListener);
            com.example.uikit.customCard.CustomCardKt.onCardActivationToggle(this.customCard, cardActivationToggleListener);
            com.example.uikit.customCard.CustomCardKt.onControlClickListener(this.customCard, cardControlListener);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): card
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}