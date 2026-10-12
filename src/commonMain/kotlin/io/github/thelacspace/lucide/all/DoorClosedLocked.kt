package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("DoorClosedLocked") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(19.0f,8.0f)
                lineTo(19.0f,5.0f)
                curveTo(19.0f,3.8954306f,18.10457f,3.0f,17.0f,3.0f)
                lineTo(7.0f,3.0f)
                curveTo(5.8954306f,3.0f,5.0f,3.8954306f,5.0f,5.0f)
                lineTo(5.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,21.0f)
                lineTo(10.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0f,16.0f)
                lineTo(20.0f,14.0f)
                curveTo(19.995075f,12.898922f,19.10109f,12.0089245f,18.0f,12.0089245f)
                curveTo(16.89891f,12.0089245f,16.004925f,12.898922f,16.0f,14.0f)
                lineTo(16.0f,16.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,12.0f)
                lineTo(9.01f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,16.0f)
                lineTo(21.0f,16.0f)
                lineTo(22.0f,16.0f)
                lineTo(22.0f,21.0f)
                lineTo(21.0f,21.0f)
                lineTo(15.0f,21.0f)
                lineTo(14.0f,21.0f)
                lineTo(14.0f,16.0f)
                lineTo(15.0f,16.0f)
                close()
            }
}

public val LucideIcons.All.DoorClosedLockedDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.DoorClosedLocked: ImageVector
    @Composable get() = DoorClosedLockedDefinition.asImageVector()
