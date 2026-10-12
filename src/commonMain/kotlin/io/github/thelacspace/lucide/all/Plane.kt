package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Plane") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(17.8f,19.2f)
                lineTo(16.0f,11.0f)
                lineTo(19.5f,7.5f)
                curveTo(21.0f,6.0f,21.5f,4.0f,21.0f,3.0f)
                curveTo(20.0f,2.5f,18.0f,3.0f,16.5f,4.5f)
                lineTo(13.0f,8.0f)
                lineTo(4.8f,6.2f)
                curveTo(4.3f,6.1f,3.9f,6.2999997f,3.7000003f,6.7f)
                lineTo(3.4000003f,7.2f)
                curveTo(3.2000003f,7.7f,3.3000004f,8.2f,3.7000003f,8.5f)
                lineTo(9.0f,12.0f)
                lineTo(7.0f,15.0f)
                lineTo(4.0f,15.0f)
                lineTo(3.0f,16.0f)
                lineTo(6.0f,18.0f)
                lineTo(8.0f,21.0f)
                lineTo(9.0f,20.0f)
                lineTo(9.0f,17.0f)
                lineTo(12.0f,15.0f)
                lineTo(15.5f,20.3f)
                curveTo(15.8f,20.699999f,16.3f,20.8f,16.8f,20.599998f)
                lineTo(17.3f,20.399998f)
                curveTo(17.699999f,20.099998f,17.9f,19.699997f,17.8f,19.199997f)
                close()
            }
}

public val LucideIcons.All.PlaneDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Plane: ImageVector
    @Composable get() = PlaneDefinition.asImageVector()
