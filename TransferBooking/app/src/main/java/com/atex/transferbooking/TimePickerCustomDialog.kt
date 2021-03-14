package com.atex.transferbooking

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import kotlinx.android.synthetic.main.timepicker_custom_dialog.view.*

class TimePickerCustomDialog: DialogFragment() {

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.timepicker_custom_dialog,container,false)
        rootView.timePicker.setIs24HourView(true)
        rootView.timePicker.hour = 12
        rootView.timePicker.minute = 0
        rootView.timePicker.
        rootView.ok_button.setOnClickListener {
            dismiss()
        }
        return rootView
    }
}