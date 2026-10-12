package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Hd") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0f,12.0f)
                lineTo(6.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f,15.0f)
                lineTo(10.0f,9.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,14.5f)
                curveTo(14.0f,14.776142f,14.223858f,15.0f,14.5f,15.0f)
                lineTo(15.5f,15.0f)
                curveTo(16.880713f,15.0f,18.0f,13.880712f,18.0f,12.5f)
                lineTo(18.0f,11.5f)
                curveTo(18.0f,10.119288f,16.880713f,9.0f,15.5f,9.0f)
                lineTo(14.5f,9.0f)
                curveTo(14.223858f,9.0f,14.0f,9.223858f,14.0f,9.5f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,15.0f)
                lineTo(6.0f,9.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,5.0f)
                lineTo(20.0f,5.0f)
                lineTo(22.0f,5.0f)
                lineTo(22.0f,19.0f)
                lineTo(20.0f,19.0f)
                lineTo(4.0f,19.0f)
                lineTo(2.0f,19.0f)
                lineTo(2.0f,5.0f)
                lineTo(4.0f,5.0f)
                close()
            }
}

public val LucideIcons.All.HdDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Hd: ImageVector
    @Composable get() = HdDefinition.asImageVector()
