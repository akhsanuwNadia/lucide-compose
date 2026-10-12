package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TrainTrack") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0,17.0)
                lineTo(17.0,2.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,14.0)
                lineTo(10.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0,11.0)
                lineTo(13.0,19.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,8.0)
                lineTo(16.0,16.0)
            }
            lucidePath(strokeWidth) {
                moveTo(11.0,5.0)
                lineTo(19.0,13.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,2.0)
                lineTo(22.0,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,22.0)
                lineTo(22.0,7.0)
            }
}

public val LucideIcons.All.TrainTrackDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TrainTrack: ImageVector
    @Composable get() = TrainTrackDefinition.asImageVector()
