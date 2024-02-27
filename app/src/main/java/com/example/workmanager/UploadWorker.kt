package com.example.workmanager

import android.content.ContentValues.TAG
import android.content.Context
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.widget.Toast
import androidx.compose.material3.TopAppBar
import androidx.work.Worker
import androidx.work.WorkerParameters

class UploadWorker (appContext: Context, workerParams: WorkerParameters):
    Worker(appContext, workerParams) {

    override fun doWork(): Result {
        // Do the work here--in this case, upload the images.
        Handler(Looper.getMainLooper()).post {
            Log.d(TAG, "work done")
            Toast.makeText(applicationContext, "Work is done", Toast.LENGTH_SHORT).show()
        }


        // Indicate whether the work finished successfully with the Result
        return Result.success()
    }
}