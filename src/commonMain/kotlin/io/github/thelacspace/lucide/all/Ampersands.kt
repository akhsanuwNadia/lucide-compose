package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Ampersands") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0f,17.0f)
                curveTo(5.0f,14.0f,3.0f,10.0f,3.0f,8.0f)
                curveTo(3.0049243f,6.898922f,3.8989108f,6.0089245f,5.0f,6.0089245f)
                curveTo(6.101089f,6.0089245f,6.9950757f,6.898922f,7.0f,8.0f)
                curveTo(7.0f,10.5f,2.0f,10.5f,2.0f,14.0f)
                curveTo(2.0f,15.7f,3.3f,17.0f,5.0f,17.0f)
                curveTo(7.8f,17.0f,10.0f,14.8f,10.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,17.0f)
                curveTo(17.0f,14.0f,15.0f,10.0f,15.0f,8.0f)
                curveTo(15.004924f,6.898922f,15.8989105f,6.0089245f,17.0f,6.0089245f)
                curveTo(18.10109f,6.0089245f,18.995075f,6.898922f,19.0f,8.0f)
                curveTo(19.0f,10.5f,14.0f,10.5f,14.0f,14.0f)
                curveTo(14.0f,15.7f,15.3f,17.0f,17.0f,17.0f)
                curveTo(19.8f,17.0f,22.0f,14.8f,22.0f,12.0f)
            }
}

public val LucideIcons.All.AmpersandsDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Ampersands: ImageVector
    @Composable get() = AmpersandsDefinition.asImageVector()
