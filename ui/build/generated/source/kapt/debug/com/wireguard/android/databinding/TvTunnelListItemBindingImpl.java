package com.wireguard.android.databinding;
import com.wireguard.android.R;
import com.wireguard.android.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class TvTunnelListItemBindingImpl extends TvTunnelListItemBinding  {

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
    private final com.google.android.material.card.MaterialCardView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public TvTunnelListItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private TvTunnelListItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (com.google.android.material.textview.MaterialTextView) bindings[3]
            , (com.google.android.material.textview.MaterialTextView) bindings[1]
            , (com.google.android.material.textview.MaterialTextView) bindings[2]
            );
        this.mboundView0 = (com.google.android.material.card.MaterialCardView) bindings[0];
        this.mboundView0.setTag(null);
        this.tunnelDelete.setTag(null);
        this.tunnelName.setTag(null);
        this.tunnelTransfer.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x40L;
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
        if (BR.item == variableId) {
            setItem((com.wireguard.android.model.ObservableTunnel) variable);
        }
        else if (BR.isFocused == variableId) {
            setIsFocused((androidx.databinding.ObservableBoolean) variable);
        }
        else if (BR.key == variableId) {
            setKey((java.lang.String) variable);
        }
        else if (BR.isDeleting == variableId) {
            setIsDeleting((androidx.databinding.ObservableBoolean) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItem(@Nullable com.wireguard.android.model.ObservableTunnel Item) {
        updateRegistration(0, Item);
        this.mItem = Item;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.item);
        super.requestRebind();
    }
    public void setIsFocused(@Nullable androidx.databinding.ObservableBoolean IsFocused) {
        updateRegistration(1, IsFocused);
        this.mIsFocused = IsFocused;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.isFocused);
        super.requestRebind();
    }
    public void setKey(@Nullable java.lang.String Key) {
        this.mKey = Key;
    }
    public void setIsDeleting(@Nullable androidx.databinding.ObservableBoolean IsDeleting) {
        updateRegistration(2, IsDeleting);
        this.mIsDeleting = IsDeleting;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.isDeleting);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeItem((com.wireguard.android.model.ObservableTunnel) object, fieldId);
            case 1 :
                return onChangeIsFocused((androidx.databinding.ObservableBoolean) object, fieldId);
            case 2 :
                return onChangeIsDeleting((androidx.databinding.ObservableBoolean) object, fieldId);
        }
        return false;
    }
    private boolean onChangeItem(com.wireguard.android.model.ObservableTunnel Item, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.state) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        else if (fieldId == BR.name) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeIsFocused(androidx.databinding.ObservableBoolean IsFocused, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeIsDeleting(androidx.databinding.ObservableBoolean IsDeleting, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
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
        boolean itemStateStateUPIsDeletingBooleanFalse = false;
        com.wireguard.android.model.ObservableTunnel item = mItem;
        boolean isDeleting = false;
        boolean isFocusedGet = false;
        androidx.databinding.ObservableBoolean isFocused = mIsFocused;
        boolean isDeletingIsFocusedBooleanFalse = false;
        int isDeletingViewGONEViewVISIBLE = 0;
        int isDeletingIsFocusedBooleanFalseMboundView0AndroidColorTvCardDeleteBackgroundMboundView0AndroidColorTvCardBackground = 0;
        int isDeletingIsFocusedBooleanFalseViewVISIBLEViewGONE = 0;
        int itemStateStateUPIsDeletingBooleanFalseMboundView0AndroidColorSecondaryDarkColorIsDeletingIsFocusedBooleanFalseMboundView0AndroidColorTvCardDeleteBackgroundMboundView0AndroidColorTvCardBackground = 0;
        boolean isDeletingGet = false;
        java.lang.String itemName = null;
        androidx.databinding.ObservableBoolean IsDeleting1 = mIsDeleting;
        com.wireguard.android.backend.Tunnel.State itemState = null;
        boolean itemStateStateUP = false;

        if ((dirtyFlags & 0x77L) != 0) {


            if ((dirtyFlags & 0x61L) != 0) {

                    if (item != null) {
                        // read item.name
                        itemName = item.getName();
                    }
            }
            if ((dirtyFlags & 0x57L) != 0) {

                    if (item != null) {
                        // read item.state
                        itemState = item.getState();
                    }


                    // read item.state == State.UP
                    itemStateStateUP = (itemState) == (com.wireguard.android.backend.Tunnel.State.UP);
                if((dirtyFlags & 0x57L) != 0) {
                    if(itemStateStateUP) {
                            dirtyFlags |= 0x100L;
                    }
                    else {
                            dirtyFlags |= 0x80L;
                    }
                }
            }
        }
        if ((dirtyFlags & 0x46L) != 0) {



                if (IsDeleting1 != null) {
                    // read isDeleting.get()
                    isDeletingGet = IsDeleting1.get();
                }
            if((dirtyFlags & 0x20046L) != 0) {
                if(isDeletingGet) {
                        dirtyFlags |= 0x400L;
                }
                else {
                        dirtyFlags |= 0x200L;
                }
            }
            if((dirtyFlags & 0x44L) != 0) {
                if(isDeletingGet) {
                        dirtyFlags |= 0x1000L;
                }
                else {
                        dirtyFlags |= 0x800L;
                }
            }

            if ((dirtyFlags & 0x44L) != 0) {

                    // read isDeleting.get() ? View.GONE : View.VISIBLE
                    isDeletingViewGONEViewVISIBLE = ((isDeletingGet) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            }
        }
        // batch finished

        if ((dirtyFlags & 0x100L) != 0) {



                if (IsDeleting1 != null) {
                    // read isDeleting.get()
                    isDeletingGet = IsDeleting1.get();
                }
            if((dirtyFlags & 0x20046L) != 0) {
                if(isDeletingGet) {
                        dirtyFlags |= 0x400L;
                }
                else {
                        dirtyFlags |= 0x200L;
                }
            }
            if((dirtyFlags & 0x44L) != 0) {
                if(isDeletingGet) {
                        dirtyFlags |= 0x1000L;
                }
                else {
                        dirtyFlags |= 0x800L;
                }
            }


                // read !isDeleting.get()
                isDeleting = !isDeletingGet;
        }

        if ((dirtyFlags & 0x57L) != 0) {

                // read item.state == State.UP ? !isDeleting.get() : false
                itemStateStateUPIsDeletingBooleanFalse = ((itemStateStateUP) ? (isDeleting) : (false));
            if((dirtyFlags & 0x57L) != 0) {
                if(itemStateStateUPIsDeletingBooleanFalse) {
                        dirtyFlags |= 0x40000L;
                }
                else {
                        dirtyFlags |= 0x20000L;
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x20000L) != 0) {



                if (IsDeleting1 != null) {
                    // read isDeleting.get()
                    isDeletingGet = IsDeleting1.get();
                }
            if((dirtyFlags & 0x20046L) != 0) {
                if(isDeletingGet) {
                        dirtyFlags |= 0x400L;
                }
                else {
                        dirtyFlags |= 0x200L;
                }
            }
            if((dirtyFlags & 0x44L) != 0) {
                if(isDeletingGet) {
                        dirtyFlags |= 0x1000L;
                }
                else {
                        dirtyFlags |= 0x800L;
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x400L) != 0) {



                if (isFocused != null) {
                    // read isFocused.get()
                    isFocusedGet = isFocused.get();
                }
        }

        if ((dirtyFlags & 0x20046L) != 0) {

                // read isDeleting.get() ? isFocused.get() : false
                isDeletingIsFocusedBooleanFalse = ((isDeletingGet) ? (isFocusedGet) : (false));
            if((dirtyFlags & 0x20000L) != 0) {
                if(isDeletingIsFocusedBooleanFalse) {
                        dirtyFlags |= 0x4000L;
                }
                else {
                        dirtyFlags |= 0x2000L;
                }
            }
            if((dirtyFlags & 0x46L) != 0) {
                if(isDeletingIsFocusedBooleanFalse) {
                        dirtyFlags |= 0x10000L;
                }
                else {
                        dirtyFlags |= 0x8000L;
                }
            }

            if ((dirtyFlags & 0x20000L) != 0) {

                    // read isDeleting.get() ? isFocused.get() : false ? @android:color/tv_card_delete_background : @android:color/tv_card_background
                    isDeletingIsFocusedBooleanFalseMboundView0AndroidColorTvCardDeleteBackgroundMboundView0AndroidColorTvCardBackground = ((isDeletingIsFocusedBooleanFalse) ? (getColorFromResource(mboundView0, R.color.tv_card_delete_background)) : (getColorFromResource(mboundView0, R.color.tv_card_background)));
            }
            if ((dirtyFlags & 0x46L) != 0) {

                    // read isDeleting.get() ? isFocused.get() : false ? View.VISIBLE : View.GONE
                    isDeletingIsFocusedBooleanFalseViewVISIBLEViewGONE = ((isDeletingIsFocusedBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
        }

        if ((dirtyFlags & 0x57L) != 0) {

                // read item.state == State.UP ? !isDeleting.get() : false ? @android:color/secondary_dark_color : isDeleting.get() ? isFocused.get() : false ? @android:color/tv_card_delete_background : @android:color/tv_card_background
                itemStateStateUPIsDeletingBooleanFalseMboundView0AndroidColorSecondaryDarkColorIsDeletingIsFocusedBooleanFalseMboundView0AndroidColorTvCardDeleteBackgroundMboundView0AndroidColorTvCardBackground = ((itemStateStateUPIsDeletingBooleanFalse) ? (getColorFromResource(mboundView0, R.color.secondary_dark_color)) : (isDeletingIsFocusedBooleanFalseMboundView0AndroidColorTvCardDeleteBackgroundMboundView0AndroidColorTvCardBackground));
        }
        // batch finished
        if ((dirtyFlags & 0x57L) != 0) {
            // api target 21
            if(getBuildSdkInt() >= 21) {

                this.mboundView0.setBackgroundTintList(androidx.databinding.adapters.Converters.convertColorToColorStateList(itemStateStateUPIsDeletingBooleanFalseMboundView0AndroidColorSecondaryDarkColorIsDeletingIsFocusedBooleanFalseMboundView0AndroidColorTvCardDeleteBackgroundMboundView0AndroidColorTvCardBackground));
            }
        }
        if ((dirtyFlags & 0x46L) != 0) {
            // api target 1

            this.tunnelDelete.setVisibility(isDeletingIsFocusedBooleanFalseViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x61L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tunnelName, itemName);
        }
        if ((dirtyFlags & 0x44L) != 0) {
            // api target 1

            this.tunnelTransfer.setVisibility(isDeletingViewGONEViewVISIBLE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): item
        flag 1 (0x2L): isFocused
        flag 2 (0x3L): isDeleting
        flag 3 (0x4L): key
        flag 4 (0x5L): item.state
        flag 5 (0x6L): item.name
        flag 6 (0x7L): null
        flag 7 (0x8L): item.state == State.UP ? !isDeleting.get() : false
        flag 8 (0x9L): item.state == State.UP ? !isDeleting.get() : false
        flag 9 (0xaL): isDeleting.get() ? isFocused.get() : false
        flag 10 (0xbL): isDeleting.get() ? isFocused.get() : false
        flag 11 (0xcL): isDeleting.get() ? View.GONE : View.VISIBLE
        flag 12 (0xdL): isDeleting.get() ? View.GONE : View.VISIBLE
        flag 13 (0xeL): isDeleting.get() ? isFocused.get() : false ? @android:color/tv_card_delete_background : @android:color/tv_card_background
        flag 14 (0xfL): isDeleting.get() ? isFocused.get() : false ? @android:color/tv_card_delete_background : @android:color/tv_card_background
        flag 15 (0x10L): isDeleting.get() ? isFocused.get() : false ? View.VISIBLE : View.GONE
        flag 16 (0x11L): isDeleting.get() ? isFocused.get() : false ? View.VISIBLE : View.GONE
        flag 17 (0x12L): item.state == State.UP ? !isDeleting.get() : false ? @android:color/secondary_dark_color : isDeleting.get() ? isFocused.get() : false ? @android:color/tv_card_delete_background : @android:color/tv_card_background
        flag 18 (0x13L): item.state == State.UP ? !isDeleting.get() : false ? @android:color/secondary_dark_color : isDeleting.get() ? isFocused.get() : false ? @android:color/tv_card_delete_background : @android:color/tv_card_background
    flag mapping end*/
    //end
}