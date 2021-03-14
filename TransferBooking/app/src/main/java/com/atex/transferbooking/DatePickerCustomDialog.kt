package com.atex.transferbooking

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import kotlinx.android.synthetic.main.timepicker_custom_dialog.view.*

class DatePickerCustomDialog: DialogFragment() {

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.datepicker_custom_dialog,container,false)
        rootView.ok_button.setOnClickListener {
            dismiss()
        }
        return rootView
    }
}