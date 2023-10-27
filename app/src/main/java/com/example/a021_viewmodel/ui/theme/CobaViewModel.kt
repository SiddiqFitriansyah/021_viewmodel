package com.example.a021_viewmodel.ui.theme

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.a021_viewmodel.Data.DataForm
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update


class CobaViewModel : ViewModel(){
    var namaUsr : String by mutableStateOf("")
        private set
    var noTlp : String by mutableStateOf("")
        private set
    var jenisKL : String by mutableStateOf("")
        private set

    private val _uiState = MutableStateFlow(DataForm())
    val uiState: StateFlow<DataForm> = _uiState.asStateFlow()

    fun InsertData(namanya:String,teleponnya:String, jenisnya:String){
        namaUsr = namanya;
        noTlp = teleponnya;
        jenisKL = jenisnya;
    }

    fun setJK(plhJK:String){
        _uiState.update{currentState -> currentState.copy (sex = plhJK)}
        }

}