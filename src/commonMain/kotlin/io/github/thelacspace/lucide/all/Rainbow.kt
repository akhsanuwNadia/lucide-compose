package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Rainbow") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(22.0,17.0)
                curveTo(21.975379943847656,11.494608879089355,17.50544548034668,7.044621467590332,12.0,7.044621467590332)
                curveTo(6.494554042816162,7.044621467590332,2.02462100982666,11.494608879089355,2.0,17.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,17.0)
                curveTo(6.014772415161133,13.696765899658203,8.696732521057129,11.026772499084473,12.0,11.026772499084473)
                curveTo(15.303267478942871,11.026772499084473,17.985227584838867,13.696765899658203,18.0,17.0)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0,17.0)
                curveTo(10.004923820495605,15.898921966552734,10.898910522460938,15.00892448425293,12.0,15.00892448425293)
                curveTo(13.101089477539062,15.00892448425293,13.995076179504395,15.898921966552734,14.0,17.0)
            }
}

public val LucideIcons.All.RainbowDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Rainbow: ImageVector
    @Composable get() = RainbowDefinition.asImageVector()
