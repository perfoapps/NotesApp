package ca.qc.mtl.perfoapps.notesapp.model

import java.util.*

data class Note(
        var title: String? = null,
        var description: String? = null,
        var url: String? = null,
        val uuid: String? = UUID.randomUUID().toString()) {

    val isEmpty: Boolean
        get() {
            return title.isNullOrEmpty() && description.isNullOrEmpty()
        }
}