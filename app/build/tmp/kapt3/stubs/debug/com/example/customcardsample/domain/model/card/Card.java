package com.example.customcardsample.domain.model.card;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bi\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\u0002\u0010\u0012J\t\u0010(\u001a\u00020\u0003H\u00c6\u0003J\t\u0010)\u001a\u00020\u0011H\u00c6\u0003J\t\u0010*\u001a\u00020\u0005H\u00c6\u0003J\t\u0010+\u001a\u00020\u0007H\u00c6\u0003J\t\u0010,\u001a\u00020\u0003H\u00c6\u0003J\t\u0010-\u001a\u00020\nH\u00c6\u0003J\t\u0010.\u001a\u00020\u0003H\u00c6\u0003J\t\u0010/\u001a\u00020\rH\u00c6\u0003J\t\u00100\u001a\u00020\rH\u00c6\u0003J\t\u00101\u001a\u00020\rH\u00c6\u0003Jm\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u00c6\u0001J\u0013\u00103\u001a\u00020\n2\b\u00104\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00105\u001a\u000206H\u00d6\u0001J\t\u00107\u001a\u00020\u0003H\u00d6\u0001R\u001a\u0010\u000f\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u000e\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0016R\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001aR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\'\u00a8\u00068"}, d2 = {"Lcom/example/customcardsample/domain/model/card/Card;", "", "name", "", "type", "Lcom/example/customcardsample/domain/model/card/CardType;", "number", "Lcom/example/customcardsample/domain/model/card/CardNumber;", "hiddenNumber", "titular", "", "thumbnail", "limit", "", "disposed", "available", "status", "Lcom/example/customcardsample/domain/model/card/CardStatus;", "(Ljava/lang/String;Lcom/example/customcardsample/domain/model/card/CardType;Lcom/example/customcardsample/domain/model/card/CardNumber;Ljava/lang/String;ZLjava/lang/String;DDDLcom/example/customcardsample/domain/model/card/CardStatus;)V", "getAvailable", "()D", "setAvailable", "(D)V", "getDisposed", "setDisposed", "getHiddenNumber", "()Ljava/lang/String;", "getLimit", "getName", "getNumber", "()Lcom/example/customcardsample/domain/model/card/CardNumber;", "getStatus", "()Lcom/example/customcardsample/domain/model/card/CardStatus;", "setStatus", "(Lcom/example/customcardsample/domain/model/card/CardStatus;)V", "getThumbnail", "getTitular", "()Z", "getType", "()Lcom/example/customcardsample/domain/model/card/CardType;", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "app_debug"})
public final class Card {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.customcardsample.domain.model.card.CardType type = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.customcardsample.domain.model.card.CardNumber number = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String hiddenNumber = null;
    private final boolean titular = false;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String thumbnail = null;
    private final double limit = 0.0;
    private double disposed;
    private double available;
    @org.jetbrains.annotations.NotNull()
    private com.example.customcardsample.domain.model.card.CardStatus status;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.customcardsample.domain.model.card.Card copy(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    com.example.customcardsample.domain.model.card.CardType type, @org.jetbrains.annotations.NotNull()
    com.example.customcardsample.domain.model.card.CardNumber number, @org.jetbrains.annotations.NotNull()
    java.lang.String hiddenNumber, boolean titular, @org.jetbrains.annotations.NotNull()
    java.lang.String thumbnail, double limit, double disposed, double available, @org.jetbrains.annotations.NotNull()
    com.example.customcardsample.domain.model.card.CardStatus status) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public Card() {
        super();
    }
    
    public Card(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    com.example.customcardsample.domain.model.card.CardType type, @org.jetbrains.annotations.NotNull()
    com.example.customcardsample.domain.model.card.CardNumber number, @org.jetbrains.annotations.NotNull()
    java.lang.String hiddenNumber, boolean titular, @org.jetbrains.annotations.NotNull()
    java.lang.String thumbnail, double limit, double disposed, double available, @org.jetbrains.annotations.NotNull()
    com.example.customcardsample.domain.model.card.CardStatus status) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.customcardsample.domain.model.card.CardType component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.customcardsample.domain.model.card.CardType getType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.customcardsample.domain.model.card.CardNumber component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.customcardsample.domain.model.card.CardNumber getNumber() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getHiddenNumber() {
        return null;
    }
    
    public final boolean component5() {
        return false;
    }
    
    public final boolean getTitular() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getThumbnail() {
        return null;
    }
    
    public final double component7() {
        return 0.0;
    }
    
    public final double getLimit() {
        return 0.0;
    }
    
    public final double component8() {
        return 0.0;
    }
    
    public final double getDisposed() {
        return 0.0;
    }
    
    public final void setDisposed(double p0) {
    }
    
    public final double component9() {
        return 0.0;
    }
    
    public final double getAvailable() {
        return 0.0;
    }
    
    public final void setAvailable(double p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.customcardsample.domain.model.card.CardStatus component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.customcardsample.domain.model.card.CardStatus getStatus() {
        return null;
    }
    
    public final void setStatus(@org.jetbrains.annotations.NotNull()
    com.example.customcardsample.domain.model.card.CardStatus p0) {
    }
}