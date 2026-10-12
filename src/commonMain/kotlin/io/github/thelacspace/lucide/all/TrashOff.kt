package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TrashOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0f,11.0f)
                lineTo(10.0f,17.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,17.0f)
                lineTo(14.0f,14.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,6.0f)
                lineTo(16.0f,4.0f)
                curveTo(16.0f,2.8954306f,15.104569f,2.0f,14.0f,2.0f)
                lineTo(10.0f,2.0f)
                curveTo(9.384475f,1.9998437f,8.803164f,2.2831225f,8.424f,2.7680001f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0f,6.0f)
                lineTo(19.0f,13.344f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,2.0f)
                lineTo(22.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,6.0f)
                lineTo(11.656f,6.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,6.0f)
                lineTo(6.0f,6.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,6.0f)
                lineTo(5.0f,20.0f)
                curveTo(5.0f,21.10457f,5.8954306f,22.0f,7.0f,22.0f)
                lineTo(17.0f,22.0f)
                curveTo(18.10457f,22.0f,19.0f,21.10457f,19.0f,20.0f)
                lineTo(19.0f,19.0f)
            }
}

public val LucideIcons.All.TrashOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TrashOff: ImageVector
    @Composable get() = TrashOffDefinition.asImageVector()
