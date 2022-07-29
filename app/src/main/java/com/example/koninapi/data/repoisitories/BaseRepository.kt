package com.example.koninapi.data.repoisitories

import androidx.lifecycle.liveData
import com.example.koninapi.utils.Either
import kotlinx.coroutines.Dispatchers
import java.io.IOException

open class BaseRepository {

    protected fun <T> doRequest(request: suspend () -> T) = liveData(Dispatchers.IO) {
        try {
            emit(Either.Right(request()))
        } catch (ioException: IOException) {
            emit(Either.Left(ioException.localizedMessage))
        }
    }
}