package com.example.uikit.customCard;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 2, d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\u001a$\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005H\u0007\u001a\u001e\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\bH\u0007\u001a\u001e\u0010\t\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\bH\u0007\u001a\u0018\u0010\n\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH\u0007\u001a\u0018\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH\u0007\u001a\u0018\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\fH\u0007\u001a\u0018\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\fH\u0007\u001a\u0018\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\fH\u0007\u001a\u0018\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u000fH\u0007\u001a\u0018\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\fH\u0007\u001a\u0018\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u0006H\u0007\u001a\u0018\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\fH\u0007\u00a8\u0006\u001e"}, d2 = {"onCardActivationToggle", "", "customCard", "Lcom/example/uikit/customCard/CustomCard;", "listener", "Lkotlin/Function1;", "", "onCardOptionsClick", "Lkotlin/Function0;", "onControlClickListener", "setAvailable", "available", "", "setCurrentBalance", "currentBalance", "", "setDisposed", "disposed", "setHiddenNumber", "hiddenNumber", "setLimit", "limit", "setMaxBalance", "maxBalance", "setName", "name", "setTitular", "titular", "setType", "type", "uiKit_debug"})
public final class CustomCardKt {
    
    @androidx.databinding.BindingAdapter(value = {"customCard_name"})
    public static final void setName(@org.jetbrains.annotations.NotNull()
    com.example.uikit.customCard.CustomCard customCard, @org.jetbrains.annotations.NotNull()
    java.lang.String name) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"customCard_type"})
    public static final void setType(@org.jetbrains.annotations.NotNull()
    com.example.uikit.customCard.CustomCard customCard, @org.jetbrains.annotations.NotNull()
    java.lang.String type) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"customCard_hiddenNumber"})
    public static final void setHiddenNumber(@org.jetbrains.annotations.NotNull()
    com.example.uikit.customCard.CustomCard customCard, @org.jetbrains.annotations.NotNull()
    java.lang.String hiddenNumber) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"customCard_titular"})
    public static final void setTitular(@org.jetbrains.annotations.NotNull()
    com.example.uikit.customCard.CustomCard customCard, boolean titular) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"customCard_limit"})
    public static final void setLimit(@org.jetbrains.annotations.NotNull()
    com.example.uikit.customCard.CustomCard customCard, @org.jetbrains.annotations.NotNull()
    java.lang.String limit) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"customCard_maxBalance"})
    public static final void setMaxBalance(@org.jetbrains.annotations.NotNull()
    com.example.uikit.customCard.CustomCard customCard, int maxBalance) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"customCard_currentBalance"})
    public static final void setCurrentBalance(@org.jetbrains.annotations.NotNull()
    com.example.uikit.customCard.CustomCard customCard, int currentBalance) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"customCard_disposed"})
    public static final void setDisposed(@org.jetbrains.annotations.NotNull()
    com.example.uikit.customCard.CustomCard customCard, @org.jetbrains.annotations.NotNull()
    java.lang.String disposed) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"customCard_available"})
    public static final void setAvailable(@org.jetbrains.annotations.NotNull()
    com.example.uikit.customCard.CustomCard customCard, @org.jetbrains.annotations.NotNull()
    java.lang.String available) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"customCard_optionsListener"})
    public static final void onCardOptionsClick(@org.jetbrains.annotations.NotNull()
    com.example.uikit.customCard.CustomCard customCard, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> listener) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"customCard_activationListener"})
    public static final void onCardActivationToggle(@org.jetbrains.annotations.NotNull()
    com.example.uikit.customCard.CustomCard customCard, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> listener) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"customCard_controlListener"})
    public static final void onControlClickListener(@org.jetbrains.annotations.NotNull()
    com.example.uikit.customCard.CustomCard customCard, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> listener) {
    }
}