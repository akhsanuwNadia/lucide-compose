package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Rainbow") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(22.0f,17.0f)
                curveTo(21.97538f,11.494609f,17.505445f,7.0446215f,12.0f,7.0446215f)
                curveTo(6.494554f,7.0446215f,2.024621f,11.494609f,2.0f,17.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,17.0f)
                curveTo(6.0147724f,13.696766f,8.6967325f,11.0267725f,12.0f,11.0267725f)
                curveTo(15.3032675f,11.0267725f,17.985228f,13.696766f,18.0f,17.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f,17.0f)
                curveTo(10.004924f,15.898922f,10.8989105f,15.0089245f,12.0f,15.0089245f)
                curveTo(13.1010895f,15.0089245f,13.995076f,15.898922f,14.0f,17.0f)
            }
}

public val LucideIcons.All.RainbowDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Rainbow: ImageVector
    @Composable get() = RainbowDefinition.asImageVector()
