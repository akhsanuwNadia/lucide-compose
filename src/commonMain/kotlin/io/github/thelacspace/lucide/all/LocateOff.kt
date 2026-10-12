package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("LocateOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,19.0f)
                lineTo(12.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,2.0f)
                lineTo(12.0f,5.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.89f,13.24f)
                curveTo(19.29646f,10.983372f,18.57196f,8.670748f,16.950605f,7.0493937f)
                curveTo(15.329251f,5.4280396f,13.016627f,4.7035403f,10.759999f,5.1099997f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0f,12.0f)
                lineTo(22.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,12.0f)
                lineTo(5.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,2.0f)
                lineTo(22.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.05f,7.05f)
                curveTo(4.337019f,9.787356f,4.346892f,14.202717f,7.072088f,16.927914f)
                curveTo(9.797284f,19.653109f,14.212645f,19.662983f,16.95f,16.95f)
            }
}

public val LucideIcons.All.LocateOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.LocateOff: ImageVector
    @Composable get() = LocateOffDefinition.asImageVector()
