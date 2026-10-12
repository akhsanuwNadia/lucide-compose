package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Inbox") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(22.0f,12.0f)
                lineTo(16.0f,12.0f)
                lineTo(14.0f,15.0f)
                lineTo(10.0f,15.0f)
                lineTo(8.0f,12.0f)
                lineTo(2.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.45f,5.11f)
                lineTo(2.0f,12.0f)
                lineTo(2.0f,18.0f)
                curveTo(2.0f,19.10457f,2.8954306f,20.0f,4.0f,20.0f)
                lineTo(20.0f,20.0f)
                curveTo(21.10457f,20.0f,22.0f,19.10457f,22.0f,18.0f)
                lineTo(22.0f,12.0f)
                lineTo(18.55f,5.11f)
                curveTo(18.212269f,4.4303427f,17.518944f,4.000403f,16.76f,4.0f)
                lineTo(7.24f,4.0f)
                curveTo(6.4810557f,4.000403f,5.7877297f,4.430342f,5.45f,5.11f)
                close()
            }
}

public val LucideIcons.All.InboxDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Inbox: ImageVector
    @Composable get() = InboxDefinition.asImageVector()
