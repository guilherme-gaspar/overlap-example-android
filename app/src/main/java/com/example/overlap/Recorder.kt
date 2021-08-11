package com.example.overlap

import android.media.MediaRecorder
import android.os.Environment

/**
 * Created by GUILHERME GASPAR on 11/08/21.
 */
class Recorder {

    private val mediaRecorder = MediaRecorder()

    fun startAudio() {
        mediaRecorder.setAudioSource(MediaRecorder.AudioSource.MIC)
        mediaRecorder.setOutputFormat(MediaRecorder.OutputFormat.THREE_GPP)
        mediaRecorder.setAudioEncoder(MediaRecorder.OutputFormat.AMR_NB)
        mediaRecorder.setOutputFile(OUTPUTFILE)
        mediaRecorder.prepare()
        mediaRecorder.start()
    }

    fun stopAudio() {
        mediaRecorder.stop()
    }

    companion object {
        private const val FILENAME = "myrec.3gp"
        val OUTPUTFILE = "${Environment.getExternalStorageDirectory()}/$FILENAME"
    }

}