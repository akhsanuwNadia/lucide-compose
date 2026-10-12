package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TabletSmartphone") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5.0f,8.0f)
                lineTo(11.0f,8.0f)
                lineTo(13.0f,8.0f)
                lineTo(13.0f,22.0f)
                lineTo(11.0f,22.0f)
                lineTo(5.0f,22.0f)
                lineTo(3.0f,22.0f)
                lineTo(3.0f,8.0f)
                lineTo(5.0f,8.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,4.0f)
                curveTo(5.0f,2.8954306f,5.8954306f,2.0f,7.0f,2.0f)
                lineTo(19.0f,2.0f)
                curveTo(20.10457f,2.0f,21.0f,2.8954306f,21.0f,4.0f)
                lineTo(21.0f,20.0f)
                curveTo(21.0f,21.10457f,20.10457f,22.0f,19.0f,22.0f)
                lineTo(16.6f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,18.0f)
                lineTo(8.01f,18.0f)
            }
}

public val LucideIcons.All.TabletSmartphoneDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TabletSmartphone: ImageVector
    @Composable get() = TabletSmartphoneDefinition.asImageVector()
