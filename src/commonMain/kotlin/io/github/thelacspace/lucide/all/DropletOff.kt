package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("DropletOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(18.715f,13.186f)
                curveTo(18.29f,11.858f,17.384f,10.607f,16.0f,9.5f)
                curveTo(14.0f,7.9f,12.5f,5.5f,12.0f,3.0f)
                curveTo(11.8170805f,3.896242f,11.519991f,4.765329f,11.116f,5.586f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,2.0f)
                lineTo(22.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.795f,8.797f)
                curveTo(8.541465f,9.043987f,8.276156f,9.278594f,8.0f,9.5f)
                curveTo(6.0f,11.1f,5.0f,13.0f,5.0f,15.0f)
                curveTo(4.9996724f,18.230492f,7.2100945f,21.041643f,10.3495035f,21.803347f)
                curveTo(13.488914f,22.565048f,16.741838f,21.079447f,18.222f,18.208f)
            }
}

public val LucideIcons.All.DropletOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.DropletOff: ImageVector
    @Composable get() = DropletOffDefinition.asImageVector()
