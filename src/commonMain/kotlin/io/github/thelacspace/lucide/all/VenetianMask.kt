package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("VenetianMask") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(18.0f,11.0f)
                curveTo(16.5f,11.0f,15.5f,11.5f,15.0f,13.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,6.0f)
                curveTo(2.8954306f,6.0f,2.0f,6.8954306f,2.0f,8.0f)
                lineTo(2.0f,12.0f)
                curveTo(2.0f,14.761424f,4.2385764f,17.0f,7.0f,17.0f)
                curveTo(8.847711f,17.068825f,10.614537f,17.775555f,12.0f,19.0f)
                curveTo(13.385463f,17.775555f,15.152289f,17.068825f,17.0f,17.0f)
                curveTo(19.761423f,17.0f,22.0f,14.761424f,22.0f,12.0f)
                lineTo(22.0f,8.0f)
                curveTo(22.0f,6.8954306f,21.10457f,6.0f,20.0f,6.0f)
                lineTo(17.0f,6.0f)
                curveTo(15.152289f,6.068825f,13.385463f,6.775555f,12.0f,8.0f)
                curveTo(10.614537f,6.775555f,8.847711f,6.068825f,7.0f,6.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,11.0f)
                curveTo(7.5f,11.0f,8.5f,11.5f,9.0f,13.0f)
            }
}

public val LucideIcons.All.VenetianMaskDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.VenetianMask: ImageVector
    @Composable get() = VenetianMaskDefinition.asImageVector()
