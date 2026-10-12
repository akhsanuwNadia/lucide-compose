package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MicAudioLines") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0f,3.0f)
                lineTo(10.0f,5.341f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,17.0f)
                lineTo(12.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,5.0f)
                lineTo(14.0f,5.341f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,5.0f)
                lineTo(18.0f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,10.0f)
                lineTo(2.0f,13.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,10.0f)
                lineTo(22.0f,13.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,6.0f)
                lineTo(6.0f,17.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,21.0f)
                lineTo(15.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,9.0f)
                lineTo(12.0f,9.0f)
                lineTo(14.0f,9.0f)
                lineTo(14.0f,17.0f)
                lineTo(12.0f,17.0f)
                lineTo(12.0f,17.0f)
                lineTo(10.0f,17.0f)
                lineTo(10.0f,9.0f)
                lineTo(12.0f,9.0f)
                close()
            }
}

public val LucideIcons.All.MicAudioLinesDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MicAudioLines: ImageVector
    @Composable get() = MicAudioLinesDefinition.asImageVector()
