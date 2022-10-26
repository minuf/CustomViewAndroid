package com.example.customcardsample.ui.cards;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u00142\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0005H\u0002J\u0006\u0010\u001a\u001a\u00020\fJ\u0006\u0010\u001b\u001a\u00020\fJ<\u0010\u001c\u001a\u00020\u0006*\u00020\u00192\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u00142\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u0014H\u0002R\u001a\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/example/customcardsample/ui/cards/CardsViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_cards", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lcom/example/customcardsample/ui/model/CustomCardData;", "_currentListenerState", "Lcom/example/customcardsample/ui/cards/ListenerState;", "activationToggleListener", "Lkotlin/Function1;", "", "", "cards", "Lkotlinx/coroutines/flow/StateFlow;", "getCards", "()Lkotlinx/coroutines/flow/StateFlow;", "currentListenerState", "getCurrentListenerState", "optionsListener", "Lkotlin/Function0;", "controlListener", "number", "", "fakeGetCardsUseCase", "Lcom/example/customcardsample/domain/model/card/Card;", "fetchCards", "resetListenerState", "toCustomCardData", "app_debug"})
public final class CardsViewModel extends androidx.lifecycle.ViewModel {
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.example.customcardsample.ui.model.CustomCardData>> _cards = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.util.List<com.example.customcardsample.ui.model.CustomCardData>> cards = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.customcardsample.ui.cards.ListenerState> _currentListenerState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.example.customcardsample.ui.cards.ListenerState> currentListenerState = null;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> optionsListener = null;
    private final kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> activationToggleListener = null;
    
    public CardsViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.example.customcardsample.ui.model.CustomCardData>> getCards() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.example.customcardsample.ui.cards.ListenerState> getCurrentListenerState() {
        return null;
    }
    
    private final kotlin.jvm.functions.Function0<kotlin.Unit> controlListener(long number) {
        return null;
    }
    
    public final void resetListenerState() {
    }
    
    public final void fetchCards() {
    }
    
    private final java.util.List<com.example.customcardsample.domain.model.card.Card> fakeGetCardsUseCase() {
        return null;
    }
    
    private final com.example.customcardsample.ui.model.CustomCardData toCustomCardData(com.example.customcardsample.domain.model.card.Card $this$toCustomCardData, kotlin.jvm.functions.Function0<kotlin.Unit> optionsListener, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> activationToggleListener, kotlin.jvm.functions.Function0<kotlin.Unit> controlListener) {
        return null;
    }
}