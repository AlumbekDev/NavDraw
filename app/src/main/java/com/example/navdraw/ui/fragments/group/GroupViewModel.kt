package com.example.navdraw.ui.fragments.group

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class GroupViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is group Fragment"
    }
    val text: LiveData<String> = _text
}