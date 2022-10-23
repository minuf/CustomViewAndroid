package com.example.customcardsample.ui.customCard

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.appcompat.widget.AppCompatToggleButton
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.databinding.BindingAdapter
import com.example.customcardsample.databinding.ViewCustomCardBinding
import com.example.customcardsample.model.card.CardNumber
import com.example.customcardsample.model.card.CardType

class CustomCard @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : ConstraintLayout(context, attrs, defStyleAttr) {

    private val binding: ViewCustomCardBinding

    var name: String? = null
        set(value) {
            field = value
            binding.tvCardName.text = value
        }

    var type: String? = null
        set(value) {
            field = value
            binding.tvCardType.text = value
        }

    var hiddenNumber: String? = null
        set(value) {
            field = value
            binding.tvHiddenCardNumber.text = value
        }

    var titular: Boolean = false
        set(value) {
            field = value
            binding.tvTitular.visibility = if (value) VISIBLE else GONE
        }

    var limit: String? = null
        set(value) {
            field = value
            binding.tvLimitValue.text = value
        }

    var disposed: String? = null
        set(value) {
            field = value
            binding.tvDisposedValue.text = value
        }

    var available: String? = null
        set(value) {
            field = value
            binding.tvAvailableValue.text = value
        }

    var cardOptionsListener: (() -> Unit?)? = null
        set(value) {
            field = value
            binding.ibCardOptions.setOnClickListener {
                field?.invoke()
            }
        }

    var cardActivationToggleListener: ((Boolean) -> Unit?)? = null
        set(value) {
            field = value
            binding.tbOnOff.setOnClickListener {
                field?.invoke((it as AppCompatToggleButton).isChecked)
            }
        }

    var cardControlListener: (() -> Unit?)? = null
        set(value) {
            field = value
            binding.ibCardControl.setOnClickListener {
                field?.invoke()
            }
        }

    init {
        binding = ViewCustomCardBinding.inflate(LayoutInflater.from(context), this)
    }

}

@BindingAdapter("customCard_name")
fun setName(customCard: CustomCard, name: String) {
    customCard.name = name
}

@BindingAdapter("customCard_type")
fun setType(customCard: CustomCard, type: CardType) {
    customCard.type = type.toString()
}

@BindingAdapter("customCard_hiddenNumber")
fun setType(customCard: CustomCard, number: CardNumber) {
    customCard.hiddenNumber = "...${number.value.toString().substring(12, 16)}"
}

@BindingAdapter("customCard_titular")
fun setTitular(customCard: CustomCard, titular: Boolean) {
    customCard.titular = titular
}

@BindingAdapter("customCard_limit")
fun setLimit(customCard: CustomCard, limit: Double) {
    customCard.limit = limit.toString()
}

@BindingAdapter("customCard_disposed")
fun setDisposed(customCard: CustomCard, disposed: Double) {
    customCard.disposed = disposed.toString()
}

@BindingAdapter("customCard_available")
fun setAvailable(customCard: CustomCard, available: Double) {
    customCard.available = available.toString()
}

@BindingAdapter("customCard_optionsListener")
fun onCardOptionsClick(customCard: CustomCard, listener: () -> Unit) {
    customCard.cardOptionsListener = listener
}

@BindingAdapter("customCard_activationListener")
fun onCardActivationToggle(customCard: CustomCard, listener: (Boolean) -> Unit) {
    customCard.cardActivationToggleListener = listener
}

@BindingAdapter("customCard_controlListener")
fun onControlClickListener(customCard: CustomCard, listener: () -> Unit) {
    customCard.cardControlListener = listener
}
