@file:Suppress("SpellCheckingInspection")

package io

import model.ExportResult
import model.Feature
import model.Format
import model.Project
import org.w3c.files.File

object VocaloidMidi {
    suspend fun parse(file: File): Project {
        return VsqUtil.getMappedTrackData(file, Format.Midi)
    }

    fun generate(project: Project, features: List<Feature>): ExportResult {
        return VsqUtil.getExportResult(project, features, Format.Midi)
    }
}
