package com.example.uikit.customCard;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b&\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bR(\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\n@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000RD\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\u00122\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\u0012@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R8\u0010\u001b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\u001a2\u0010\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\u001a@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR8\u0010 \u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\u001a2\u0010\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\u001a@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001d\"\u0004\b\"\u0010\u001fR*\u0010#\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0007@FX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010(\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'R(\u0010)\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\n@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\r\"\u0004\b+\u0010\u000fR(\u0010,\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\n@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\r\"\u0004\b.\u0010\u000fR(\u0010/\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\n@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\r\"\u0004\b1\u0010\u000fR*\u00102\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0007@FX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010(\u001a\u0004\b3\u0010%\"\u0004\b4\u0010\'R(\u00105\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\n@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\r\"\u0004\b7\u0010\u000fR$\u00108\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0013@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R(\u0010=\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\n@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\r\"\u0004\b?\u0010\u000f\u00a8\u0006@"}, d2 = {"Lcom/example/uikit/customCard/CustomCard;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "value", "", "available", "getAvailable", "()Ljava/lang/String;", "setAvailable", "(Ljava/lang/String;)V", "binding", "Lcom/example/uikit/databinding/ViewCustomCardBinding;", "Lkotlin/Function1;", "", "", "cardActivationToggleListener", "getCardActivationToggleListener", "()Lkotlin/jvm/functions/Function1;", "setCardActivationToggleListener", "(Lkotlin/jvm/functions/Function1;)V", "Lkotlin/Function0;", "cardControlListener", "getCardControlListener", "()Lkotlin/jvm/functions/Function0;", "setCardControlListener", "(Lkotlin/jvm/functions/Function0;)V", "cardOptionsListener", "getCardOptionsListener", "setCardOptionsListener", "currentBalanceProgress", "getCurrentBalanceProgress", "()Ljava/lang/Integer;", "setCurrentBalanceProgress", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "disposed", "getDisposed", "setDisposed", "hiddenNumber", "getHiddenNumber", "setHiddenNumber", "limit", "getLimit", "setLimit", "maxBalanceProgress", "getMaxBalanceProgress", "setMaxBalanceProgress", "name", "getName", "setName", "titular", "getTitular", "()Z", "setTitular", "(Z)V", "type", "getType", "setType", "uiKit_debug"})
public final class CustomCard extends androidx.constraintlayout.widget.ConstraintLayout {
    private final com.example.uikit.databinding.ViewCustomCardBinding binding = null;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String name;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String type;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String hiddenNumber;
    private boolean titular = false;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String limit;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer maxBalanceProgress;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer currentBalanceProgress;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String disposed;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String available;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function0<kotlin.Unit> cardOptionsListener;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> cardActivationToggleListener;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function0<kotlin.Unit> cardControlListener;
    
    @kotlin.jvm.JvmOverloads()
    public CustomCard(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public CustomCard(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public CustomCard(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.Nullable()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getType() {
        return null;
    }
    
    public final void setType(@org.jetbrains.annotations.Nullable()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getHiddenNumber() {
        return null;
    }
    
    public final void setHiddenNumber(@org.jetbrains.annotations.Nullable()
    java.lang.String value) {
    }
    
    public final boolean getTitular() {
        return false;
    }
    
    public final void setTitular(boolean value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLimit() {
        return null;
    }
    
    public final void setLimit(@org.jetbrains.annotations.Nullable()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getMaxBalanceProgress() {
        return null;
    }
    
    public final void setMaxBalanceProgress(@org.jetbrains.annotations.Nullable()
    java.lang.Integer value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getCurrentBalanceProgress() {
        return null;
    }
    
    public final void setCurrentBalanceProgress(@org.jetbrains.annotations.Nullable()
    java.lang.Integer value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDisposed() {
        return null;
    }
    
    public final void setDisposed(@org.jetbrains.annotations.Nullable()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAvailable() {
        return null;
    }
    
    public final void setAvailable(@org.jetbrains.annotations.Nullable()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function0<kotlin.Unit> getCardOptionsListener() {
        return null;
    }
    
    public final void setCardOptionsListener(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<kotlin.Unit> value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> getCardActivationToggleListener() {
        return null;
    }
    
    public final void setCardActivationToggleListener(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function0<kotlin.Unit> getCardControlListener() {
        return null;
    }
    
    public final void setCardControlListener(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<kotlin.Unit> value) {
    }
}