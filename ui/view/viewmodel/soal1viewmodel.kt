package com.example.week78_0706012310042.ui.view.viewmodel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.week78_0706012310042.data.repository.soal1repository
import com.example.week78_0706012310042.ui.model.responecuaca

sealed class uistate{
    object diam: uistate()
    object tunggu: uistate()
    data class berhasil(var data: responecuaca): uistate()
    data class eror(var pesan: String): uistate()
}
class soal1viewmodel (private var repository: soal1repository): ViewModel(){
private var _uistate = MutableStateFlow<uistate>(uistate.diam)
    var Uistate: StateFlow<uistate> = _uistate
    fun fetchcuaca(kota: String){
        if(kota.isBlank()){
            _uistate.value = uistate.eror("kota kosong")
            return
        }
        viewModelScope.launch {
            _uistate.value = uistate.tunggu
            var res =repository.getWeather(kota.trim())
            _uistate.value = res.fold(
                onSuccess = { uistate.berhasil(it)},
                onFailure = { uistate.eror(it.localizedMessage?:"error")}
            )
        }
    }
}