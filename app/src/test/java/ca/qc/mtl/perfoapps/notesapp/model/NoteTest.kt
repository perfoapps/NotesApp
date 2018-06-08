package ca.qc.mtl.perfoapps.notesapp.model

import org.junit.Test
import org.junit.Assert.*


class NoteTest {
    @Test
    fun newNoteWithDefaultParameters_IsEmpty() {
        val note = Note()
        assertEquals(true, note.isEmpty)
    }

    @Test
    fun newNoteWithBlankTitle_isEmpty() {
        val note = Note(title = "")
        assertEquals(true, note.isEmpty)
    }

    @Test
    fun newNoteWithNonEmptyTitle_isNotEmpty() {
        val note = Note(title = "a simple note")
        assertEquals(false, note.isEmpty)
    }

    @Test
    fun newNoteWithNonEmptyDescription_isNotEmpty() {
        val note = Note(description = "a simple description")
        assertEquals(false, note.isEmpty)
    }
}