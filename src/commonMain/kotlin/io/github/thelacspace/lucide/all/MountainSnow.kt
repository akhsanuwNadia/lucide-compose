package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MountainSnow") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(8.0,3.0)
                lineTo(12.0,11.0)
                lineTo(17.0,6.0)
                lineTo(22.0,21.0)
                lineTo(2.0,21.0)
                lineTo(8.0,3.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(4.139999866485596,15.079999923706055)
                curveTo(6.759999752044678,13.510000228881836,9.379999160766602,13.649999618530273,12.0,15.5)
                curveTo(14.739999771118164,17.440000534057617,17.489999771118164,17.5,20.229999542236328,15.6899995803833)
            }
}

public val LucideIcons.All.MountainSnowDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MountainSnow: ImageVector
    @Composable get() = MountainSnowDefinition.asImageVector()
