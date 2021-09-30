package com.example.groww.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.example.groww.remote.Resource
import com.example.groww.remote.responses.ResponseModel
import com.example.groww.remote.responses.StockAndMfApi
import com.example.groww.repopsitory.Repository
import kotlinx.coroutines.Dispatchers

class ViewModelGrow(val repo: Repository) : ViewModel() {

    fun fetchingResponse(): LiveData<Resource<ResponseModel>> {
        val livedata = liveData(Dispatchers.IO) {
            val result = repo.getResponseFromAPI()
            emit(result)
        }
        return livedata
    }

    fun getDataFromDB(): LiveData<List<StockAndMfApi>> {
        return repo.getAllDataFromDB()
    }

    fun getDataFromAPI() {
        repo.getRemoteResponseFromAPI()
    }

}