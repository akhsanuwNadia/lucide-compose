package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FileQuestionMark") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(6.0f,22.0f)
                curveTo(4.8954306f,22.0f,4.0f,21.10457f,4.0f,20.0f)
                lineTo(4.0f,4.0f)
                curveTo(4.0f,2.8954306f,4.8954306f,2.0f,6.0f,2.0f)
                lineTo(14.0f,2.0f)
                curveTo(14.639365f,1.9989636f,15.252715f,2.2530863f,15.704f,2.7059999f)
                lineTo(19.292f,6.2939997f)
                curveTo(19.74614f,6.745444f,20.00104f,7.3596535f,20.0f,8.0f)
                lineTo(20.0f,20.0f)
                curveTo(20.0f,21.10457f,19.10457f,22.0f,18.0f,22.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,17.0f)
                lineTo(12.01f,17.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.1f,9.0f)
                curveTo(9.595283f,7.635031f,10.997032f,6.8207126f,12.42811f,7.066602f)
                curveTo(13.859187f,7.312492f,14.908734f,8.547996f,14.92f,10.0f)
                curveTo(14.92f,12.0f,11.92f,13.0f,11.92f,13.0f)
            }
}

public val LucideIcons.All.FileQuestionMarkDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FileQuestionMark: ImageVector
    @Composable get() = FileQuestionMarkDefinition.asImageVector()
