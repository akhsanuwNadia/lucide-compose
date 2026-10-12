package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MicAudioLines") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0,3.0)
                lineTo(10.0,5.341000080108643)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,17.0)
                lineTo(12.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,5.0)
                lineTo(14.0,5.341000080108643)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0,5.0)
                lineTo(18.0,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,10.0)
                lineTo(2.0,13.0)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,10.0)
                lineTo(22.0,13.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,6.0)
                lineTo(6.0,17.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,21.0)
                lineTo(15.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,9.0)
                lineTo(12.0,9.0)
                lineTo(14.0,9.0)
                lineTo(14.0,17.0)
                lineTo(12.0,17.0)
                lineTo(12.0,17.0)
                lineTo(10.0,17.0)
                lineTo(10.0,9.0)
                lineTo(12.0,9.0)
                close()
            }
}

public val LucideIcons.All.MicAudioLinesDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MicAudioLines: ImageVector
    @Composable get() = MicAudioLinesDefinition.asImageVector()
