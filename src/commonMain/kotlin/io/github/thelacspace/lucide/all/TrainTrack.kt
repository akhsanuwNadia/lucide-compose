package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TrainTrack") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0f,17.0f)
                lineTo(17.0f,2.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,14.0f)
                lineTo(10.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,11.0f)
                lineTo(13.0f,19.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,8.0f)
                lineTo(16.0f,16.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(11.0f,5.0f)
                lineTo(19.0f,13.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,2.0f)
                lineTo(22.0f,10.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,22.0f)
                lineTo(22.0f,7.0f)
            }
}

public val LucideIcons.All.TrainTrackDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TrainTrack: ImageVector
    @Composable get() = TrainTrackDefinition.asImageVector()
