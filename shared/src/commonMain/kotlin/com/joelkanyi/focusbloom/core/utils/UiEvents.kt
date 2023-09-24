package com.joelkanyi.focusbloom.core.utils

sealed class UiEvents {
    data class ShowSnackbar(val message: String) : UiEvents()
    data object Navigation : UiEvents()
    data object NavigateBack : UiEvents()
    data class TimerEventStarted(val time: Long) : UiEvents()
    data object TimerEventFinished : UiEvents()
}
