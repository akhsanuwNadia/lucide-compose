package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ClipboardCheck") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(9.0f,2.0f)
                lineTo(15.0f,2.0f)
                curveTo(15.552285f,2.0f,16.0f,2.4477153f,16.0f,3.0f)
                lineTo(16.0f,5.0f)
                curveTo(16.0f,5.5522847f,15.552285f,6.0f,15.0f,6.0f)
                lineTo(9.0f,6.0f)
                curveTo(8.447715f,6.0f,8.0f,5.5522847f,8.0f,5.0f)
                lineTo(8.0f,3.0f)
                curveTo(8.0f,2.4477153f,8.447715f,2.0f,9.0f,2.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,4.0f)
                lineTo(18.0f,4.0f)
                curveTo(19.10457f,4.0f,20.0f,4.8954306f,20.0f,6.0f)
                lineTo(20.0f,20.0f)
                curveTo(20.0f,21.10457f,19.10457f,22.0f,18.0f,22.0f)
                lineTo(6.0f,22.0f)
                curveTo(4.8954306f,22.0f,4.0f,21.10457f,4.0f,20.0f)
                lineTo(4.0f,6.0f)
                curveTo(4.0f,4.8954306f,4.8954306f,4.0f,6.0f,4.0f)
                lineTo(8.0f,4.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,14.0f)
                lineTo(11.0f,16.0f)
                lineTo(15.0f,12.0f)
            }
}

public val LucideIcons.All.ClipboardCheckDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ClipboardCheck: ImageVector
    @Composable get() = ClipboardCheckDefinition.asImageVector()
