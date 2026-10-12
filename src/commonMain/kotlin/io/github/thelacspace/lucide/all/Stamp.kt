package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Stamp") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14.0f,13.0f)
                lineTo(14.0f,8.5f)
                curveTo(14.0f,7.0f,15.0f,7.0f,15.0f,5.0f)
                curveTo(14.992614f,3.3483827f,13.651634f,2.0133865f,12.0f,2.0133865f)
                curveTo(10.348366f,2.0133865f,9.007386f,3.3483827f,9.0f,5.0f)
                curveTo(9.0f,7.0f,10.0f,7.0f,10.0f,8.5f)
                lineTo(10.0f,13.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0f,15.5f)
                curveTo(20.0f,14.119288f,18.880713f,13.0f,17.5f,13.0f)
                lineTo(6.5f,13.0f)
                curveTo(5.119288f,13.0f,4.0f,14.119288f,4.0f,15.5f)
                lineTo(4.0f,17.0f)
                curveTo(4.0f,17.552284f,4.4477153f,18.0f,5.0f,18.0f)
                lineTo(19.0f,18.0f)
                curveTo(19.552284f,18.0f,20.0f,17.552284f,20.0f,17.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,22.0f)
                lineTo(19.0f,22.0f)
            }
}

public val LucideIcons.All.StampDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Stamp: ImageVector
    @Composable get() = StampDefinition.asImageVector()
